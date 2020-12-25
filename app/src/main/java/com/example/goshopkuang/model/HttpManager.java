package com.example.goshopkuang.model;

import okhttp3.Cache;

public class HttpManager {
    private static volatile HttpManager httpManager;

    public static HttpManager getHttpManager() {
        if (httpManager ==null){
            synchronized (HttpManager.class){
                if(httpManager==null){
                    httpManager=new HttpManager();
                }
            }
        }
        return httpManager;
    }

    private static Cache cache;





}
