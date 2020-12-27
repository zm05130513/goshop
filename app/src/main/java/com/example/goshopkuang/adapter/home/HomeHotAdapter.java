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
import com.example.goshopkuang.model.bean.home.HotGoodsListBean;

import java.util.ArrayList;
import java.util.List;

public class HomeHotAdapter extends RecyclerView.Adapter<HomeHotAdapter.ItemHolder> {
    private List<HotGoodsListBean> list=new ArrayList<>();

    public HomeHotAdapter(List<HotGoodsListBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = null;
        if (viewType==1) {

            view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout
                    .layout_title_item, viewGroup, false);
        } else {
            view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout
                    .layout_hot_item, viewGroup, false);
        }
        return new ItemHolder(view,viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull final ItemHolder holder, final int i) {
        int viewType = getItemViewType(i);
        if (viewType==1) {
            holder.title.setText("人气推荐");
            holder.title.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  //  Intent intent = new Intent(holder.itemView.getContext(), HotShowActivity.class);
                   // holder.itemView.getContext().startActivity(intent);
                }
            });
        } else {
            Glide.with(holder.itemView.getContext()).load(list.get(i-1).getList_pic_url()).into(holder.iv);
            holder.name.setText(list.get(i-1).getName());
            holder.desc.setText(list.get(i-1).getGoods_brief());
            holder.price.setText("￥"+list.get(i-1).getRetail_price());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (clickListener!=null) {
                        clickListener.onClick(i-1,list.get(i-1));
                    }
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return list.size()+1;
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0) {
            return 1;
        } else {
            return 2;
        }
    }

    class ItemHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView iv;
        TextView name;
        TextView desc;
        TextView price;
        public ItemHolder(@NonNull View itemView,int viewType) {
            super(itemView);
            if (viewType==1) {
                title=itemView.findViewById(R.id.tv_title);
            } else {
                iv=itemView.findViewById(R.id.iv_new_pic);
                name=itemView.findViewById(R.id.tv_name);
                desc=itemView.findViewById(R.id.tv_desc);
                price=itemView.findViewById(R.id.tv_price);
            }

        }
    }

    private ItemClickListener clickListener;

    public void setClickListener(ItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public interface ItemClickListener{
        void onClick(int position,HotGoodsListBean data);
    }
}
