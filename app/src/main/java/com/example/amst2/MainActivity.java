package com.example.amst2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnMapa;
    Button btnVideo;
    Button btnCalen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMapa = findViewById(R.id.btnMapa);
        btnVideo = findViewById(R.id.btnVideo);
        btnCalen=  findViewById(R.id.btnCalen);

        btnMapa.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),MapsActivity.class);
            startActivity(intent);
        });

        btnVideo.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),VideoActivity.class);
            startActivity(intent);
        });

        btnCalen.setOnClickListener(view -> {
            Intent intent= new Intent(getApplicationContext(),CalendarActivity.class);
            startActivity(intent);
        });

    }
}