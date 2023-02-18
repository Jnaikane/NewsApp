package com.codingtest.newsapp.api;


import com.codingtest.newsapp.model.NewsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface ApiService {

    @GET("v2/top-headlines")
    Call<NewsResponse> fetchNewsArticle(@Query("country") String country, @Query("apiKey") String api_key);
}
