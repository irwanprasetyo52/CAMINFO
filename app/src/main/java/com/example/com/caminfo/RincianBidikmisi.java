package com.example.com.caminfo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class RincianBidikmisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rincian_bidikmisi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
