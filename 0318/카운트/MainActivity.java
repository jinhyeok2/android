package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    private TextView counter;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        counter = findViewById(R.id.counter);
        counter.setText("카운트: " + count);
    }
        public void btn1(View view) {
            counter.setText("카운트: " + count++);
            return;
        }
        public void btn2(View view) {
            counter.setText("카운트: " + count--);
            return;
        }




}