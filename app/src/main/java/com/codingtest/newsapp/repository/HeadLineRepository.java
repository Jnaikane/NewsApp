package com.codingtest.newsapp.repository;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import com.codingtest.newsapp.api.ApiModule;
import com.codingtest.newsapp.api.ApiService;
import com.codingtest.newsapp.model.NewsResponse;
import com.codingtest.newsapp.utils.Resource;
import com.codingtest.newsapp.utils.ResourcesProvider;
import javax.inject.Inject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HeadLineRepository
{
    private static final String TAG = HeadLineRepository.class.getSimpleName();
    private final ApiService apiService;
    private  ApiModule apiModule;
    private ResourcesProvider resourcesProvider;
    public MutableLiveData<Resource<NewsResponse>> _responseNewList = new MutableLiveData<>();


    @Inject
    public HeadLineRepository(ApiService apiService,ResourcesProvider resourcesProvider) {
        this.apiService = apiService;
        this.resourcesProvider = resourcesProvider;

    }

    /**
     * Api call for display News Article
     * @param country
     * @param  apikey
     */
    public void findNewsArticle(String country, String apikey) {
        _responseNewList.postValue(Resource.loading(null));
        Call<NewsResponse> responseArticleCall= apiService.fetchNewsArticle(country,apikey);
        responseArticleCall.enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                handleFindPrinterListData(response);
                Log.d("API Success","API Success");
            }
            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {
                Log.d("API Failed","API Failed");
            }
        });
    }

    /**
     * handled  news article response
     */
    private void handleFindPrinterListData(Response<NewsResponse> response) {
        try{
            if(response.isSuccessful()){
                _responseNewList.postValue(Resource.success(response.body()));
            }
            else
            {

            }
        } catch (Exception message){ }



    }
}
