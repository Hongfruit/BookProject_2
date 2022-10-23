package com.example.bookproject;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SubActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    ArrayList<DynamicRVModel> items = new ArrayList();
    DynamicRVAdapter dynamicRVAdapter;
    int pos;

    @Override
    protected void onCreate(Bundle saveInstanceState) {



        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_sub);

        recyclerView = findViewById(R.id.rv_1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        items = new ArrayList<>();

    }



}
