package com.android.kristina.contactapplication.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.android.kristina.contactapplication.fragments.FragmentContacts;
import com.android.kristina.contactapplication.fragments.FragmentFavorites;

public class ContactViewPagerAdapter extends FragmentPagerAdapter {

    private static final int NUMBER_PAGES = 2;
    private static final String TITLE_CONTACTS = "CONTACTS";
    private static final String TITLE_FAVORITES = "FAVORITES";
    private Context context;
    private FragmentContacts mFragmentContacts;
    private FragmentFavorites mFragmentFavorites;

    public ContactViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                mFragmentContacts = new FragmentContacts();
                return mFragmentContacts;

            case 1:
                mFragmentFavorites = new FragmentFavorites();
                return mFragmentFavorites;
        }
        return null;
    }

    @Override
    public int getCount() {
        return NUMBER_PAGES;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return TITLE_CONTACTS;
            case 1:
                return TITLE_FAVORITES;
            default:
                return null;

        }
    }
}
