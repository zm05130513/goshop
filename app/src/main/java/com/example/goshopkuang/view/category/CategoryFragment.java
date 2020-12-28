package com.example.goshopkuang.view.category;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.goshopkuang.R;
import com.example.goshopkuang.adapter.category.FragTabAdapter;
import com.example.goshopkuang.base.BaseFragment;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.interfaces.category.CategoryContract;
import com.example.goshopkuang.model.bean.category.CategoryListBean;
import com.example.goshopkuang.presenter.category.CategoryPresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;
import q.rorbin.verticaltablayout.VerticalTabLayout;

public class CategoryFragment extends BaseFragment implements CategoryContract.View {

    @BindView(R.id.vTab)
    VerticalTabLayout vTab;
    @BindView(R.id.vp_sort)
    ViewPager vpSort;
    Unbinder unbinder;

    @Override
    protected int getLayout() {
        return R.layout.fragment_category;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void initData() {
        ((CategoryPresenter) presenter).category();
    }

    @Override
    protected IPresenter createPresenter() {
        return new CategoryPresenter();
    }

    @Override
    public void categoryDataReturn(List<CategoryListBean> categoryList) {
        final ArrayList<String> tabName = new ArrayList<>();
        final ArrayList<Fragment> fragments = new ArrayList<>();
        for (int i = 0; i < categoryList.size(); i++) {
            fragments.add(new CategoryTabFragment(categoryList.get(i).getName(), categoryList.get(i).getId() + ""));
            tabName.add(categoryList.get(i).getName());
        }
        FragTabAdapter fragTabAdapter = new FragTabAdapter(getChildFragmentManager(), fragments, tabName);
        vpSort.setAdapter(fragTabAdapter);
        vTab.setupWithViewPager(vpSort);
    }

    @Override
    public void showErrMsg(String err) {
        Toast.makeText(getActivity(), err, Toast.LENGTH_SHORT).show();
    }
}