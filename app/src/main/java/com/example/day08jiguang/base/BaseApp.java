package com.example.day08jiguang.base;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;
import cn.jpush.android.helper.Logger;

public class BaseApp extends Application {
    private static final String TAG = "JIGUANG-Example";

    @Override
    public void onCreate() {

        super.onCreate();

        JPushInterface.setDebugMode(true); 	// 设置开启日志,发布时请关闭日志
        JPushInterface.init(this);     		// 初始化 JPush
    }
}