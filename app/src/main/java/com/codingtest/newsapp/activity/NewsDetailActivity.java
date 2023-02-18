package com.codingtest.newsapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.codingtest.newsapp.databinding.ActivityNewsDetailBinding;
import com.codingtest.newsapp.model.NewsArticleModel;
import com.squareup.picasso.Picasso;

public class NewsDetailActivity extends AppCompatActivity {

      ActivityNewsDetailBinding binding;
      NewsArticleModel newsArticleModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNewsDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        newsArticleModel = (NewsArticleModel) args.getSerializable("data");

        binding.textDetailTitle.setText(newsArticleModel.getTitle());
        binding.textDetailAuthor.setText(newsArticleModel.getAuthor());
        binding.textDetailTime.setText(newsArticleModel.getPublishedAt());
        binding.textDetailDetail.setText(newsArticleModel.getDescription());
        binding.textDetailContent.setText(newsArticleModel.getContent());

        Picasso.get().load(newsArticleModel.getUrlToImage()).into(binding.imgDetailNews);
    }
}