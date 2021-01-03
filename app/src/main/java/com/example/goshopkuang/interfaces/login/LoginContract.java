package com.example.goshopkuang.interfaces.login;

import com.example.goshopkuang.interfaces.IBaseView;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.model.bean.login.UserBean;

public interface LoginContract {
    //登陆放回的接口
    interface View extends IBaseView{
        void loginReturn(UserBean bean);
    }
    //登录的p层
    interface Presenter extends IPresenter<View> {
        void login(String username, String pw);
    }
}
