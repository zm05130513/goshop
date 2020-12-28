package com.example.goshopkuang.presenter.category;


import com.example.goshopkuang.component.CommonSubscriber;
import com.example.goshopkuang.interfaces.category.CategoryContract;
import com.example.goshopkuang.model.HttpManager;
import com.example.goshopkuang.model.bean.category.BrandBean;
import com.example.goshopkuang.presenter.BasePresenter;
import com.example.goshopkuang.utils.RxUtils;

public class CategoryPresenter extends BasePresenter<CategoryContract.View> implements CategoryContract.Presenter {
    /**
     * p层业务逻辑处理
     *
     */
    @Override
    public void category() {
        addSubscribe(HttpManager.getMyApi().getData()
        .compose(RxUtils.<BrandBean>rxScheduler())
        .subscribeWith(new CommonSubscriber<BrandBean>(mView) {
            @Override
            public void onNext(BrandBean brandBean) {
                if (mView!=null) {
                    mView.categoryDataReturn(brandBean.getData().getCategoryList());
                }
            }

        }));
    }

}
