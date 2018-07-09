package com.android.kristina.contactapplication;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.kristina.contactapplication.adapters.ContactViewPagerAdapter;

public class MainActivity extends AppCompatActivity {


    private ViewPager mViewPager;
    private ContactViewPagerAdapter mContactViewPagerAdapter;
    private TabLayout mtabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.viewPager);
        mtabLayout =findViewById(R.id.contactsTabs);

        mContactViewPagerAdapter = new ContactViewPagerAdapter(getSupportFragmentManager(), MainActivity.this);
        mViewPager.setAdapter(mContactViewPagerAdapter);

        mtabLayout.setupWithViewPager(mViewPager);
        mtabLayout.setSelectedTabIndicatorColor(Color.BLUE);

    }
}
