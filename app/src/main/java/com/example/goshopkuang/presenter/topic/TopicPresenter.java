package com.example.goshopkuang.presenter.topic;

import com.example.goshopkuang.component.CommonSubscriber;
import com.example.goshopkuang.interfaces.topic.TopicContract;
import com.example.goshopkuang.model.HttpManager;
import com.example.goshopkuang.model.bean.topic.TopicBean;
import com.example.goshopkuang.presenter.BasePresenter;
import com.example.goshopkuang.utils.RxUtils;

public class TopicPresenter extends BasePresenter<TopicContract.View> implements TopicContract.Presenter{
    /**
     * p层业务逻辑处理
     *
     */
    @Override
    public void topic() {
        addSubscribe(HttpManager.getMyApi().getTopic()
                .compose(RxUtils.<TopicBean>rxScheduler())
                .subscribeWith(new CommonSubscriber<TopicBean>(mView){

                    @Override
                    public void onNext(TopicBean topicBean) {
                        mView.topicDataReturn(topicBean);
                    }

                }));
    }

    @Override
    public void topic(int page) {
        addSubscribe(HttpManager.getMyApi().getTopic(page)
                .compose(RxUtils.<TopicBean>rxScheduler())
                .subscribeWith(new CommonSubscriber<TopicBean>(mView){

                    @Override
                    public void onNext(TopicBean topicBean) {
                        mView.topicDataReturn(topicBean);
                    }

                }));
    }
}
