package com.example.goshopkuang.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.goshopkuang.R;
import com.example.goshopkuang.model.bean.home.CategoryListBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeCategoryAdapter extends RecyclerView.Adapter<HomeCategoryAdapter.ItemHolder> {

    private List<CategoryListBean.GoodsListBean> list = new ArrayList<>();

    public HomeCategoryAdapter(List<CategoryListBean.GoodsListBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout
                        .layout_category_item, viewGroup, false);

        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, final int i) {
        Glide.with(holder.itemView.getContext()).load(list.get(i).getList_pic_url()).into(holder
                .iv);
        int length = list.get(i).getName().length();
        if (length < 13) {
            holder.name.setText(list.get(i).getName());
        } else {
            holder.name.setText(list.get(i).getName().substring(0, 13));
        }
        holder.price.setText("￥" + list.get(i).getRetail_price());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickListener!=null) {
                    clickListener.onClick(i,list.get(i));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class ItemHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_new_pic)
        ImageView iv;
        @BindView(R.id.tv_name)
        TextView name;
        @BindView(R.id.tv_price)
        TextView price;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
    private ItemClickListener clickListener;

    public void setClickListener(ItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public interface ItemClickListener{
        void onClick(int position,CategoryListBean.GoodsListBean data);
    }
}
