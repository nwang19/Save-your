package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StrokeInstructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stroke_instructions);
    }
    public void openMoreStroke(View view){
        Intent intent = new Intent(StrokeInstructions.this, MoreStroke.class);
        startActivity(intent);
    }
    public void openStroke(View view){
        Intent intent = new Intent(StrokeInstructions.this, Stroke.class);
        startActivity(intent);
    }
}
