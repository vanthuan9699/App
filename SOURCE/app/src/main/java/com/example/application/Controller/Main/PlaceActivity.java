package com.example.application.Controller.Main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.application.Controller.Main.Adapter.NewsAdapter;
import com.example.application.Model.Example;
import com.example.application.R;
import com.example.application.Util.Util;
import com.google.gson.Gson;

public class PlaceActivity extends AppCompatActivity {
    Example example;
    RecyclerView rvPlace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        String strExample = Util.loadJSONFromAsset(this);
        Gson gson = new Gson();
        example = gson.fromJson(strExample, Example.class);
        init();
        configRvPlace();


    }
    void init() {
        rvPlace = findViewById(R.id.id_place);
    }
    void configRvPlace(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        rvPlace.setLayoutManager(linearLayoutManager);
        NewsAdapter adapter = new NewsAdapter();



    }
    class NewsViewHoler extends RecyclerView.ViewHolder{
        TextView tvTitle;
        public NewsViewHoler(View itemView){
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
        }
    }
}
