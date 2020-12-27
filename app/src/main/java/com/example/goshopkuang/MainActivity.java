package com.example.goshopkuang;

import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.goshopkuang.base.BaseActivity;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.view.category.CategoryFragment;
//import com.example.goshopkuang.view.home.HomeFragment;
import com.example.goshopkuang.view.home.HomeFragment;
import com.example.goshopkuang.view.main.MineFragment;
import com.example.goshopkuang.view.main.mine.MainFragment;
import com.example.goshopkuang.view.shop.ShoppingFragment;
import com.example.goshopkuang.view.topic.TopicFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;

public class MainActivity extends BaseActivity {


    public FrameLayout flMain;


    public BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            //切换页面，是另外一个事物，不能跟初始化共同使用一个事物
            FragmentTransaction transaction = manager.beginTransaction();
            switch (item.getItemId()){
                case R.id.navigation_home:
                    transaction.replace(R.id.fl_main,homeFragment).commit();

                    return true;
                case R.id.navigation_topic:
                    transaction.replace(R.id.fl_main,topicFragment).commit();

                    return true;
                case R.id.navigation_category:
                    transaction.replace(R.id.fl_main,categoryFragment).commitNow();

                    return true;
                case R.id.navigation_shopping:
                    transaction.replace(R.id.fl_main,shoppingFragment).commit();

                    return true;
                case R.id.navigation_main:
                    //  transaction.replace(R.id.fl_main,mineFragment).commit();
                    transaction.replace(R.id.fl_main,mineFragment).commit();

                    return true;
                default:
                    break;

            }

            return false;
        }
    };
   // private HomeFragment homeFragment;
    private TopicFragment topicFragment;
    private CategoryFragment categoryFragment;
    private ShoppingFragment shoppingFragment;
    private MainFragment mainFragment;
    private BottomNavigationView navigation;
    private MineFragment mineFragment;
    private FragmentManager manager;
    private HomeFragment homeFragment;
    //private HomeFragment homeFragment;

    public BottomNavigationView getNavigation() {
        return navigation;
    }

    public TopicFragment getTopicFragment() {
        return topicFragment;
    }

    public ShoppingFragment getShoppingFragment() {
        return shoppingFragment;
    }


    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        flMain = findViewById(R.id.fl_main);
        navigation =(BottomNavigationView)findViewById(R.id.navigation);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //homeFragment = new HomeFragment();
        homeFragment = new com.example.goshopkuang.view.home.HomeFragment();
        topicFragment = new TopicFragment();
        categoryFragment = new CategoryFragment();
        shoppingFragment = new ShoppingFragment();
        mineFragment = new MineFragment();
        mainFragment = new MainFragment();

        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
       // transaction.replace(R.id.fl_main, homeFragment).commit();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected IPresenter initPresenter() {
        return null;
    }


    @Override
    public void showErrMsg(String err) {

    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        String name = intent.getStringExtra("dou");
        if (name != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.fl_main, shoppingFragment).commit();
            getNavigation().setSelectedItemId(R.id.navigation_shopping);
        }
    }
}