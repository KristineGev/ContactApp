package com.android.kristina.contactapplication.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.android.kristina.contactapplication.R;
import com.android.kristina.contactapplication.item.Contact;
import com.android.kristina.contactapplication.viewHolder.ViewHolderContacts;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ViewHolderContacts> {


    private List<Contact> mContacts;
    private Context mContext;

    public ContactAdapter(List<Contact> contacList, Context context){
        mContext=context;
        mContacts=new ArrayList<>();
        mContacts.addAll(contacList);

    }

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
     Contact contact=mContacts.get(position);
        holder.getmNameText().setText(contact.getName());
          holder.getmNumberText().setText(contact.getNumber());

    }


    @Override
    public int getItemCount() {
        return mContacts.size();
    }

public interface OnContactSelectedListener{
        void onAddtoFavorites();

}
}