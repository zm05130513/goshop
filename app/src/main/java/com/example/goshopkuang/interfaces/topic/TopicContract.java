package com.example.goshopkuang.interfaces.topic;

import com.example.goshopkuang.interfaces.IBaseView;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.model.bean.topic.DetailBean;
import com.example.goshopkuang.model.bean.topic.TopicBean;
import com.example.goshopkuang.model.bean.topic.RelatedBean;
public interface TopicContract {
    //主页的接口定义
    interface View extends IBaseView {
        void topicDataReturn(TopicBean msg);
    }

    //主页的p层接口
    interface Presenter extends IPresenter<View> {
        void topic();
        void topic(int page);
    }

    interface InfoView extends IBaseView {
        void topicDetailReturn(DelailBean bean);
        void topicRelatedReturn(RelatedBean bean);

    }
    interface InfoPresenter extends IPresenter<InfoView> {
        void topicDetail(String id);
        void topicRelated(String id);
    }

}
