package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.app.*;
import android.view.*;
import android.widget.*;
import android.graphics.Color;
import android.net.Uri;

public class MoreFainting extends Fainting {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_fainting);
    }
    public void moreFaintingInstructions(View view){
        Intent intent = new Intent(MoreFainting.this, FaintingInstructions2.class);
        startActivity(intent);
    }
}
