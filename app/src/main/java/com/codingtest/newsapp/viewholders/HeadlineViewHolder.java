package com.codingtest.newsapp.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.codingtest.newsapp.R;

public class HeadlineViewHolder extends RecyclerView.ViewHolder{
    public CardView headline_cardview;
    public TextView text_title,text_source;
    public ImageView image_headline;
    View view;

    public HeadlineViewHolder(@NonNull View itemView) {
        super(itemView);
        text_title = itemView.findViewById(R.id.text_title);
        text_source = itemView.findViewById(R.id.text_source);
        headline_cardview = itemView.findViewById(R.id.headline_cardview);
        image_headline = itemView.findViewById(R.id.image_headline);
        view = itemView;
    }
}
