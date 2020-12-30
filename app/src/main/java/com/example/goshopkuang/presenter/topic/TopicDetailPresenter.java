package com.example.goshopkuang.presenter.topic;


import com.example.goshopkuang.component.CommonSubscriber;
import com.example.goshopkuang.interfaces.topic.TopicContract;
import com.example.goshopkuang.model.HttpManager;
import com.example.goshopkuang.model.bean.topic.DetailBean;
import com.example.goshopkuang.model.bean.topic.RelatedBean;
import com.example.goshopkuang.presenter.BasePresenter;
import com.example.goshopkuang.utils.RxUtils;

public class TopicDetailPresenter extends BasePresenter<TopicContract.InfoView> implements TopicContract.InfoPresenter{
    /**
     * p层业务逻辑处理
     *
     */
    @Override
    public void topicDetail(String id) {
        addSubscribe(HttpManager.getMyApi().getTopicData(id)
        .compose(RxUtils.<DetailBean>rxScheduler())
        .subscribeWith(new CommonSubscriber<DetailBean>(mView){

            @Override
            public void onNext(DetailBean bean) {
                mView.topicDetailReturn(bean);
            }

        }));
    }

    @Override
    public void topicRelated(String id) {
        addSubscribe(HttpManager.getMyApi().getTopicRelated(id)
                .compose(RxUtils.<RelatedBean>rxScheduler())
                .subscribeWith(new CommonSubscriber<RelatedBean>(mView){

                    @Override
                    public void onNext(RelatedBean bean) {
                        RelatedBean bean1 = bean;
                        mView.topicRelatedReturn(bean1);
                    }

                }));
    }


}
