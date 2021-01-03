package com.example.goshopkuang.view.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.goshopkuang.R;
import com.example.goshopkuang.base.BaseActivity;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.interfaces.login.LoginContract;
import com.example.goshopkuang.model.bean.login.UserBean;
import com.example.goshopkuang.presenter.login.LoginPresenter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import butterknife.BindView;

public class LoginActivity extends BaseActivity implements LoginContract.View, View.OnClickListener {
    @BindView(R.id.edit_login_username)
    EditText editlogName;
    @BindView(R.id.edit_login_password)
    EditText editlogPassword;
    @BindView(R.id.btn_login_log)
    Button btnlogLog;
    @BindView(R.id.btn_login_register)
    Button btnlogRegsister;
    private String name;
    private String password;

    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        name = editlogName.getText().toString();
        password = editlogPassword.getText().toString();
        btnlogLog.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        //((LoginPresenter)presenter).login(name,password);
    }

    @Override
    protected IPresenter initPresenter() {
        return new LoginPresenter();
    }

    @Override
    public void loginReturn(UserBean bean) {
       String token = bean.getData().getToken();
    }


    @Override
    public void showErrMsg(String err) {
        Toast.makeText(this, "用户名密码不正确", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login_log:
                if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(password)) {
                    if (name.equals("z1234") && password.equals("123456"))
                        ((LoginPresenter) presenter).login(name, password);
                } else {
                    Toast.makeText(this, "账号密码不为空", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_login_register:
                break;
        }
    }
}