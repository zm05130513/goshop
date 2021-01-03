package com.example.goshopkuang.model.api;


import com.example.goshopkuang.model.bean.LoginInfo;
import com.example.goshopkuang.model.bean.login.UserBean;

import io.reactivex.Flowable;
import okhttp3.RequestBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface TestApi {

    //String test_url = "https://mall.tsingglobal.cn/";
    // String test_url = "http://yun918.cn/study/public/index.php/";
    String test_url = "https://cdplay.cn/api/auth/";

    // @POST("login")
    // @Multipart
    //  Flowable<UserBean> login(@Part("email") RequestBody email, @Part("passWord") RequestBody pw);
//登录的接口
    @POST("login")
    @FormUrlEncoded
    Flowable<UserBean> login(@Field("username") String username, @Field("password") String pw);

}
