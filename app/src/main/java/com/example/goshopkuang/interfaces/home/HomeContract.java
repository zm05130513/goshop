package com.example.goshopkuang.interfaces.home;

import com.example.goshopkuang.interfaces.IBaseView;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.model.bean.home.BrandList;
import com.example.goshopkuang.model.bean.home.HomeBean;

public interface HomeContract {
    //主页的接口定义
    interface View extends IBaseView{
        void homeDataReturn(HomeBean msg);
    }
    //主页的p层接口
    interface Presenter extends IPresenter<View>{
        void home();
    }

    interface BrandView extends IBaseView{
        void getBrandListReturn(BrandList data);
    }
    interface BPresenter extends IPresenter<BrandView> {
        void brandList();
        void brandList(int page);
    }

}
