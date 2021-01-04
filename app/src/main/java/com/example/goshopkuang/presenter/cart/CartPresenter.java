package com.example.goshopkuang.presenter.cart;

import com.example.goshopkuang.component.CommonSubscriber;
import com.example.goshopkuang.interfaces.cart.CartContract;
import com.example.goshopkuang.model.HttpManager;
import com.example.goshopkuang.model.bean.goods.CartBean;
import com.example.goshopkuang.presenter.BasePresenter;
import com.example.goshopkuang.utils.RxUtils;


public class CartPresenter extends BasePresenter<CartContract.View> implements CartContract.Presenter{
    /**
     * p层业务逻辑处理
     *
     */

    @Override
    public void cartList(int id) {
        addSubscribe(HttpManager.getMyApi().getCartList(id)
                .compose(RxUtils.<CartBean>rxScheduler())
                .subscribeWith(new CommonSubscriber<CartBean>(mView){

                    @Override
                    public void onNext(CartBean bean) {
                        mView.cartListReturn(bean);
                    }

                }));
    }

    @Override
    public void delGoods(int uid, String productId) {
        addSubscribe(HttpManager.getMyApi().delGoodsFromCart(uid,productId)
                .compose(RxUtils.<CartBean>rxScheduler())
                .subscribeWith(new CommonSubscriber<CartBean>(mView){

                    @Override
                    public void onNext(CartBean bean) {
                        //mView.cartList(bean);
                        mView.cartListReturn(bean);
                    }

                }));
    }

    @Override
    public void updateGoods(int uid,int goodsId, int productId, int id, int num) {
        addSubscribe(HttpManager.getMyApi().updateGoodsFromCart(uid,goodsId,productId,id,num)
                .compose(RxUtils.<CartBean>rxScheduler())
                .subscribeWith(new CommonSubscriber<CartBean>(mView){

                    @Override
                    public void onNext(CartBean bean) {
                        //mView.cartList(bean);
                        mView.cartListReturn(bean);
                    }

                }));
    }
}
