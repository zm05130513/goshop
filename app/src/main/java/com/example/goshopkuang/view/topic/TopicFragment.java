package com.example.goshopkuang.view.topic;

import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.Fragment;

import com.example.goshopkuang.R;
import com.example.goshopkuang.base.BaseFragment;
import com.example.goshopkuang.interfaces.topic.TopicContract;

public class TopicFragment extends BaseFragment<TopicContract.View>implements TopicContract.Presenter{
    @BindView(R.id.rv_topic_topic)
    RecyclerView rvTopicTopic;
    @BindView(R.id.btn_previous)
    TextView btnPrevious;
    @BindView(R.id.btn_next)
    TextView btnNext;
    Unbinder unbinder;

    @Override
    protected int getLayout() {
        return R.layout.fragment_topic;
    }

    @Override
    protected void initView(View view) {

    }
}