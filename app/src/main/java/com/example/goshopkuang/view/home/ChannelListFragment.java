package com.example.goshopkuang.view.home;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goshopkuang.ItemSpace;
import com.example.goshopkuang.R;
import com.example.goshopkuang.adapter.home.HomeChannelListAdapter;
import com.example.goshopkuang.base.BaseFragment;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.interfaces.home.HomeContract;
import com.example.goshopkuang.model.bean.home.HomeBean;
import com.example.goshopkuang.model.bean.home.channel.DataBean;
import com.example.goshopkuang.presenter.home.ChannelListPresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;

public class ChannelListFragment extends BaseFragment implements HomeContract.ChannelView {

    @BindView(R.id.tv_tab)
    TextView tvTab;
    @BindView(R.id.tv_tab_info)
    TextView tvTabInfo;
    @BindView(R.id.rv_channel_show)
    RecyclerView rvChannelShow;

    Unbinder unbinder;
    private String id;
    private String name;
    private String desc;
    private int page = 1;
    private int size = 10;
    private List<DataBean> list;
    private HomeChannelListAdapter channelListAdapter;

    public static ChannelListFragment newInstance(String id, String name, String desc) {
        Bundle bundle = new Bundle();
        ChannelListFragment fragment = new ChannelListFragment();
        bundle.putString("categoryId", id);
        bundle.putString("name", name);
        bundle.putString("desc", desc);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_channel_list;
    }

    @Override
    protected void initView(View view) {
        Bundle bundle = getArguments();
        id = bundle.getString("categoryId");
        name = bundle.getString("name");
        desc = bundle.getString("desc");
        tvTab.setText(name);
        tvTabInfo.setText(desc);
        list = new ArrayList<>();
        rvChannelShow.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        rvChannelShow.addItemDecoration(new ItemSpace(5));
        channelListAdapter = new HomeChannelListAdapter(list);
        rvChannelShow.setAdapter(channelListAdapter);

    }

    @Override
    protected void initData() {
        ((ChannelListPresenter) presenter).channelList(id, page, size);
    }

    @Override
    protected IPresenter createPresenter() {
        return new ChannelListPresenter();
    }

    public void getChannelReturn(List<DataBean> data) {
        list.addAll(data);
        channelListAdapter.notifyDataSetChanged();
    }


    @Override
    public void showErrMsg(String err) {
        Toast.makeText(context, err, Toast.LENGTH_SHORT).show();
    }


}