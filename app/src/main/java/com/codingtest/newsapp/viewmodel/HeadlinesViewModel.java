package com.codingtest.newsapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;

import com.codingtest.newsapp.repository.HeadLineRepository;

public class HeadlinesViewModel  extends  BaseViewModel{

    HeadLineRepository repository;

    public HeadlinesViewModel(@NonNull Application application) {
        super(application);
    }
}
