package com.codingtest.newsapp.viewmodel;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.app.Application;
import android.arch.core.executor.testing.InstantTaskExecutorRule;

import androidx.lifecycle.Observer;

import com.codingtest.newsapp.api.ApiModule;
import com.codingtest.newsapp.api.ApiService;
import com.codingtest.newsapp.model.NewsArticleModel;
import com.codingtest.newsapp.model.NewsResponse;
import com.codingtest.newsapp.repository.HeadLineRepository;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import io.reactivex.Single;
import retrofit2.Call;

@RunWith(MockitoJUnitRunner.class)
public class HeadlinesViewModelTest
{
    @Rule
    public InstantTaskExecutorRule instantExecutorRule = new InstantTaskExecutorRule();

    @Mock
    ApiService apiEndPoint;
    @Mock
    NewsArticleModel newsArticleModel;

    @Mock
    HeadLineRepository headLineRepository;

    @Mock
    ApiModule apiClient;
    private HeadlinesViewModel viewModel;
    @Mock
    Observer<NewsArticleModel> observer;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        viewModel = new HeadlinesViewModel((Application) apiEndPoint, headLineRepository);

    }

    @Test
    public void testApiFetchDataSuccess() {
        // Mock API response
        when(apiEndPoint.fetchNewsArticle("in","asd8f78sad78da8df78sd")).thenReturn((Call<NewsResponse>) Single.just(new NewsArticleModel()));
        viewModel.getArticleList("in","asd8f78sad78da8df78sd");
        verify(observer).onChanged(newsArticleModel);

    }

    @After
    public void tearDown() throws Exception {
        apiClient = null;
        viewModel = null;
    }
}
