package com.simple.shopping.android;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.simple_core.app.Simple;
import com.simple_ec.icon.FontEcModule;

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
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("http://127.0.0.1/")
                .configurate();
    }
}
