package com.example.goshopkuang.interfaces.category;


import com.example.goshopkuang.interfaces.IBaseView;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.model.bean.category.SortBean;

public interface CategoryTabContract {

    //主页的接口定义
    interface View extends IBaseView {
        void tabDataReturn(SortBean msg);

    }

    //主页的p层接口
    interface Presenter extends IPresenter<View> {
        void categoryTab(String id);
    }


}
