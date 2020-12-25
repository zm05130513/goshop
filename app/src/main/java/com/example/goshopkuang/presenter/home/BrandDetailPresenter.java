package com.example.goshopkuang.presenter.home;

import com.example.goshopkuang.component.CommonSubscriber;
import com.example.goshopkuang.interfaces.home.HomeContract;
import com.example.goshopkuang.model.HttpManager;
import com.example.goshopkuang.model.bean.home.BrandDetial;
import com.example.goshopkuang.presenter.BasePresenter;
import com.example.goshopkuang.utils.RxUtils;


public class BrandDetailPresenter extends BasePresenter<HomeContract.BrandDetailView> implements HomeContract.BDPresenter {
    /**
     * p层业务逻辑处理
     *
     */
    @Override
    public void brandDetail(String id) {
        addSubscribe(HttpManager.getMyApi().getBrandDetail(id)
        .compose(RxUtils.<BrandDetial>rxScheduler())
        .subscribeWith(new CommonSubscriber<BrandDetial>(mView) {
            @Override
            public void onNext(BrandDetial data) {
                if (mView!=null) {
                    mView.getBrandDetailReturn(data);
                }
            }

        }));
    }

}
