package com.example.goshopkuang.adapter.topic;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TopicDetailAdapter extends RecyclerView.Adapter<TopicDetailAdapter.ItemView> {
    @NonNull
    @Override
    public ItemView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemView holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ItemView extends RecyclerView.ViewHolder {
        public ItemView(@NonNull View itemView) {
            super(itemView);
        }
    }
}
