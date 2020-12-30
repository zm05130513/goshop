package com.example.goshopkuang.view.topic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.goshopkuang.R;
import com.example.goshopkuang.adapter.topic.TopicDetailAdapter;
import com.example.goshopkuang.adapter.topic.TopicRelatedAdapter;
import com.example.goshopkuang.base.BaseActivity;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.interfaces.topic.TopicContract;
import com.example.goshopkuang.model.bean.topic.DetailBean;
import com.example.goshopkuang.model.bean.topic.RelatedBean;
import com.example.goshopkuang.presenter.topic.TopicDetailPresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class TopicInfoActivity extends BaseActivity implements TopicContract.InfoView {

    @BindView(R.id.rv_topic_detail)
    RecyclerView rvTopicInfo;

    @BindView(R.id.rv_topic_relate)
    RecyclerView rvTopicRelate;
    private String id;

    private ArrayList<String> list;
    private TopicDetailAdapter topicDetailAdapter;
    private List<RelatedBean.DataBean> data;
    private TopicRelatedAdapter topicRelatedAdapter;


    @Override
    protected int getLayout() {
        return R.layout.activity_topic_info;
    }

    @Override
    protected void initView() {
        Intent intent = getIntent();
        id = intent.getStringExtra("id");
        getTopicDetail();
        getTopicRelated();
    }

    private void getTopicDetail() {
        list = new ArrayList<>();
        rvTopicInfo.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getTopicRelated() {
        data = new ArrayList<>();
        rvTopicRelate.setLayoutManager(new LinearLayoutManager(this));


    }

    @Override
    protected void initData() {
        ((TopicDetailPresenter) presenter).topicDetail(id);
        ((TopicDetailPresenter) presenter).topicRelated(id);
    }

    @Override
    protected IPresenter initPresenter() {
        return new TopicDetailPresenter();
    }

    @Override
    public void topicDetailReturn(DetailBean bean) {
        String content = bean.getData().getContent();
        String[] split = content.split("\">");
        for (int i = 0; i < split.length; i++) {
            String substring = split[i].substring(split[i].length() - 60, split[i].length());
            list.add(substring);
        }

    }

    @Override
    public void topicRelatedReturn(RelatedBean bean) {
        data.addAll(bean.getData());

    }

    @Override
    public void showErrMsg(String err) {
        Toast.makeText(this, err, Toast.LENGTH_SHORT).show();
    }
}