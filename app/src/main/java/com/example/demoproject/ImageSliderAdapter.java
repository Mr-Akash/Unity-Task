package com.example.demoproject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ImageSliderAdapter extends RecyclerView.Adapter<ImageSliderAdapter.ViewHolder> {

    Context context;
    List<ImageList> imageLists = new ArrayList<>();


    public ImageSliderAdapter(Context context, List<ImageList> imageLists) {
        this.context = context;
        this.imageLists = imageLists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        ViewHolder vh;
        switch (viewType) {
            case 1:
                v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.image_lay1, parent, false);
                vh = new ViewHolder(v);
                return  vh;
            default:
                v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.image_lay2, parent, false);
                vh = new ViewHolder(v);
                return vh;
        }

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

       /* Picasso.get()
                .load(imageLists.get(position).getImageUrl())
                .into(holder.imageView);*/

        Glide.with(context)
                .load(imageLists.get(position).getImageUrl())
                .centerCrop()
                .placeholder(R.drawable.image1)
                .into(holder.imageView);
    }


    @Override
    public int getItemViewType(int position) {
        int viewType;
        if (position % 2 == 0) {
            viewType = 1;
        } else {
            viewType = 2;
        }
        return viewType;
    }

    @Override
    public int getItemCount() {
        return imageLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.even_image);
        }
    }
}
