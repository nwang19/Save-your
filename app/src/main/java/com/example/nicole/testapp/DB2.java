package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DB2 extends DifficultyBreathing{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db2);
    }
    public void openDb2Instructions(View view){
        Intent intent = new Intent (DB2.this, DBInstructions2.class);
        startActivity(intent);
    }
}
