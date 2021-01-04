package com.example.goshopkuang.interfaces.cart;

import com.example.goshopkuang.interfaces.IBaseView;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.model.bean.goods.CartBean;

public interface CartContract {
    //主页的接口定义
    interface View extends IBaseView {
        void cartListReturn(CartBean bean);
        //void cartList(CartBean bean);

    }
    //主页的p层接口
    interface Presenter extends IPresenter<View> {
        void cartList(int id);
        void delGoods(int uid,String productId);
        void updateGoods(int uid,int goodsId,int productId,int id,int num);

    }

}
