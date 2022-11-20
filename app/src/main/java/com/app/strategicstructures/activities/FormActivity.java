package com.app.strategicstructures.activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;

import com.app.strategicstructures.databinding.ActivityFormBinding;
import com.app.strategicstructures.databinding.ActivityFormIncludeBinding;
import com.app.strategicstructures.libs.others.Chronometer;
import com.app.strategicstructures.libs.parallelrefresh.Content;
import com.app.strategicstructures.libs.parallelrefresh.ParallelRefresh;

@RequiresApi(api = Build.VERSION_CODES.O)
public class FormActivity extends AppCompatActivity implements Content {

    ActivityFormBinding b;
    ActivityFormIncludeBinding caminhada;
    ActivityFormIncludeBinding corrida;
    ActivityFormIncludeBinding corda;
    ParallelRefresh parallelRefresh = new ParallelRefresh(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityFormBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        init();
    }

    private void init() {
        caminhada = b.caminhada;
        caminhada.master.setText("Caminhada: ");

        corrida = b.corrida;
        corrida.master.setText("Corrida: ");

        corda = b.corda;
        corda.master.setText("Pular Corda: ");

        Chronometer.resume();
    }

    @Override
    public void content() {
        b.imcText.setText(Chronometer.getTimer());
    }
}