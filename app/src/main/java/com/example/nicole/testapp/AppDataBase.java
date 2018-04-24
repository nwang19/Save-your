package com.example.nicole.testapp;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Instruction.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract InstructionDao instructionDao();

    private static AppDataBase INSTANCE;


    static AppDataBase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (AppDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDataBase.class, "instruction_database")
                            .build();

                }
            }
        }
        return INSTANCE;
    }
}