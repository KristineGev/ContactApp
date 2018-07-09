package com.android.kristina.contactapplication.viewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.kristina.contactapplication.R;

public class ViewHolderContacts extends RecyclerView.ViewHolder {
    private TextView mNameText;
    private TextView mNumberText;
    private ImageView mStar;
    private boolean isFavorite = false;
    private OnContactSelectedListener onContactSelectedListener;

    public ViewHolderContacts(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.contact_item_view, parent, false));
    }

    public void setOnContactSelectedListener(OnContactSelectedListener onContactSelectedListener) {
        this.onContactSelectedListener = onContactSelectedListener;
    }

    public ViewHolderContacts(View itemView) {
        super(itemView);
        mNumberText = itemView.findViewById(R.id.contact_number);
        mNameText = itemView.findViewById(R.id.contact_name);
        mStar = itemView.findViewById(R.id.star);
        mStar.setOnClickListener(onStarClickListener);
    }

    public TextView getmNameText() {
        return mNameText;
    }

    public void setmNameText(TextView mNameText) {
        this.mNameText = mNameText;
    }

    public TextView getmNumberText() {
        return mNumberText;
    }

    public void setmNumberText(TextView mNumberText) {
        this.mNumberText = mNumberText;
    }

    public ImageView getmStar() {
        return mStar;
    }

    public void setmStar(ImageView mStar) {
        this.mStar = mStar;
    }


    View.OnClickListener onStarClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (onContactSelectedListener != null) {
                onContactSelectedListener.onSelectContact(getAdapterPosition(), isFavorite);

            }
        }
    };

    public interface OnContactSelectedListener {
        void onSelectContact(int position, boolean isFavorite);
    }
}
