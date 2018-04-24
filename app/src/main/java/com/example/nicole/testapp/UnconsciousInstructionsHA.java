package com.example.nicole.testapp;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;

public class UnconsciousInstructionsHA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unconscious_instructions_h);
    }
    public void moreinstructions(View view){
        Intent intent = new Intent(UnconsciousInstructionsHA.this, HAInstructions2.class);
        startActivity(intent);
    }

}
