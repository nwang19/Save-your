package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SeizureInstructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seizure_instructions);
    }
    public void openSeizureAssistance(View view){
        Intent intent = new Intent (SeizureInstructions.this, SeizureAssistance.class);
        startActivity(intent);
    }
    public void openMoreSymptoms(View view){
        Intent intent = new Intent (SeizureInstructions.this, MoreSeizure.class);
        startActivity(intent);
    }
}
