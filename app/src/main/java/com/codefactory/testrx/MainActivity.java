package com.codefactory.testrx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentOne.OnFragmentOneInteractionListener, FragmentTwo.OnFragmentTwoInteractionListener {

/*
https://developer.android.com/training/data-storage/room/relationships
https://developer.android.com/training/data-storage/room/accessing-data
https://developer.android.com/training/data-storage/room/defining-data.html

https://github.com/googlecodelabs/android-room-with-a-view/tree/master/app/src/main/java/com/example/android/roomwordssample
https://github.com/android/architecture-components-samples/tree/master/BasicRxJavaSample/app

http://androidcode.pl/blog/biblioteki/rxjava/
http://devzine.pl/2019/04/16/rxjava-w-androidzie-podstawy-cz-1/
 */

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
