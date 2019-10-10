package com.codefactory.testrx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentOne.OnFragmentOneInteractionListener, FragmentTwo.OnFragmentTwoInteractionListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews(){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        Fragment fragmentOne = FragmentOne.newInstance("start one", null);
        Fragment fragmentTwo = FragmentTwo.newInstance("start Two!!!", null);

        transaction.add(R.id.container_fragmentOne, fragmentOne);
        transaction.add(R.id.container_fragmentTwo, fragmentTwo);
        transaction.commit();
    }


    @Override
    public void onFragmentOneInteraction(boolean isDone, String message) {

    }

    @Override
    public void onFragmentTwoInteraction(boolean isDone, String message) {

    }
}
