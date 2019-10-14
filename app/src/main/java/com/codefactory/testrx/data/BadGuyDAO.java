package com.codefactory.testrx.data;

import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.codefactory.testrx.model.BadGuy;

import java.util.List;

@Dao
public interface BadGuyDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(BadGuy badGuy);

    @Update(onConflict = OnConflictStrategy.IGNORE)
    int update(BadGuy badGuy);

    @Query("DELETE FROM table_badGuy")
    void deleteAll();

    @Query("DELETE FROM table_badGuy WHERE badGuyCode = :code")
    void deleteBadGuyByCode(int code);

    @Delete
    void deleteBadGuys( BadGuy... badGuys);

    @Query("SELECT * FROM table_badGuy")
    MutableLiveData<List<BadGuy>> getBadGuyAll();

    @Query("SELECT * FROM table_badGuy WHERE badGuyCode = :code")
    MutableLiveData<BadGuy> getBadGuyByCode(int code);






}
