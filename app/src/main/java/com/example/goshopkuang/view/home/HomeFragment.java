package com.example.goshopkuang.view.home;


import android.view.View;


import com.example.goshopkuang.R;
import com.example.goshopkuang.base.BaseFragment;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.interfaces.home.HomeContract;
import com.example.goshopkuang.model.bean.home.HomeBean;

public class HomeFragment extends BaseFragment implements HomeContract.View{
    @BindView(R.id.searchView)
    SearchView searchView;
    @BindView(R.id.banner_main)
    Banner bannerMain;
    @BindView(R.id.tv_juJia)
    TextView tvJuJia;
    @BindView(R.id.tv_canChu)
    TextView tvCanChu;
    @BindView(R.id.tv_peiJian)
    TextView tvPeiJian;
    @BindView(R.id.tv_fuZhuang)
    TextView tvFuZhuang;
    @BindView(R.id.tv_zhiQu)
    TextView tvZhiQu;

    @BindView(R.id.rv_brand)
    RecyclerView rvBrand;
    @BindView(R.id.rv_new)
    RecyclerView rvNew;
    @BindView(R.id.rv_hot)
    RecyclerView rvHot;
    @BindView(R.id.rv_topic)
    RecyclerView rvTopic;
    @BindView(R.id.rv_category_home)
    RecyclerView rvCategoryHome;
    @BindView(R.id.tv_brand_title)
    TextView tvBrandTitle;
    @BindView(R.id.tv_new)
    TextView tvNew;
    @BindView(R.id.tv_topic)
    TextView tvTopic;
    Unbinder unbinder;

    @Override
    protected int getLayout() {
        return R.layout.fragment_home2;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected IPresenter createPresenter() {
        return null;
    }

    @Override
    public void homeDataReturn(HomeBean msg) {

    }

    @Override
    public void showErrMsg(String err) {

    }
}