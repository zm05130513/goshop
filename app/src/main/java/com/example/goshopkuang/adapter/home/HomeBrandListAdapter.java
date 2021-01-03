package com.example.goshopkuang.adapter.home;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.goshopkuang.R;
import com.example.goshopkuang.model.bean.home.BrandList;


import java.util.ArrayList;
import java.util.List;

public class HomeBrandListAdapter extends RecyclerView.Adapter<HomeBrandListAdapter.ItemHolder> {
    private List<BrandList.DataBeanX.DataBean> list = new ArrayList<>();

    public HomeBrandListAdapter(List<BrandList.DataBeanX.DataBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout
                .layout_brandlist_item, viewGroup, false);

        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ItemHolder holder, final int i) {
        final BrandList.DataBeanX.DataBean bean = list.get(i);
        Glide.with(holder.itemView.getContext()).load(bean.getApp_list_pic_url()).into
                (holder.iv);
        holder.title.setText(bean.getName()+" | "+bean.getFloor_price()+"元起");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickListener!=null) {
                    clickListener.onClick(i,bean);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class ItemHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView iv;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv_brand_pic);
            title = itemView.findViewById(R.id.tv_brand_list);
        }
    }

    private ItemClickListener clickListener;

    public void setClickListener(ItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public interface ItemClickListener{
        void onClick(int position,BrandList.DataBeanX.DataBean bean);
    }
}
