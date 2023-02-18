package com.codingtest.newsapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import com.codingtest.newsapp.model.NewsResponse;
import com.codingtest.newsapp.repository.HeadLineRepository;
import com.codingtest.newsapp.utils.Resource;
import javax.inject.Inject;
import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class HeadlinesViewModel  extends BaseViewModel {

    HeadLineRepository headlineRepository;
    public MutableLiveData<Resource<NewsResponse>> responseDataNews = new MutableLiveData<>();

    @Inject
    public HeadlinesViewModel(@NonNull Application application,HeadLineRepository headlineRepository) {
        super(application);
        this.headlineRepository = headlineRepository;
        this.responseDataNews = headlineRepository._responseNewList;
    }

    public void getArticleList(String country,String apikey){
        headlineRepository.findNewsArticle(country,apikey);
    }
}
