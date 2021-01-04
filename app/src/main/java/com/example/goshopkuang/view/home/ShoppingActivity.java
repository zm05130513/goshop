package com.example.goshopkuang.view.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.goshopkuang.ItemSpace;
import com.example.goshopkuang.MainActivity;
import com.example.goshopkuang.R;
import com.example.goshopkuang.adapter.goods.CommentPicsAdapter;
import com.example.goshopkuang.adapter.goods.GoodsDetailAdapter;
import com.example.goshopkuang.adapter.goods.GoodsRelateAdapter;
import com.example.goshopkuang.adapter.goods.IssueAdapter;
import com.example.goshopkuang.adapter.goods.ParameterAdapter;
import com.example.goshopkuang.base.BaseActivity;
import com.example.goshopkuang.constants.Constant;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.interfaces.home.HomeContract;
import com.example.goshopkuang.model.bean.goods.AttributeBean;
import com.example.goshopkuang.model.bean.goods.CartBean;
import com.example.goshopkuang.model.bean.goods.GalleryBean;
import com.example.goshopkuang.model.bean.goods.GoodsDetail;
import com.example.goshopkuang.model.bean.goods.GoodsListBean;
import com.example.goshopkuang.model.bean.goods.GoodsRelated;
import com.example.goshopkuang.model.bean.goods.IssueBean;
import com.example.goshopkuang.presenter.home.GoodsPresenter;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class ShoppingActivity extends BaseActivity implements HomeContract.GoodsView, View.OnClickListener {

    @BindView(R.id.banner_shop)
    Banner bannerShop;
    @BindView(R.id.iv_goods_name)
    TextView ivGoodsName;
    @BindView(R.id.iv_goods_desc)
    TextView ivGoodsDesc;
    @BindView(R.id.iv_goods_price)
    TextView ivGoodsPrice;
    @BindView(R.id.rl_choice)
    RelativeLayout rlChoice;
    @BindView(R.id.tv_comment_count)
    TextView tvCommentCount;
    @BindView(R.id.tv_look_all)
    TextView tvLookAll;
    @BindView(R.id.iv_arrow_comment)
    ImageView ivArrowComment;
    @BindView(R.id.rl_comment)
    RelativeLayout rlComment;
    @BindView(R.id.rv_goods_parameter)
    RecyclerView rvGoodsParameter;
    @BindView(R.id.rv_pic_list)
    RecyclerView rvPicList;
    @BindView(R.id.rv_questions)
    RecyclerView rvQuestions;
    @BindView(R.id.rv_relate)
    RecyclerView rvRelate;
    @BindView(R.id.iv_save)
    ImageView ivSave;
    @BindView(R.id.iv_shop)
    ImageView ivShop;
    @BindView(R.id.tv_buy_rightNow)
    TextView tvBuyRightNow;
    @BindView(R.id.tv_add_cart)
    TextView tvAddCart;
    @BindView(R.id.iv_header_comment)
    ImageView ivHeaderComment;
    @BindView(R.id.tv_name_comment)
    TextView tvNameComment;
    @BindView(R.id.tv_time_comment)
    TextView tvTimeComment;
    @BindView(R.id.tv_content_comment)
    TextView tvContentComment;
    @BindView(R.id.ll_comment)
    LinearLayout llComment;
    @BindView(R.id.ll_comment_ll)
    LinearLayout llCommentLl;
    @BindView(R.id.ll_match)
    LinearLayout llMatch;
    @BindView(R.id.slv_shopping)
    ScrollView slvShopping;
    @BindView(R.id.ll_bottom)
    LinearLayout llBottom;
    @BindView(R.id.rv_pics_comment)
    RecyclerView rvPicsComment;

    private String id;
    private PopupWindow popupWindow;
    private ImageView ivChoice;
    private ImageView ivCancel;
    private TextView tvChoicePrice;
    private TextView tvMinus;
    private TextView tvCount;
    private TextView tvAdd;
    private int popupHeight;
    private int popupWidth;
    private boolean isClick = true;
    private int num;
    private int productId;

    @Override
    protected int getLayout() {
        return R.layout.activity_shopping;
    }

    @Override
    protected void initView() {
        Intent intent = getIntent();
        id = intent.getStringExtra("goodId");
        getPopupWindow();
        tvCount.setText("1");
    }

    private void getPopupWindow() {
      //  View view = LayoutInflater.from(this).inflate(R.layout.layout_shop_choice_popup, null);
        View view = LayoutInflater.from(this).inflate(R.layout.layout_shop_choice_popup, null);
        ivChoice = view.findViewById(R.id.iv_choice);
        ivCancel = view.findViewById(R.id.iv_cancel);
        tvChoicePrice = view.findViewById(R.id.tv_choice_price);
        tvMinus = view.findViewById(R.id.tv_minus);
        tvCount = view.findViewById(R.id.tv_count);
        tvAdd = view.findViewById(R.id.tv_add);

        ivCancel.setOnClickListener(this);
        tvMinus.setOnClickListener(this);
        tvAdd.setOnClickListener(this);

        popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow.setBackgroundDrawable(null);
        popupWindow.setOutsideTouchable(false);

//获取自身的长宽高
        view.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
        popupHeight = view.getMeasuredHeight();
        popupWidth = view.getMeasuredWidth();
    }

    @Override
    protected void initData() {
        ((GoodsPresenter) presenter).getGoodsDetail(id);
        ((GoodsPresenter) presenter).getGoodsRelated(id);
    }

    @Override
    protected IPresenter initPresenter() {
        return new GoodsPresenter();
    }

    @Override
    public void getGoodsDetailReturn(GoodsDetail data) {
        productId = data.getData().getProductList().get(0).getId();
        banner(data.getData().getGallery());
        ivGoodsName.setText(data.getData().getInfo().getName());
        ivGoodsDesc.setText(data.getData().getInfo().getGoods_brief());
        ivGoodsPrice.setText("￥" + data.getData().getInfo().getRetail_price());
        getCommentList(data.getData().getComment());
        getIssueList(data.getData().getIssue());
        getGoodsParameter(data.getData().getAttribute());
        getGoodsDesc(data.getData().getInfo().getGoods_desc());
    }

    //图片的网址
    private void getGoodsDesc(String goods_desc) {
        if (goods_desc != null) {
            ArrayList<String> urls = new ArrayList<>();
            String[] split = goods_desc.split("http:");
            for (int i = 0; i < split.length; i++) {
                if (i % 2 == 0) {
                    String https = split[i].substring(0, split[0].indexOf("ipg") + 3);
                    urls.add(https);
                }
            }
            rvPicList.setLayoutManager(new LinearLayoutManager(this));
            GoodsDetailAdapter detailAdapter = new GoodsDetailAdapter(urls);
            rvPicList.setAdapter(detailAdapter);
        } else {
            rvPicList.setVisibility(View.GONE);
        }
    }

    private void getGoodsParameter(List<AttributeBean> attribute) {
        if (attribute != null) {
            rvGoodsParameter.setLayoutManager(new LinearLayoutManager(this));
            rvGoodsParameter.addItemDecoration(new ItemSpace(5));
            ParameterAdapter parameterAdapter = new ParameterAdapter(attribute);
            rvGoodsParameter.setAdapter(parameterAdapter);
        } else {
            rvGoodsParameter.setVisibility(View.GONE);
        }
    }

    private void getIssueList(List<IssueBean> issue) {
        if (issue != null) {
            rvQuestions.setLayoutManager(new LinearLayoutManager(this));
            IssueAdapter issueAdapter = new IssueAdapter(issue);
            rvQuestions.setAdapter(issueAdapter);
        }
    }

    private void getCommentList(GoodsDetail.DataBeanX.CommentBean comment) {
        GoodsDetail.DataBeanX.CommentBean.DataBean data = comment.getData();
        if (data != null) {
            tvCommentCount.setText("评价" + "(" + comment.getCount() + ")");
            Glide.with(this).load(data.getAvatar()).circleCrop().override(100)
                    .into(ivHeaderComment);
            tvNameComment.setText(data.getNickname());
            tvTimeComment.setText(data.getAdd_time());
            tvContentComment.setText(data.getContent());

            LinearLayoutManager manager = new LinearLayoutManager(this);
            rvPicsComment.setLayoutManager(manager);
            manager.setOrientation(LinearLayoutManager.HORIZONTAL);
            rvPicsComment.addItemDecoration(new ItemSpace(10));
            CommentPicsAdapter commentPicsAdapter = new CommentPicsAdapter(comment.getData().getPic_list());
            rvPicsComment.setAdapter(commentPicsAdapter);
        } else {
            llCommentLl.setVisibility(View.GONE);
        }
    }

    private void banner(List<GalleryBean> gallery) {
        if (gallery != null && gallery.size() > 0) {
            bannerShop.setImages(gallery)
                    .setImageLoader(new ImageLoader() {
                        @Override
                        public void displayImage(Context context, Object path, ImageView imageView) {
                            GalleryBean bean = (GalleryBean) path;
                            Glide.with(context).load(bean.getImg_url()).into(imageView);
                        }
                    }).setDelayTime(2000)
                    .isAutoPlay(true)
                    .start();
            Glide.with(this).load(gallery.get(0).getImg_url()).into(ivChoice);
        } else {
            return;
        }
    }

    @Override
    public void getGoodsRelatedReturn(GoodsRelated data) {
        rvRelate.setLayoutManager(new GridLayoutManager(this, 2));
        GoodsRelateAdapter goodsRelateAdapter = new GoodsRelateAdapter(data.getData()
                .getGoodsList());
        rvRelate.setAdapter(goodsRelateAdapter);
        goodsRelateAdapter.setClickListener(new GoodsRelateAdapter.ItemClickListener() {
            @Override
            public void onClick(int position, GoodsListBean data) {
                Intent intent = new Intent(ShoppingActivity.this, ShoppingActivity.class);
                intent.putExtra("goodId", data.getId() + "");
                startActivity(intent);
            }
        });
    }

    @Override
    public void postGoodsToCart(CartBean bean) {

    }

    @Override
    public void showErrMsg(String err) {
        Toast.makeText(this, err, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        num = Integer.valueOf(tvCount.getText().toString().trim());
        switch (v.getId()) {
            case R.id.iv_cancel:
                popupWindow.dismiss();
                break;
            case R.id.tv_minus:
                num -= 1;
                if (num >= 1) {
                    tvCount.setText(num + "");
                } else {
                    return;
                }
                break;
            case R.id.tv_add:
                num += 1;
                tvCount.setText(num + "");
                break;
            default:
                break;
        }
    }

    @OnClick({R.id.rl_choice, R.id.rl_comment, R.id.iv_save, R.id.iv_shop, R.id
            .tv_buy_rightNow, R.id.tv_add_cart})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_choice:
                popup();
                break;
            case R.id.rl_comment:
                break;
            case R.id.iv_save:
                break;
            case R.id.iv_shop:
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("dou","wen");
                startActivity(intent);
                break;
            case R.id.tv_buy_rightNow:
                break;
            case R.id.tv_add_cart:
                if (isClick){
                    popup();
                    isClick=false;
                }else {
                    ((GoodsPresenter)presenter).goodsToCart(Constant.UID,Integer.valueOf(id),productId,num);
                    isClick=true;
                    Toast.makeText(this, "加入成功", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    private void popup() {
        //获取需要在其上方显示的控件的位置信息
        int[] location= new int[2];
        llBottom.getLocationOnScreen(location);
        //在控件上方显示    向上移动y轴是负数
        popupWindow.showAtLocation(llBottom, Gravity.NO_GRAVITY,0,location[1]-popupHeight);
    }
}