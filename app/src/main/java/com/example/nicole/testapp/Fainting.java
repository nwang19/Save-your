package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.app.*;
import android.view.*;
import android.widget.*;
import android.graphics.Color;
import android.net.Uri;


public class Fainting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fainting);
    }
    public void openFaintingInstructions(View view){
        Intent intent = new Intent(Fainting.this, FaintingInstructions.class);
        startActivity(intent);
    }
    public void openMoreFainting(View view){
        Intent intent = new Intent(Fainting.this, MoreFainting.class);
        startActivity(intent);
    }
}
