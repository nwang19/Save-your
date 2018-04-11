package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class MoreChestPain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_chest_pain);
    }
    public void default1 (View view){
        Intent intent = new Intent (MoreChestPain.this, DefaultPage.class);
        startActivity(intent);
    }
    public void openinstructions(View view){
        Intent intent = new Intent (MoreChestPain.this, HAInstructions2.class);
        startActivity(intent);
    }
}
