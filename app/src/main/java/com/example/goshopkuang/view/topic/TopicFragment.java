package com.example.goshopkuang.view.topic;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goshopkuang.ItemSpace;
import com.example.goshopkuang.R;
import com.example.goshopkuang.adapter.topic.TopicAdapter;
import com.example.goshopkuang.base.BaseFragment;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.interfaces.topic.TopicContract;
import com.example.goshopkuang.model.bean.topic.TopicBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;

public class TopicFragment extends BaseFragment implements TopicContract.View {
    @BindView(R.id.rv_topic_topic)
    RecyclerView rvTopicTopic;
    @BindView(R.id.btn_previous)
    TextView btnPrevious;
    @BindView(R.id.btn_next)
    TextView btnNext;
    Unbinder unbinder;
    List<TopicBean.DataBeanX.DataBean> list;
    private TopicAdapter topicAdapter;


    @Override
    protected int getLayout() {
        return R.layout.fragment_topic;
    }

    @Override
    protected void initView(View view) {

        btnPrevious.setSelected(true);
        btnNext.setSelected(false);
        list = new ArrayList<>();
        rvTopicTopic.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvTopicTopic.addItemDecoration(new ItemSpace(20));
        topicAdapter = new TopicAdapter(getActivity(), list);
        rvTopicTopic.setAdapter(topicAdapter);


    }


    @Override
    protected void initData() {

    }

    @Override
    protected IPresenter createPresenter() {
        return null;
    }

    @Override
    public void showErrMsg(String err) {

    }

    @Override
    public void topicDataReturn(TopicBean msg) {

    }
}