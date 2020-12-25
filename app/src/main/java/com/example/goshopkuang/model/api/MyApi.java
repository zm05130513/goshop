package com.example.goshopkuang.model.api;



import com.example.goshopkuang.model.bean.HomeBean;

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

}
