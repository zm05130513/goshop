package com.example.goshopkuang.model.api;


import com.example.goshopkuang.model.bean.category.BrandBean;
import com.example.goshopkuang.model.bean.category.SortBean;
import com.example.goshopkuang.model.bean.goods.CartBean;
import com.example.goshopkuang.model.bean.goods.GoodsDetail;
import com.example.goshopkuang.model.bean.goods.GoodsRelated;
import com.example.goshopkuang.model.bean.home.BrandDetial;
import com.example.goshopkuang.model.bean.home.BrandList;
import com.example.goshopkuang.model.bean.home.HomeBean;
import com.example.goshopkuang.model.bean.home.channel.ChannelGoodsList;
import com.example.goshopkuang.model.bean.topic.DetailBean;
import com.example.goshopkuang.model.bean.topic.RelatedBean;
import com.example.goshopkuang.model.bean.topic.TopicBean;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface MyApi {

    //String baseUrl="https://cdwan.cn/api/";

    @GET("index/index")
    Flowable<HomeBean> getIndexData();

    @GET("catalog/index")
    Flowable<BrandBean> getData();

    @GET("catalog/current")
    Flowable<SortBean> getTabData(@Query("id") String id);

    @GET("topic/list")
    Flowable<TopicBean> getTopic();

    @GET("topic/list")
    Flowable<TopicBean> getTopic(@Query("page") int page);

    @GET("topic/detail")
    Flowable<DetailBean> getTopicData(@Query("id") String id);

    @GET("topic/related")
    Flowable<RelatedBean> getTopicRelated(@Query("id") String id);

    @GET("brand/list")
    Flowable<BrandList> getBrandData();

    @GET("brand/list")
    Flowable<BrandList> getBrandData(@Query("page") int page);

    @GET("brand/detail")
    Flowable<BrandDetial> getBrandDetail(@Query("id") String id);

    @GET("goods/list")
    Flowable<ChannelGoodsList> getChannelData(@Query("categoryId") String id, @Query("page") int page, @Query("size") int size);

    @GET("goods/related")
    Flowable<GoodsRelated> getGoodsRelated(@Query("id") String id);

    @GET("goods/detail")
    Flowable<GoodsDetail> getGoodsDetail(@Query("id") String id);

    //购物车的添加
    @FormUrlEncoded
    @POST("cart/add")
    Flowable<CartBean> postGoodsToCart(@Field("uid") int uid, @Field("goodsId") int goodsId, @Field("productId") int productId, @Field("number") int num);

    //购物车的查询
    @GET("cart/index")
    Flowable<CartBean> getCartList(@Query("uid") int id);

    //数据库的删除
    @FormUrlEncoded
    @POST("cart/delete")
    Flowable<CartBean> delGoodsFromCart(@Field("uid") int uid, @Field("productIds") String productId);

    //更新购物车的数据
    @FormUrlEncoded
    @POST("cart/update")
    Flowable<CartBean> updateGoodsFromCart(@Field("uid") int uid, @Field("goodsId") int goodId, @Field("productId") int productId, @Field("id") int id, @Field("number") int num);
}
