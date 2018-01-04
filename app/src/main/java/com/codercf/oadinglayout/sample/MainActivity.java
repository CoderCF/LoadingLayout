package com.codercf.oadinglayout.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.codercf.loadinglayout.LoadingLayout;


public class MainActivity extends AppCompatActivity {

    private LoadingLayout mLoadingLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoadingLayout = (LoadingLayout) findViewById(R.id.loading_layout);

        mLoadingLayout.setErrorClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoadingLayout.showLoading();
            }
        });
    }

    public void doClick(View view){
        switch (view.getId()){
            case R.id.btn_loading:
                mLoadingLayout.showLoading();
                break;
            case R.id.btn_error:
                mLoadingLayout.showError();
                break;
            case R.id.btn_empty:
                mLoadingLayout.showEmpty();
                break;
            case R.id.btn_content:
                mLoadingLayout.showMain();
                break;
        }
    }
}
