package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BleedingOutInstructions2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bleeding_out_instructions2);
    }
    public void openShock(View view){
        Intent intent = new Intent (BleedingOutInstructions2.this, PreventShock.class);
        startActivity(intent);

    }
    public void openTourniquet(View view){
        Intent intent = new Intent(BleedingOutInstructions2.this, Tourniquet.class);
        startActivity(intent);
    }
}
