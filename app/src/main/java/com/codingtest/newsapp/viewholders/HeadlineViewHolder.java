package com.codingtest.newsapp.viewholders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HeadlineViewHolder extends RecyclerView.ViewHolder{
    public TextView printerCount;
    public TextView printerName;
    View view;

    public HeadlineViewHolder(@NonNull View itemView) {
        super(itemView);
      //  printerCount = itemView.findViewById(R.id.printerCount);
      //  printerName = itemView.findViewById(R.id.printerName);
        view = itemView;
    }
}
