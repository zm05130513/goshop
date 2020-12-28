package com.example.goshopkuang.presenter.category;

import com.example.goshopkuang.component.CommonSubscriber;
import com.example.goshopkuang.interfaces.category.CategoryTabContract;
import com.example.goshopkuang.model.HttpManager;
import com.example.goshopkuang.model.bean.category.SortBean;
import com.example.goshopkuang.presenter.BasePresenter;
import com.example.goshopkuang.utils.RxUtils;

public class CategoryTabPresenter extends BasePresenter<CategoryTabContract.View> implements CategoryTabContract.Presenter {
    /**
     * p层业务逻辑处理
     *
     */
    @Override
    public void categoryTab(String id) {
        addSubscribe(HttpManager.getMyApi().getTabData(id)
        .compose(RxUtils.<SortBean>rxScheduler())
        .subscribeWith(new CommonSubscriber<SortBean>(mView) {
            @Override
            public void onNext(SortBean sortBean) {
                if (mView!=null) {
                    mView.tabDataReturn(sortBean);
                }
            }

        }));
    }

}
