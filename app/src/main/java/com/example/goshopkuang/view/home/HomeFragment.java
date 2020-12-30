package com.example.goshopkuang.view.home;


import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.goshopkuang.ItemSpace;
import com.example.goshopkuang.MainActivity;
import com.example.goshopkuang.R;

import com.example.goshopkuang.adapter.home.CategoryAdapter;
import com.example.goshopkuang.adapter.home.HomeBrandAdapter;
import com.example.goshopkuang.adapter.home.HomeHotAdapter;
import com.example.goshopkuang.adapter.home.HomeNewAdapter;
import com.example.goshopkuang.adapter.home.HomeTopicAdapter;
import com.example.goshopkuang.base.BaseFragment;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.interfaces.home.HomeContract;
import com.example.goshopkuang.model.bean.home.BannerBean;
import com.example.goshopkuang.model.bean.home.BrandListBean;
import com.example.goshopkuang.model.bean.home.CategoryListBean;
import com.example.goshopkuang.model.bean.home.HomeBean;
import com.example.goshopkuang.model.bean.home.HotGoodsListBean;
import com.example.goshopkuang.model.bean.home.NewGoodsListBean;
import com.example.goshopkuang.model.bean.home.TopicListBean;
import com.example.goshopkuang.model.bean.home.channel.ChannelBean;
import com.example.goshopkuang.presenter.home.HomePresenter;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;

public class HomeFragment extends BaseFragment implements HomeContract.View, View.OnClickListener {
    @BindView(R.id.searchView)
    SearchView searchView;
    @BindView(R.id.banner_main)
    Banner bannerMain;
    @BindView(R.id.tv_juJia)
    RadioButton tvJuJia;
    @BindView(R.id.tv_canChu)
    RadioButton tvCanChu;
    @BindView(R.id.tv_peiJian)
    RadioButton tvPeiJian;
    @BindView(R.id.tv_fuZhuang)
    RadioButton tvFuZhuang;
    @BindView(R.id.tv_zhiQu)
    RadioButton tvZhiQu;

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
    private List<BrandListBean> brand;
    private ArrayList<CategoryListBean> category;
    private List<NewGoodsListBean> newGoodsListBeans;
    private List<TopicListBean> topicListBeans;
    private List<HotGoodsListBean> hotGoodsListBeans;
    private HomeBrandAdapter homeBrandAdapter;
    private HomeNewAdapter homeNewAdapter;
    private HomeHotAdapter homeHotAdapter;
    private HomeTopicAdapter homeTopicAdapter;
    private CategoryAdapter categoryAdapter;
    private List<ChannelBean> channel;
    private MainActivity activity;
    private HotGoodsListBean hotGoodsListBean;

    @Override
    protected int getLayout() {
        return R.layout.fragment_home2;
    }

    @Override
    protected void initView(View view) {
        brand = new ArrayList<>();
        category = new ArrayList<>();
        hotGoodsListBeans = new ArrayList<>();
        newGoodsListBeans = new ArrayList<>();
        topicListBeans = new ArrayList<>();

        brandListData(brand);

        newListView(newGoodsListBeans);

        hotListData(hotGoodsListBeans);

        topicListData(topicListBeans);

        categoryListData(category);
    }

    @Override
    protected void initData() {
        ((HomePresenter) presenter).home();
    }

    @Override
    protected IPresenter createPresenter() {
        return new HomePresenter();
    }

    @Override
    public void homeDataReturn(HomeBean beans) {
        List<BannerBean> banner = beans.getData().getBanner();
        List<BrandListBean> brandList = beans.getData().getBrandList();

        List<CategoryListBean> categoryList = beans.getData().getCategoryList();
        channel = beans.getData().getChannel();

        List<HotGoodsListBean> hotGoodsList = beans.getData().getHotGoodsList();
        List<NewGoodsListBean> newGoodsList = beans.getData().getNewGoodsList();
        List<TopicListBean> topicList = beans.getData().getTopicList();

        bannerData(banner, channel);

        brand.addAll(brandList);
        category.addAll(categoryList);
        hotGoodsListBeans.addAll(hotGoodsList);
        newGoodsListBeans.addAll(newGoodsList);
        topicListBeans.addAll(topicList);

        homeBrandAdapter.notifyDataSetChanged();
        homeNewAdapter.notifyDataSetChanged();
        homeHotAdapter.notifyDataSetChanged();
        homeTopicAdapter.notifyDataSetChanged();
        categoryAdapter.notifyDataSetChanged();

    }

