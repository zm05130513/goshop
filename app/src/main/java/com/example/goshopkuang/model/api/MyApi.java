package com.example.goshopkuang.model.api;



import com.example.goshopkuang.model.bean.home.HomeBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;

public interface MyApi {

    //String baseUrl="https://cdwan.cn/api/";

    @GET("index/index")
    Flowable<HomeBean> getIndexData();

}
