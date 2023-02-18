package com.codingtest.newsapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.codingtest.newsapp.R;
import com.codingtest.newsapp.activity.MainActivity;
import com.codingtest.newsapp.clicklisteners.SelectListener;
import com.codingtest.newsapp.model.NewsArticleModel;
import com.codingtest.newsapp.viewholders.HeadlineViewHolder;
import com.squareup.picasso.Picasso;
import java.util.List;

public class HeadLineAdapter extends RecyclerView.Adapter<HeadlineViewHolder>{

   private Context  ctx;
   private List<NewsArticleModel> newsArticle;
    public MainActivity  activity;
    private SelectListener listener;

    public HeadLineAdapter(List<NewsArticleModel> newsArticle,Context ctx,MainActivity activity,SelectListener listener ) {
        this.ctx = ctx;
        this.newsArticle = newsArticle;
        this.activity = activity;
        this.listener = listener;
    }

    @NonNull
    @Override
    public HeadlineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HeadlineViewHolder(LayoutInflater.from(ctx).inflate(R.layout.row_items_headlines,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HeadlineViewHolder holder, int position) {
        holder.text_title.setText(newsArticle.get(position).getTitle());
        holder.text_source.setText(newsArticle.get(position).getSource().getName());

        if(newsArticle.get(position).getUrlToImage()!=null)
        {
            Picasso.get().load(newsArticle.get(position).getUrlToImage()).into(holder.image_headline);
        }

         holder.headline_cardview.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 listener.OnNewsClicked(newsArticle.get(position));
             }
         });

    }

    @Override
    public int getItemCount() {
        return newsArticle.size();
    }
}
