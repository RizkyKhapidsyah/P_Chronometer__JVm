package com.rizkykhapidsyah.p_chronometer__jvm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView TV_Judul_IDJAVA;
    Chronometer C_Chronometer1_IDJAVA;
    Button B_StartChronometer_IDJAVA,
            B_StopChronometer_IDJAVA,
            B_RestartChronometer_IDJAVA,
            B_Keluar_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV_Judul_IDJAVA = findViewById(R.id.TV_Judul_IDXML);
        C_Chronometer1_IDJAVA = findViewById(R.id.C_Chronometer1_IDXML);
        B_StartChronometer_IDJAVA = findViewById(R.id.B_StartChronometer_IDXML);
        B_StopChronometer_IDJAVA = findViewById(R.id.B_StopChronometer_IDXML);
        B_RestartChronometer_IDJAVA = findViewById(R.id.B_RestartChronometer_IDXML);
        B_Keluar_IDJAVA = findViewById(R.id.B_Keluar_IDXML);

        B_StartChronometer_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C_Chronometer1_IDJAVA.start();
            }
        });

        B_StopChronometer_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C_Chronometer1_IDJAVA.stop();
            }
        });

        B_RestartChronometer_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C_Chronometer1_IDJAVA.setBase(SystemClock.elapsedRealtime());
            }
        });

        B_Keluar_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
