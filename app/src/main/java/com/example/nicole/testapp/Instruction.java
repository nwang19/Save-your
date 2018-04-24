package com.example.nicole.testapp;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by SDSA on 4/23/2018.
 */
@Entity
public class Instruction{
    @PrimaryKey
    private int iid;

    @ColumnInfo(name = "Instruction_text")
    private String instructionText;

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getInstructionText() {
        return instructionText;
    }

    public void setInstructionText(String instructionText) {
        this.instructionText = instructionText;
    }
}
