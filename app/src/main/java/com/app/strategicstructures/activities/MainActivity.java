package com.app.strategicstructures.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.app.strategicstructures.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        init();
    }

    private void init() {

    }
}