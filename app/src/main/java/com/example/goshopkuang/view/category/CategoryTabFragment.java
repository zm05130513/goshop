package com.example.goshopkuang.view.category;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.goshopkuang.R;
import com.example.goshopkuang.adapter.category.SortAdapter;
import com.example.goshopkuang.base.BaseFragment;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.interfaces.category.CategoryContract;
import com.example.goshopkuang.interfaces.category.CategoryTabContract;
import com.example.goshopkuang.model.bean.category.SortBean;
import com.example.goshopkuang.presenter.category.CategoryTabPresenter;

import butterknife.BindView;
import butterknife.Unbinder;

public class CategoryTabFragment extends BaseFragment implements CategoryTabContract.View {
    @BindView(R.id.iv_sort_banner)
    ImageView ivSortBanner;
    @BindView(R.id.tv_sort_banner_desc)
    TextView tvSortBannerDesc;
    @BindView(R.id.tv_sort)
    TextView tvSort;
    @BindView(R.id.rv_sort)
    RecyclerView rvSort;
    Unbinder unbinder;
    private String name;
    private String id;

    @SuppressLint("ValidFragment")
    public CategoryTabFragment(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_category_tab;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void initData() {
        ((CategoryTabPresenter)presenter).categoryTab(id);
    }

    @Override
    protected IPresenter createPresenter() {
        return new CategoryTabPresenter();
    }

    @Override
    public void tabDataReturn(SortBean msg) {
        SortBean.DataBean.CurrentCategoryBean category = msg.getData().getCurrentCategory();
        Glide.with(getActivity()).load(category.getBanner_url()).into(ivSortBanner);
        tvSortBannerDesc.setText(category.getFront_desc());
        tvSort.setText("—— "+category.getName()+"分类 ——");
rvSort.setLayoutManager(new GridLayoutManager(getActivity(),3));
        SortAdapter sortAdapter = new SortAdapter(category.getSubCategoryList());
        rvSort.setAdapter(sortAdapter);
        sortAdapter.notifyDataSetChanged();
    }

    @Override
    public void showErrMsg(String err) {
        Toast.makeText(getActivity(), err, Toast.LENGTH_SHORT).show();
    }
}