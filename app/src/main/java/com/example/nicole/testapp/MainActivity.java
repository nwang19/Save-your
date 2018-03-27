package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.app.*;
import android.view.*;
import android.widget.*;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button)findViewById(R.id.call911);
        myButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                findViewById(R.id.textView).setBackgroundColor(Color.CYAN);
            }
        });
    }

    public void sendMessage(View view){
        System.out.println("button clicked");
    }

    public void openHeartAttackInstructions(View view){
        Intent intent = new Intent(MainActivity.this, HeartAttackInstructions.class);
        startActivity(intent);
    }
    /*public void buttonOnClick(View v)
    {

    }*/
}
