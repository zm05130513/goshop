package com.example.goshopkuang.presenter.home;

import com.example.goshopkuang.component.CommonSubscriber;
import com.example.goshopkuang.interfaces.home.HomeContract;
import com.example.goshopkuang.model.HttpManager;
import com.example.goshopkuang.model.bean.home.HomeBean;
import com.example.goshopkuang.presenter.BasePresenter;
import com.example.goshopkuang.utils.RxUtils;

public class HomePresenter extends BasePresenter<HomeContract.View> implements HomeContract.Presenter {
    @Override
    public void home() {
        addSubscribe(HttpManager.getMyApi().getIndexData()
                .compose(RxUtils.<HomeBean>rxScheduler())
                .subscribeWith(new CommonSubscriber<HomeBean>(mView) {
                    @Override
                    public void onNext(HomeBean homeBean) {
                        if (mView!=null) {
                            mView.homeDataReturn(homeBean);
                        }
                    }
                }));
    }
}
