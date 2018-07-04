package com.android.kristina.contactapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ContactViewPagerAdapter extends FragmentPagerAdapter {


    public ContactViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentContacts();

            case 1:
                return new FragmentFavorites();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
