package com.example.taimeasure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;


    public class UpdateAdapter extends ArrayAdapter {
        private static final String LOG_TAG = UpdateAdapter.class.getSimpleName();

        public UpdateAdapter(Activity context, ArrayList<Update> schedule) {
            super(context, 0, schedule);

        }

        ArrayList<Update> schedule = InputUpdateActivity.schedule;

        @Override
        @NonNull
        public View getView(int position, final View convertView, @NonNull ViewGroup parent) {

            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.updatelist, parent, false);

            }


            final Update word = (Update) getItem(position);
            final TextView nameTextView = (TextView) listItemView.findViewById(R.id.upname);
            if (word != null) {
                nameTextView.setText(word.getUpname());
            }

            final TextView PhoneTextView = (TextView) listItemView.findViewById(R.id.digit);
            if (word != null) {

                PhoneTextView.setText(word.getphone());
            }

            final TextView EntryDaeTextView = (TextView) listItemView.findViewById(R.id.entrydate);
            if (word != null) {
                EntryDaeTextView.setText(word.getbrin());
            }

            final TextView ColdateTextView = (TextView) listItemView.findViewById(R.id.coldate);
            if (word != null) {
                ColdateTextView.setText(word.getretur());
            }


            return listItemView;


        }


    }

