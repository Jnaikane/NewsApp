package com.codingtest.newsapp.utils;

import android.content.Context;
import androidx.annotation.StringRes;
import javax.inject.Inject;
import javax.inject.Singleton;
import dagger.hilt.android.qualifiers.ApplicationContext;

@Singleton
public class ResourcesProvider {
    private Context mContext;
    @Inject
    public ResourcesProvider(@ApplicationContext  Context context) {
        mContext = context;
    }
    public String getString(@StringRes int stringResId) {
        return mContext.getString(stringResId);
    }
}