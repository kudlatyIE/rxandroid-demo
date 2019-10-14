package com.codefactory.testrx.data;

import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.codefactory.testrx.model.Crime;

import java.util.List;

@Dao
public interface CrimeDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Crime crime);

    @Update(onConflict = OnConflictStrategy.IGNORE)//@Query("UPDATE table_crimeType SET crime_typeName = :crime")
    int update(Crime crime);

    @Query("DELETE FROM table_crimeType")
    void deleteAll();

    @Query("SELECT * FROM table_crimeType WHERE crimeCode = :code")
    MutableLiveData<Crime> getCrimesByCode(int code);

    @Query("SELECT * FROM table_crimeType WHERE crime_typeName LIKE :crimeString OR crime_typeDescription LIKE :crimeString")
    MutableLiveData<List<Crime>> getCrimesByText(String crimeString);

    @Query("SELECT * FROM table_crimeType")
    MutableLiveData<List<Crime>> getCrimesAll();



}
