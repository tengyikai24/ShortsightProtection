package com.bignerdranch.android.shortsightprotection;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/**
 * Created by alex on 2017-07-13.
 */

public class CameraActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        // To create the layout of the third fragment
        FragmentManager fm3=getFragmentManager();
        Fragment fragment3= fm3.findFragmentById(R.id.fragmentContainer3);

        if (fragment3==null){
            fragment3=new InformationFragment();
            fm3.beginTransaction().add(R.id.fragmentContainer3,fragment3).commit();
        }

    }
}
