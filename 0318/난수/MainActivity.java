package com.example.rotation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnGuess;
    EditText Num;
    TextView hint;
    int random = (int) (Math.random()*100)+1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnGuess = findViewById(R.id.guess);
        Num = findViewById(R.id.Num);
        hint = findViewById(R.id.hint);
    }
    public void btnGuess(View view) {
        if(random>Integer.parseInt(Num.getText().toString())) hint.setText("LOW!");
        else if(random<Integer.parseInt(Num.getText().toString())) hint.setText("HIGH!");
            else hint.setText("GOOD!");
        }
}