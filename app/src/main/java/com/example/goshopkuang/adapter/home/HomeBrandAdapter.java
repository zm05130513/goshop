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
import com.example.goshopkuang.model.bean.home.BrandListBean;


import java.util.ArrayList;
import java.util.List;

public class HomeBrandAdapter extends RecyclerView.Adapter<HomeBrandAdapter.ItemHolder> {
    private List<BrandListBean> list=new ArrayList<>();

    public HomeBrandAdapter(List<BrandListBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout
                .layout_brand_item, viewGroup, false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, final int i) {
        Glide.with(holder.itemView.getContext()).load(list.get(i).getNew_pic_url()).into(holder.iv);
        holder.name.setText(list.get(i).getName());
        holder.price.setText(list.get(i).getFloor_price()+"元起");
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

    class ItemHolder extends RecyclerView.ViewHolder{

        ImageView iv;
        TextView name;
        TextView price;
        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.iv_new_pic);
            name=itemView.findViewById(R.id.tv_name);
            price=itemView.findViewById(R.id.tv_price);

        }
    }
    private ItemClickListener clickListener;

    public void setClickListener(ItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public interface ItemClickListener{
        void onClick(int position,BrandListBean bean);
    }
}
