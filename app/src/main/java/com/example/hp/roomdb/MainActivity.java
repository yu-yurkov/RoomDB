package com.example.hp.roomdb;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab;
    private static final String TAG = "MainActivity";

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    ArrayList<String> shops;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: pressed!");
                startActivity(new Intent(MainActivity.this, AddShop.class));
            }
        });


        shops = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {
            shops.add("Магазин: " + i);
        }

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AddShopAdapter(shops);
        recyclerView.setAdapter(adapter);

    }

}
