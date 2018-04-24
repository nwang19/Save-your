package com.example.nicole.testapp;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by SDSA on 4/23/2018.
 */
@Dao
public interface InstructionDao {
    @Query("SELECT * FROM instruction")
    List<Instruction> getallInstructions();

    @Insert
    void insertAll(Instruction... instructions);
}
