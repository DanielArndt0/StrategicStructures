package com.app.strategicstructures.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.app.strategicstructures.databinding.ActivityFormBinding;

public class FormActivity extends AppCompatActivity {

    ActivityFormBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityFormBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        init();
    }

    private void init() {

    }
}