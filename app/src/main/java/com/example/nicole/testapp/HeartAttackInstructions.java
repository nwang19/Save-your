package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HeartAttackInstructions extends AppCompatActivity {
//but it's actually symptoms

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_attack_instructions);
    }
    public void openMoreChestPain(View view){
        Intent intent = new Intent(HeartActivityInstructions.this, MoreChestPain.class);
        startActivity(intent);
    }
}
