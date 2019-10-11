package com.codefactory.testrx.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.codefactory.testrx.model.Crime;

import java.util.List;

@Dao
public interface CrimeDAO {

    @Insert
    void insert(Crime crime);

    @Query("DELETE FROM table_crimeType")
    void deleteAll();

    @Query("SELECT * FROM table_crimeType WHERE crimeCode = :code")
    Crime getCrimesByCode(int code);

    @Query("SELECT * FROM table_crimeType WHERE crime_typeName LIKE :crimeString OR crime_typeDescription LIKE :crimeString")
    List<Crime> getCrimesByText(String crimeString);

    @Query("SELECT * FROM table_crimeType")
    List<Crime> getCrimesAll();



}
