package com.wx.robmoney.util;

import android.app.Application;

import org.xutils.x;

/**
 * Created by wangzhen on 16/1/25.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
