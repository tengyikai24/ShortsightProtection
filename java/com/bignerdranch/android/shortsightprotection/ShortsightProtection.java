package com.bignerdranch.android.shortsightprotection;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ShortsightProtection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shortsight_protection);

        // To create the layout of the first fragment
        FragmentManager fm1=getFragmentManager();
        Fragment fragment1= fm1.findFragmentById(R.id.fragmentContainer);

        if (fragment1==null){
            fragment1=new InitialFragment();
            fm1.beginTransaction().add(R.id.fragmentContainer,fragment1).commit();
        }

    }


}
