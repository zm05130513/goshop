package com.example.goshopkuang.adapter.category;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.goshopkuang.R;
import com.example.goshopkuang.model.bean.category.SortBean;
import com.example.goshopkuang.view.home.ChannelDataActivity;

import java.util.List;

public class SortAdapter extends RecyclerView.Adapter<SortAdapter.ItemHolder> {
    private String TAG = "tag";

    private List<SortBean.DataBean.CurrentCategoryBean.SubCategoryListBean> list;

    public SortAdapter(List<SortBean.DataBean.CurrentCategoryBean.SubCategoryListBean> list) {

        this.list = list;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.goods_sort_item,
                viewGroup, false);

        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, final int position) {

        Glide.with(holder.itemView.getContext()).load(list.get(position).getWap_banner_url())
                .into(holder.iv);
        holder.name.setText(list.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = list.get(position).getId();
                Log.i(TAG, "onClick: 跳转页面====mid=="+id);
                Intent intent = new Intent(holder.iv.getContext(), ChannelDataActivity.class);
                intent.putExtra("id",id);
                holder.iv.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ItemHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView name;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv_goodsPic);
            name = itemView.findViewById(R.id.tv_goodsName);

        }
    }
}
