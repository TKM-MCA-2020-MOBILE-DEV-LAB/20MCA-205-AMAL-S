package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fragement1Start(View view){
        replaceFragement(new Fragment_1());
    }

    public void fragement2Start(View view){
        replaceFragement(new Fragment_2());
    }

    public void replaceFragement(Fragment pragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        final FragmentTransaction replace;
        ft.replace(R.id.fra, pragment);
        ft.commit();
    }

}