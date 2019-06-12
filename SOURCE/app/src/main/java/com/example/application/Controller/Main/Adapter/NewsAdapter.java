package com.example.application.Controller.Main.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.application.Model.Example;
import com.example.application.Model.Result;
import com.example.application.R;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHoler>  {
    public List<Example> data;
    Context context;
    public void setContext(Context context){
        this.context = context;
    }
    public  void setData(List<Example> data){
        this.data = data;
    }

    @NonNull
    @Override
    public NewsViewHoler onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.news_item_layout, viewGroup, false);
        NewsViewHoler newsViewHoler = new NewsViewHoler(view);
        return newsViewHoler;


    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHoler newsViewHoler, int i) {
        

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class NewsViewHoler extends RecyclerView.ViewHolder{
        TextView tvTitle;
        public NewsViewHoler(View itemView){
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
        }
    }


}
