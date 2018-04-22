package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MoreSeizure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_seizure);
    }
    public void openEmergencyCheck(View view)
    {
        Intent intent = new Intent(MoreSeizure.this, SeizureAssistance.class);
        startActivity(intent);
    }
    public void defaultPage(View view)
    {
        Intent intent = new Intent(MoreSeizure.this, DefaultPage.class);
        startActivity(intent);
    }

}
