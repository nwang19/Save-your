package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MoreStroke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_stroke);
    }
    public void openDefault(View view){
        Intent intent = new Intent(MoreStroke.this, DefaultPage.class);
        startActivity(intent);
    }
    public void openStroke(View view){
        Intent intent = new Intent(MoreStroke.this, Stroke.class);
        startActivity(intent);
    }
}
