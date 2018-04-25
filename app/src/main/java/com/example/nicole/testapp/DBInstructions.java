package com.example.nicole.testapp;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DBInstructions extends AppCompatActivity {
    AppDataBase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbinstructions);
        TextView textView = (TextView) findViewById(R.id.textView29);
        textView.setText("Check the person's airway, breathing, and pulse. If necessary, begin CPR.\n" +
                "Loosen any tight clothing.\n" +
                "Help the person use any prescribed medicine (an asthma inhaler or home oxygen).\n" +
                "Continue to monitor the person's breathing and pulse until medical help arrives. \n" +
                "If there are open wounds in the neck or chest, they must be closed immediately, especially if air bubbles appear in the wound. Bandage such wounds at once.\n" +
                "A \"sucking\" chest wound allows air to enter the person's chest cavity with each breath. This can cause a collapsed lung. Bandage the wound with plastic wrap, a plastic bag, or gauze pads covered with petroleum jelly, sealing it except for one corner. This allows trapped air to escape from the chest, but it prevents air from entering the chest through the wound.\n");

    }
    public void call911(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:911"));
        startActivity(intent);
    }


}