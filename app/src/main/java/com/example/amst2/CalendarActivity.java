package com.example.amst2;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class CalendarActivity extends AppCompatActivity {
    private static final String TAG = "Calendario";
    private CalendarView calendarView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        calendarView=(CalendarView) findViewById(R.id.calendarView);
        textView=(TextView)findViewById(R.id.mydate);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = (i1+1) + "/" + i2 + "/" + i ;
                if(date.equals("11/2/2019")) textView.setText("Feriado");
                else if(date.equals("11/3/2019")) textView.setText("Presentacion TA2");
                else if(date.equals("11/19/2019")) textView.setText("Cumpleaños Karla");
                else {
                    textView.setText(date);
                }
            }
        });
    }
}