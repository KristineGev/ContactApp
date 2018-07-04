package com.android.kristina.contactapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class ContactAdapter extends RecyclerView.Adapter<ViewHolderContacts> {


ViewHolderContacts.OnContactSelectedListener onContactSelectedListener=new ViewHolderContacts.OnContactSelectedListener() {
    @Override
    public void onSelectContact(int position, boolean isFavorite) {

    }
};

    @NonNull
    @Override
    public ViewHolderContacts onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewHolderContacts viewHolderContacts=new ViewHolderContacts(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.fragment_fragment_contacts, parent, false));
        return viewHolderContacts;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderContacts holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
