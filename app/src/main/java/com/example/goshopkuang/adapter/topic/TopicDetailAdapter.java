package com.example.goshopkuang.adapter.topic;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.goshopkuang.R;
import com.example.goshopkuang.base.adapter.BaseAdapter;

import java.util.List;

public class TopicDetailAdapter extends BaseAdapter {


    public TopicDetailAdapter(List mDatas) {
        super(mDatas);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_topic_info_pic;
    }

    @Override
    protected void bindData(BaseViewHolder holder, int position, Object o) {
        String url =(String) mDatas.get(position);
        ImageView iv =(ImageView) holder.getView(R.id.iv_topic_pic);
        Glide.with(mContext).load("https:"+url).placeholder(R.mipmap.ic_launcher).into(iv);
    }

}
