package com.xyz.ray;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Random;

import cn.jpush.android.api.JPushInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("JPush", "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
        Log.i("JPush", ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Random rand = new Random();
        JPushInterface.setAlias(this, rand.nextInt(), "123456");
        Log.i("JPush", "RegId => " + JPushInterface.getRegistrationID(this));
    }
}
