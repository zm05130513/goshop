package com.example.goshopkuang.interfaces.home;

import com.example.goshopkuang.interfaces.IBaseView;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.model.bean.goods.CartBean;
import com.example.goshopkuang.model.bean.goods.GoodsDetail;
import com.example.goshopkuang.model.bean.goods.GoodsRelated;
import com.example.goshopkuang.model.bean.home.BrandDetial;
import com.example.goshopkuang.model.bean.home.BrandList;
import com.example.goshopkuang.model.bean.home.HomeBean;
import com.example.goshopkuang.model.bean.home.channel.DataBean;

import java.util.List;

public interface HomeContract {
    //主页的接口定义
    interface View extends IBaseView{
        void homeDataReturn(HomeBean msg);
    }
    //主页的p层接口
    interface Presenter extends IPresenter<View>{
        void home();
    }

    interface BrandView extends IBaseView{
        void getBrandListReturn(BrandList data);
    }
    interface BPresenter extends IPresenter<BrandView> {
        void brandList();
        void brandList(int page);
    }


    interface BrandDetailView extends IBaseView{
        void getBrandDetailReturn(BrandDetial data);
    }
    interface BDPresenter extends IPresenter<BrandDetailView> {
        void brandDetail(String id);
    }

    interface ChannelView extends IBaseView{
        void getChannelReturn(List<DataBean> data);
    }
    interface ChannelPresenter extends IPresenter<ChannelView> {
        void channelList(String id, int page, int size);
    }

    interface GoodsView extends IBaseView{
        void getGoodsDetailReturn(GoodsDetail data);
        void getGoodsRelatedReturn(GoodsRelated data);
        void postGoodsToCart(CartBean bean);

    }
    interface GoodPresenter extends IPresenter<GoodsView> {
        void getGoodsDetail(String id);
        void getGoodsRelated(String id);
        void goodsToCart(int uid, int goodsId, int productId, int num);
    }
}
