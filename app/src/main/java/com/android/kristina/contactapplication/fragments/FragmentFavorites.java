package com.android.kristina.contactapplication.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import com.android.kristina.contactapplication.R;
import com.android.kristina.contactapplication.adapters.FavoritesAdapter;

public class FragmentFavorites extends Fragment {


    private static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null){

            mPage=getArguments().getInt(ARG_PAGE);
        }
    }
    FavoritesAdapter.OnFavoriteSelectedListener mOnFavoriteSelectedListener=new FavoritesAdapter.OnFavoriteSelectedListener() {
        @Override
        public void onRemoveContactFromFavorites(int position) {

        }
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fragment_favorites, container, false);


        return  view;
    }


}