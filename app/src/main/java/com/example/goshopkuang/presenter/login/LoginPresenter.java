package com.example.goshopkuang.presenter.login;

import com.example.goshopkuang.component.CommonSubscriber;
import com.example.goshopkuang.interfaces.login.LoginContract;
import com.example.goshopkuang.model.HttpManager;
import com.example.goshopkuang.model.bean.login.UserBean;
import com.example.goshopkuang.presenter.BasePresenter;
import com.example.goshopkuang.utils.RxUtils;

public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter {
    @Override
    public void login(String username, String pw) {
        addSubscribe(HttpManager.getTestApi().login(username,pw)
        .compose(RxUtils.<UserBean>rxScheduler())
        .subscribeWith(new CommonSubscriber<UserBean>(mView) {
            @Override
            public void onNext(UserBean bean) {
                mView.loginReturn(bean);
            }
        }));
    }
}
