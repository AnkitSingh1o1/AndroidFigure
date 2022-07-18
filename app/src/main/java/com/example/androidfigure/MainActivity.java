package com.example.androidfigure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Head
        if(savedInstanceState == null) {
            BodyPartFragment headFragment = new BodyPartFragment();
            headFragment.setImageIds(AndroidImageAsset.getHeads());
            headFragment.setListIndex(0);
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().add(R.id.head_container, headFragment).commit();

            //Abdomen
            BodyPartFragment abdomenFragment = new BodyPartFragment();
            abdomenFragment.setImageIds(AndroidImageAsset.getBodies());
            abdomenFragment.setListIndex(0);
            fragmentManager.beginTransaction().add(R.id.abdomen_container, abdomenFragment).commit();

            //Legs
            BodyPartFragment legFragment = new BodyPartFragment();
            legFragment.setImageIds(AndroidImageAsset.getLegs());
            legFragment.setListIndex(0);
            fragmentManager.beginTransaction().add(R.id.leg_container, legFragment).commit();
        }

    }
}