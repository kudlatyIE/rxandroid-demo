package com.codefactory.testrx.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_badGuy",
        foreignKeys =  @ForeignKey(entity = Crime.class, parentColumns = "crimeCode", childColumns = "crime_area_id")
        )
public class BadGuy {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "rowid")
    private int id;

    @NonNull
    @ColumnInfo(name = "badGuyCode")
    private int badGuyCode;

    @NonNull
    @ColumnInfo(name = "badGuy_name")
    private String badGuyName;

    @NonNull
    @ColumnInfo(name = "crime_area_id")
    int crimeAreaId;

    public BadGuy(int badGuyCode, @NonNull String badGuyName) {
        this.badGuyCode = badGuyCode;
        this.badGuyName = badGuyName;
    }

    public int getBadGuyId() {
        return badGuyCode;
    }

    public void setBadGuyCode(int badGuyCode) {
        this.badGuyCode = badGuyCode;
    }

    @NonNull
    public String getBadGuyName() {
        return badGuyName;
    }

    public void setBadGuyName(@NonNull String badGuyName) {
        this.badGuyName = badGuyName;
    }
}
