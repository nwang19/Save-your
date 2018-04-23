package com.example.nicole.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.app.*;
import android.view.*;
import android.widget.*;
import android.graphics.Color;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // myButton = (Button)findViewById(R.id.call911);
        //myButton.setOnClickListener(new View.OnClickListener() {
          //  public void onClick(View v) {
            //    findViewById(R.id.textView).setBackgroundColor(Color.CYAN);
          //  }
      //  });
    }


    public void openHeartAttackInstructions(View view){
        Intent intent = new Intent(MainActivity.this, HeartAttackInstructions.class);
        startActivity(intent);
    }
    public void call911(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:911"));
        startActivity(intent);
    }
    public void openFainting(View view){
        Intent intent = new Intent(MainActivity.this, Fainting.class);
        startActivity(intent);
    }
    public void openBleedingOut(View view){
        Intent intent = new Intent (MainActivity.this, BleedingOut.class);
        startActivity(intent);
    }
    public void openDB(View view){
        Intent intent = new Intent(MainActivity.this, DifficultyBreathing.class);
        startActivity(intent);
    }
    public void openStroke(View view){
        Intent intent = new Intent (MainActivity.this, StrokeInstructions.class);
        startActivity(intent);
    }
    public void openSeizue(View view){
        Intent intent = new Intent(MainActivity.this, SeizureInstructions.class);
        startActivity(intent);
    }

}
