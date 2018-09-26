package com.simple_core.app;

import java.util.WeakHashMap;

/**
 * @fileName:
 * @author: zhangzeyan
 * @date: 2018/9/27
 * @time: 上午12:16
 * @description:
 **/
public class Configurator {

    private static final WeakHashMap<String, Object> SIMPLE_CONFIGS = new WeakHashMap<>();

    private Configurator() {
        SIMPLE_CONFIGS.put(ConfigType.CONFIG_READY.name(), false);
    }

    public static Configurator getInstance(){
        return Holder.INSTANCE;
    }

    final WeakHashMap<String, Object> getSimpleConfigs(){
        return SIMPLE_CONFIGS;
    }

    private static class Holder{
        private static final Configurator INSTANCE = new Configurator();
    }

    public final void configurate(){
        SIMPLE_CONFIGS.put(ConfigType.CONFIG_READY.name(), true);
    }

    public final Configurator withApiHost(String host){
        SIMPLE_CONFIGS.put(ConfigType.API_HOST.name(), host);
        return this;
    }

    private void checkConfiguration(){
        final boolean isReady = (boolean) SIMPLE_CONFIGS.get(ConfigType.CONFIG_READY.name());
        if (!isReady){
            throw new RuntimeException("Configuration is not ready, call configure");
        }
    }

    @SuppressWarnings("unchecked")
    final <T> T getConfiguration(Enum<ConfigType> key){
        checkConfiguration();
        return (T) SIMPLE_CONFIGS.get(key);
    }
}
