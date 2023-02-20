package com.codingtest.newsapp.model;

import java.io.Serializable;
import java.util.List;

public class NewsResponse implements Serializable {

    String status;
    int totalResults;
    List<NewsArticleModel> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<NewsArticleModel> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsArticleModel> articles) {
        this.articles = articles;
    }

}
