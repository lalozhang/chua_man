package com.example.lalozhang.lalotest;


import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.lalozhang.lalotest.view.ScrollViewContainer;


public class MainActivity extends Activity {
    private ScrollViewContainer container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container= (ScrollViewContainer) findViewById(R.id.svc_container);
        View topView = LayoutInflater.from(this).inflate(R.layout.top_view, null, false);
        View bottomView = LayoutInflater.from(this).inflate(R.layout.bottom_view, null, false);
        container.addContainer(topView,bottomView);
    }


}
