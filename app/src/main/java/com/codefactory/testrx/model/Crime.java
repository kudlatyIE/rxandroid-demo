package com.codefactory.testrx.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_crimeType")
public class Crime {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "rowid")
    private int crimeTypeId;

    @NonNull
    @ColumnInfo(name = "crimeCode")
    private int crimeCode;

    @NonNull
    @ColumnInfo(name = "crime_typeName")
    private String crimeTypeName;

    @NonNull
    @ColumnInfo(name = "crime_typeDescription")
    private String crimeTypeDescription;

    public Crime(int crimeCode, String crimeTypeName, String crimeTypeDescription) {
        this.crimeCode = crimeCode;
        this.crimeTypeName = crimeTypeName;
        this.crimeTypeDescription = crimeTypeDescription;
    }

    public int getCrimeTypeId() {
        return crimeTypeId;
    }

    public String getCrimeTypeName() {
        return crimeTypeName;
    }

    public void setCrimeTypeName(@NonNull String crimeTypeName) {
        this.crimeTypeName = crimeTypeName;
    }

    @NonNull
    public String getCrimeTypeDescription() {
        return crimeTypeDescription;
    }

    public void setCrimeTypeDescription(@NonNull String crimeTypeDescription) {
        this.crimeTypeDescription = crimeTypeDescription;
    }

    public int getCrimeCode() {
        return crimeCode;
    }

    public void setCrimeCode(int crimeCode) {
        this.crimeCode = crimeCode;
    }
}
