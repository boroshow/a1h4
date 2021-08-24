package com.example.a1h4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        replaceFragment(new SecondFragment(),R.id.firstCont);
        replaceFragment(new FirstFragment(),R.id.secondCont);

    }

    public void replaceFragment(Fragment fragment, int container) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(container, fragment);


        transaction.commit();
    }
}