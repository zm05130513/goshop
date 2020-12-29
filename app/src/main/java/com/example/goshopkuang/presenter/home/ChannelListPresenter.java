package com.example.goshopkuang.presenter.home;


import com.example.goshopkuang.component.CommonSubscriber;
import com.example.goshopkuang.interfaces.home.HomeContract;
import com.example.goshopkuang.model.HttpManager;
import com.example.goshopkuang.model.bean.home.channel.ChannelGoodsList;
import com.example.goshopkuang.presenter.BasePresenter;
import com.example.goshopkuang.utils.RxUtils;

public class ChannelListPresenter extends BasePresenter<HomeContract.ChannelView> implements HomeContract.ChannelPresenter {

    @Override
    public void channelList(String id, int page, int size) {
        addSubscribe(HttpManager.getMyApi().getChannelData(id,page,size)
                .compose(RxUtils.<ChannelGoodsList>rxScheduler())
                .subscribeWith(new CommonSubscriber<ChannelGoodsList>(mView) {
                    @Override
                    public void onNext(ChannelGoodsList data) {
                        if (mView!=null) {
                            mView.getChannelReturn(data.getData().getData());
                        }
                    }

                }));
    }
}