    private void bannerData(List<BannerBean> banner, List<ChannelBean> channel) {
        bannerMain.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                BannerBean pathPic = (BannerBean) path;
                Glide.with(context).load(pathPic.getImage_url()).into(imageView);
            }
        }).setImages(banner)
                .setDelayTime(2000)
                .isAutoPlay(true)
                .start();

        tvJuJia.setText(channel.get(0).getName());
        //tvJuJia.setb(channel.get(0).getIcon_url());
        tvCanChu.setText(channel.get(1).getName());
        tvPeiJian.setText(channel.get(2).getName());
        tvFuZhuang.setText(channel.get(3).getName());
        tvZhiQu.setText(channel.get(4).getName());

        tvJuJia.setOnClickListener(this);
        tvCanChu.setOnClickListener(this);
        tvPeiJian.setOnClickListener(this);
        tvFuZhuang.setOnClickListener(this);
        tvZhiQu.setOnClickListener(this);
    }

    private void brandListData(List<BrandListBean> brandList) {
        rvBrand.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        rvBrand.addItemDecoration(new ItemSpace(2));
        homeBrandAdapter = new HomeBrandAdapter(brandList);
        rvBrand.setAdapter(homeBrandAdapter);
        tvBrandTitle.setOnClickListener(this);
        homeBrandAdapter.setClickListener(new HomeBrandAdapter.ItemClickListener() {
            @Override
            public void onClick(int position, BrandListBean bean) {
                Intent intent = new Intent(getActivity(), BrandDetailActivity.class);
                intent.putExtra("id", bean.getId() + "");
                startActivity(intent);
            }
        });
    }

    private void newListView(List<NewGoodsListBean> newGoodsList) {
        rvNew.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        rvNew.addItemDecoration(new ItemSpace(10));
        homeNewAdapter = new HomeNewAdapter(newGoodsList);
        rvNew.setAdapter(homeNewAdapter);
        tvNew.setOnClickListener(this);
        homeNewAdapter.setClickListener(new HomeNewAdapter.ItemClickListener() {
            @Override
            public void onClick(int position, NewGoodsListBean data) {
                 // Intent intent = new Intent(getActivity(), ShoppingActivity.class);
                  //intent.putExtra("goodId", data.getId() + "");
                  // getActivity().startActivity(intent);
            }
        });
    }

    private void hotListData(List<HotGoodsListBean> hotGoodsList) {
        rvHot.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvHot.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        homeHotAdapter = new HomeHotAdapter(hotGoodsList);
        rvHot.setAdapter(homeHotAdapter);
        homeHotAdapter.setClickListener(new HomeHotAdapter.ItemClickListener() {
            @Override
            public void onClick(int position, HotGoodsListBean data) {
                // Intent intent = new Intent(getActivity(), ShoppingActivity.class);
                // intent.putExtra("goodId", data.getId() + "");
                //  getActivity().startActivity(intent);
            }
        });
    }

    private void topicListData(final List<TopicListBean> topicList) {
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        rvTopic.setLayoutManager(manager);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        homeTopicAdapter = new HomeTopicAdapter(topicList);
        rvTopic.setAdapter(homeTopicAdapter);

        tvTopic.setOnClickListener(this);

        homeTopicAdapter.setClickListener(new HomeTopicAdapter.ItemClickListener() {
            @Override
            public void onClick(int position, TopicListBean data) {
                  // Intent intent = new Intent(getActivity(), TopicInfoActivity.class);
                  // intent.putExtra("id", data.getId() + "");
                  // startActivity(intent);
            }
        });
    }

    private void categoryListData(ArrayList<CategoryListBean> categoryList) {
        rvCategoryHome.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvCategoryHome.addItemDecoration(new ItemSpace(20));
        categoryAdapter = new CategoryAdapter(categoryList);
        rvCategoryHome.setAdapter(categoryAdapter);
    }

    @Override
    public void showErrMsg(String err) {
        Toast.makeText(getActivity(), err, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_juJia:
                showList(tvJuJia);
                break;
            case R.id.tv_canChu:
                showList(tvCanChu);
                break;
            case R.id.tv_peiJian:
                showList(tvPeiJian);
                break;
            case R.id.tv_fuZhuang:
                showList(tvFuZhuang);
                break;
            case R.id.tv_zhiQu:
                showList(tvZhiQu);
                break;

        }
    }

    private void showList(TextView view) {
        String name = view.getText().toString().trim();
        for (int i = 0; i < channel.size(); i++) {
            if (name.equals(channel.get(i).getName())){
                Intent intent = new Intent(getActivity(), ChannelDataActivity.class);
                intent.putExtra("id",channel.get(i).getCategoryid());
                startActivity(intent);
            }
        }
    }
}