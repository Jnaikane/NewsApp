package com.codingtest.newsapp.utils;/*
 * Created by Sandeep on 10,June,2022
 */

import android.app.Application;
import android.content.Context;
import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class App extends Application {

    private static App sInstance;
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
        context=this;
    }
    private static void init(App app) {
        sInstance = app;
    }

    public static App getInstance() {
        return sInstance;
    }



}
