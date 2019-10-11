package com.codefactory.testrx.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.codefactory.testrx.model.BadGuy;

import java.util.List;

@Dao
public interface BadGuyDAO {

    @Insert
    void insert(BadGuy badGuy);

    @Query("DELETE FROM table_badGuy")
    void deleteAll();

    @Query("DELETE FROM table_badGuy WHERE badGuyCode = :code")
    void deleteBadGuyByCode(int code);

    @Delete
    void deleteBadGuys( BadGuy... badGuys);

    @Query("SELECT * FROM table_badGuy")
    List<BadGuy> getBadGuyAll();

    @Query("SELECT * FROM table_badGuy WHERE badGuyCode = :code")
    BadGuy getBadGuyByCode(int code);



}
