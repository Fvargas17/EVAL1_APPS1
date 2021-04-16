package com.example.eva1_1_primer_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //CICLO DE VIDA DE LA APP 1ER EVENTO DEL CICLO
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}