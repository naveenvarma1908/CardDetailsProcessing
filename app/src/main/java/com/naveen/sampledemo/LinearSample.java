package com.naveen.sampledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LinearSample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_sample);

        getSupportActionBar().hide();
    }
}
