package com.simple_core.app;

import android.content.Context;

import java.util.HashMap;

/**
 * @fileName:
 * @author: zhangzeyan
 * @date: 2018/9/27
 * @time: 上午12:04
 * @description:
 **/
public final class Simple {

    public static Configurator init(Context context) {
        getSimpleConfigs().put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }


    private static HashMap<String, Object> getSimpleConfigs() {
        return Configurator.getInstance().getSimpleConfigs();
    }
}
