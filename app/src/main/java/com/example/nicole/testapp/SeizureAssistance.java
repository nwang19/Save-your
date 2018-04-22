package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SeizureAssistance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seizure_assistance);
    }
    public void openSevere(View view){
        Intent intent  = new Intent(SeizureAssistance.this, SeizureSteps.class);
        startActivity(intent);
    }
    public void openMild(View view){
        Intent intent = new Intent(SeizureAssistance.this, MildSeizure.class);
        startActivity(intent);
    }
}
