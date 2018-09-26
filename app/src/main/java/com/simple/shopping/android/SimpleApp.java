package com.simple.shopping.android;

import android.app.Application;

import com.simple_core.app.Simple;

/**
 * @fileName:
 * @author: zhangzeyan
 * @date: 2018/9/27
 * @time: 上午1:00
 * @description:
 **/
public class SimpleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Simple.init(this)
                .withApiHost("http://127.0.0.1/")
                .configurate();
    }
}
