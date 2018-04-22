package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BleedingOutInstructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bleeding_out_instructions);
    }
    public void openMoreInstructions(View view){
        Intent intent = new Intent(BleedingOutInstructions.this, BleedingOutInstructions2.class);
        startActivity(intent);
    }
}
