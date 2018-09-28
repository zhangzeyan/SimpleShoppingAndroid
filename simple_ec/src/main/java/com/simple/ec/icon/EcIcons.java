package com.simple.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * @fileName:
 * @author: zhangzeyan
 * @date: 2018/9/27
 * @time: 下午11:23
 * @description:
 **/
public enum  EcIcons implements Icon {
    icon_scan('\ue606'),
    icon_ali_pay('\ue606');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return null;
    }

    @Override
    public char character() {
        return 0;
    }
}
