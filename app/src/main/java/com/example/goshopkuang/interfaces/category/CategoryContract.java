package com.example.goshopkuang.interfaces.category;

import com.example.goshopkuang.interfaces.IBaseView;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.model.bean.category.CategoryListBean;

import java.util.List;

public interface CategoryContract {
    //主页的接口定义
    interface View extends IBaseView {
        void categoryDataReturn(List<CategoryListBean> msg);
        //void showErrMsg(String err);
    }

    //主页的p层接口
    interface Presenter extends IPresenter<View> {
        void category();
    }
}
