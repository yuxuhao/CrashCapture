package com.hzanchu.crashcapture;

import android.app.Application;

import com.hzanchu.library.SpiderMan;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * 放在其他库初始化前
         * boolean debug显示 其他不显示
         */
        SpiderMan.init(this, true);
    }
}
