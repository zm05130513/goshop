package com.example.goshopkuang.adapter.topic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.goshopkuang.R;
import com.example.goshopkuang.adapter.HomeHotAdapter;
import com.example.goshopkuang.model.bean.topic.TopicBean;

import java.util.ArrayList;
import java.util.List;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.ItemHolder> {
    private Context context;
    private List<TopicBean.DataBeanX.DataBean> list = new ArrayList<>();
    private Object ViewGroup;

    public TopicAdapter(Context context,List<TopicBean.DataBeanX.DataBean> list){
    this.context=context;
    this.list=list;
}

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_topic_item2, viewGroup, false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int i) {
        Glide.with(context).load(list.get(i).getScene_pic_url()).into(holder.iv);
        holder.name.setText(list.get(i).getTitle());
        holder.desc.setText(list.get(i).getSubtitle());
        holder.price.setText(list.get(i).getPrice_info()+"元起");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickListener!=null){
                    clickListener.onClick(i,list.get(i));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView name;
        TextView desc;
        TextView price;
        public ItemHolder(View view) {
            super(view);
            iv=view.findViewById(R.id.iv_new_pic2);
            name=view.findViewById(R.id.tv_name2);
            desc=view.findViewById(R.id.tv_desc2);
            price=view.findViewById(R.id.tv_price2);
        }
    }

    private ItemClickListener clickListener;

    public void setClickListener(ItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public interface ItemClickListener{
        void onClick(int position,TopicBean.DataBeanX.DataBean data);
    }

}
