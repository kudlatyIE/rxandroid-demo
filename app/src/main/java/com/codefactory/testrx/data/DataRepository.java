package com.codefactory.testrx.data;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.codefactory.testrx.model.BadGuy;
import com.codefactory.testrx.model.Crime;

import java.util.List;

public class DataRepository {

    private CrimeDAO mCrimeDAO;
    private BadGuyDAO mBadGuyDAO;
    private MutableLiveData<List<Crime>> mAllCrimes;
    private MutableLiveData<List<BadGuy>> mAllBadGuys;

    DataRepository(Application application){
        AppDataBase db = AppDataBase.getDataBase(application);
        mCrimeDAO = db.crimeDAO();
        mBadGuyDAO = db.badGuyDAO();

        mAllCrimes = mCrimeDAO.getCrimesAll();
        mAllBadGuys = mBadGuyDAO.getBadGuyAll();

    }
}
