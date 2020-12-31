package com.example.goshopkuang.adapter.topic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.goshopkuang.R;
import com.example.goshopkuang.model.bean.topic.RelatedBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TopicRelatedAdapter extends RecyclerView.Adapter<TopicRelatedAdapter.ItemHolder> {
    private List<RelatedBean.DataBean> list=new ArrayList<>();
    public TopicRelatedAdapter(List<RelatedBean.DataBean> list){
        this.list=list;
    }
    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_topic_item_relate, viewGroup, false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(list.get(position).getScene_pic_url())
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.ivNewPic);
        holder.tvName.setText(list.get(position).getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickListener!=null){
                    clickListener.onClick(position,list.get(position));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_new_pic)
        ImageView ivNewPic;
        @BindView(R.id.tv_name)
        TextView tvName;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
    public ItemClickListener clickListener;

    public void setClickListener(ItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public interface ItemClickListener{
        void onClick(int position,RelatedBean.DataBean data);
    }
}
