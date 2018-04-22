package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DifficultyBreathing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty_breathing);
    }
    public void openInstructions(View view){
        Intent intent = new Intent(DifficultyBreathing.this, DBInstructions.class);
        startActivity(intent);
    }
    public void openMoreDB(View view){
        Intent intent = new Intent(DifficultyBreathing.this, DB2.class);
        startActivity(intent);
    }
}
