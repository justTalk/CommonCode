package com.yf.base.module_base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yf.base.BaseFragmentActivity;

public class MainActivity extends BaseFragmentActivity {

    @Override
    protected int getContextViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startFragment(new MainFragment());
    }
}
