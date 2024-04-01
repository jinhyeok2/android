package com.example.ratingbartest2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private RatingBar Rating;
    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        Rating = (RatingBar) findViewById(R.id.Rating);
        textView = (TextView) findViewById(R.id.textView);
    }
    public void btn(View view) {
        float rating = Rating.getRating();
        textView.setText(String.valueOf("SCORE="+ rating));
    }
}