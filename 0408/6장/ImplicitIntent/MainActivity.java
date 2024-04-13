package com.example.a0408test4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Intent intent = null;
        if (view.getId() == R.id.web) {
            intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.google.com"));
        } else if (view.getId() == R.id.call){
            intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.google.com"));
        } else if (view.getId()== R.id.map) {
            intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.google.com"));
        } else if (view.getId() == R.id.contact) {
            intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.google.com"));
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}