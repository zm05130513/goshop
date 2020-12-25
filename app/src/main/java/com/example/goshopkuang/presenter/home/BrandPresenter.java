package com.example.goshopkuang.presenter.home;

import com.example.goshopkuang.interfaces.home.HomeContract;
import com.example.goshopkuang.model.HttpManager;
import com.example.goshopkuang.presenter.BasePresenter;

public class BrandPresenter extends BasePresenter<HomeContract.BrandView> implements HomeContract.BPresenter {
    @Override
    public void brandList() {
       // addSubscribe(HttpManager.getMyApi());
    }

    @Override
    public void brandList(int page) {

    }
}
