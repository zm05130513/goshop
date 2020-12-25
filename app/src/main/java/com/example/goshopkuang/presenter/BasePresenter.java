package com.example.goshopkuang.presenter;

import com.example.goshopkuang.interfaces.IBaseView;
import com.example.goshopkuang.interfaces.IPresenter;

import java.lang.ref.WeakReference;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class BasePresenter<V extends IBaseView> implements IPresenter<V> {

    //对view层进行弱引用化处理
    private WeakReference<V> weakReference;
    /**
     * 当前请求数据的view
     */
    protected V mView;
    //RxJava2 数据加载的时候，界面回收一起的数据内存泄漏
    protected CompositeDisposable compositeDisposable;

    @Override
    public void attchView(V view) {
        weakReference = new WeakReference<>(view);
        mView = weakReference.get();
    }

    //解绑观察者和被观察者
    protected void unSubscribe() {
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
    }

    //添加观察者和被观察者的操作类
    //Disposable
    protected void addSubscribe(Disposable disposable) {
        if (compositeDisposable == null) {
            compositeDisposable = new CompositeDisposable();
        }
        compositeDisposable.add(disposable);
    }

    @Override
    public void detachView() {
        this.mView = null;
        unSubscribe();
    }
}
