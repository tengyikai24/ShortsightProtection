package com.bignerdranch.android.shortsightprotection;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/**
 * Created by alex on 2017-07-12.
 */

public class InformationActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        // To create the layout of the second fragment
        FragmentManager fm2=getFragmentManager();
        Fragment fragment2= fm2.findFragmentById(R.id.fragmentContainer2);

        if (fragment2==null){
            fragment2=new InformationFragment();
            fm2.beginTransaction().add(R.id.fragmentContainer2,fragment2).commit();
        }

    }
}
