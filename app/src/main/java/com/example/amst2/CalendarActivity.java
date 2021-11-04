package com.example.amst2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class CalendarActivity extends AppCompatActivity {
    public TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        CalendarView calendarView = findViewById(R.id.calendarView);
        textView= findViewById(R.id.mydate);
        calendarView.setOnDateChangeListener((calendarView1, i, i1, i2) -> {
            String date = (i1+1) + "/" + i2 + "/" + i ;
            switch (date) {
                case "11/2/2019":
                    textView.setText("Feriado");
                    break;
                case "11/3/2019":
                    textView.setText("Presentacion TA2");
                    break;
                case "11/19/2019":
                    textView.setText("Cumpleaños Karla");
                    break;
                default:
                    textView.setText(date);
                    break;
            }
        });
    }
}