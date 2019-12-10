package com.example.adminapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter {
    private final Context mcontext;
    private final List<Upload> mUploads;

    public ImageAdapter(Context imagesActivity, List<Upload> muploads) {
        this.mcontext = imagesActivity;
        this.mUploads = muploads;

    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mcontext).inflate(R.layout.activity_crd, parent,false);

        return new ImageViewHolder(v);    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Upload uploadCurrent = mUploads.get(position);
        ((ImageViewHolder)holder).textViewName.setText(uploadCurrent.getmName());
        ((ImageViewHolder)holder).textViewPrice.setText(uploadCurrent.getmPrice());
        ((ImageViewHolder)holder).textViewDesc.setText(uploadCurrent.getmDesc());
        ((ImageViewHolder)holder).textViewQua.setText(uploadCurrent.getmQua());



      //  Picasso.get().load(uploadCurrent.getmImageUrl()).fit().centerCrop().into(((ImageViewHolder)holder).imageView);


    }

    @Override
    public int getItemCount() {
        return mUploads.size();
    }

    private class ImageViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewName,textViewPrice,textViewDesc,textViewQua;
        public ImageView imageView;

        public ImageViewHolder(View v) {
            super(v);

            textViewName = v.findViewById(R.id.textView);
            textViewPrice = v.findViewById(R.id.textView1);
            textViewDesc = v.findViewById(R.id.textView2);
            textViewQua = v.findViewById(R.id.textView3);
            imageView = v.findViewById(R.id.imageView_item_image);


        }
    }
}
