package com.android.kristina.contactapplication.fragments;

import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.kristina.contactapplication.ContactsList;
import com.android.kristina.contactapplication.R;
import com.android.kristina.contactapplication.adapters.ContactAdapter;
import com.android.kristina.contactapplication.item.Contact;

import java.util.List;

public class FragmentContacts extends Fragment {

    private static final String ARG_PAGE = "ARG_PAGE";
  RecyclerView mRecyclerView;
  ContactAdapter mContactAdapter;
  List<Contact> mContact;


    private int mPage;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null){

            mPage=getArguments().getInt(ARG_PAGE);
        }
    }

    public static FragmentContacts newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        FragmentContacts fragment = new FragmentContacts();
        fragment.setArguments(args);
        return fragment;


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fragment_contacts, container, false);
        mRecyclerView=(RecyclerView)view.findViewById(R.id.contacts_recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

         return  view;
    }



    private void getContacts(){
    Contact contact=new Contact();

    Cursor phones = getActivity().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.
            CONTENT_URI, null,null,null, null);
    while (phones.moveToNext())
    {
        String name=phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
        String phoneNumber = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
        contact.setName(name);
        contact.setNumber(phoneNumber);
        ContactsList.getInstance().addContact(contact);

    }
    phones.close();
}


    }

