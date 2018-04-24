package com.example.nicole.testapp;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DBInstructions extends MainActivity {
    AppDataBase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbinstructions);
        db = Room.databaseBuilder(getApplicationContext(),
                AppDataBase.class, "database-name").build();
        AppDataBase database = AppDataBase.getDatabase(getBaseContext());
        InstructionDao dao = database.instructionDao();
        
        List<String> list = new ArrayList();
    }


}
