package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BleedingOut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bleeding_out);
    }
    public void openBleedingOutInstructions(View view){
        Intent intent = new Intent(BleedingOut.this, BleedingOutInstructions.class);
        startActivity(intent);
    }
    public void openBleedingOu2(View view){
        Intent intent = new Intent(BleedingOut.this, BleedingOutInstructions2.class);
        startActivity(intent);
    }
}
