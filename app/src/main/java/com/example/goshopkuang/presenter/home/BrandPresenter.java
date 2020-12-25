package com.example.goshopkuang.presenter.home;

import com.example.goshopkuang.component.CommonSubscriber;
import com.example.goshopkuang.interfaces.home.HomeContract;
import com.example.goshopkuang.model.HttpManager;
import com.example.goshopkuang.model.bean.home.BrandList;
import com.example.goshopkuang.presenter.BasePresenter;
import com.example.goshopkuang.utils.RxUtils;

public class BrandPresenter extends BasePresenter<HomeContract.BrandView> implements HomeContract.BPresenter {
    @Override
    public void brandList() {
        addSubscribe(HttpManager.getMyApi().getBrandData()
        .compose(RxUtils.<BrandList>rxScheduler())
        .subscribeWith(new CommonSubscriber<BrandList>(mView) {
            @Override
            public void onNext(BrandList data) {
                if (mView!=null){
                    mView.getBrandListReturn(data);
                }
            }
        }));
    }

    @Override
    public void brandList(int page) {
        addSubscribe(HttpManager.getMyApi().getBrandData(page)
        .compose(RxUtils.<BrandList>rxScheduler())
        .subscribeWith(new CommonSubscriber<BrandList>(mView) {
            @Override
            public void onNext(BrandList data) {
                if (mView!=null){
                    mView.getBrandListReturn(data);
                }
            }
        }));
    }
}
