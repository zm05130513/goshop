package com.example.goshopkuang.component;

import android.text.TextUtils;

import com.example.goshopkuang.interfaces.IBaseView;

import io.reactivex.subscribers.ResourceSubscriber;

public abstract class CommonSubscriber<T> extends ResourceSubscriber<T> {

    private IBaseView mView;
    private String errorMsg;
    private boolean isShowErrorState = false;

    protected CommonSubscriber(IBaseView view){
        mView = view;
    }

    protected CommonSubscriber(IBaseView view, String eMsg){
        mView = view;
        errorMsg = eMsg;
    }

    protected CommonSubscriber(IBaseView view, boolean isError){
        mView = view;
        isShowErrorState = isError;
    }

    protected CommonSubscriber(IBaseView view, String eMsg, boolean isError){
        mView = view;
        errorMsg = eMsg;
        isShowErrorState = isError;
    }

    @Override
    public void onError(Throwable t) {
        //LoadingUtil.getInstance().hideLoading();
        if(mView == null) {
            return;
        }
        if(errorMsg != null && TextUtils.isEmpty(errorMsg)){
            mView.showErrMsg(errorMsg);
        }
    }

    @Override
    public void onComplete() {
        //LoadingUtil.getInstance().hideLoading();
    }
}
