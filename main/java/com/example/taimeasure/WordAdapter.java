package com.example.taimeasure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    public WordAdapter(Activity context, ArrayList<Declare> measurement) {
        super(context,0, measurement);

    }

    ArrayList<Declare> measurement = TakeMeasurementActivity.measurement;
    @Override
    @NonNull
    public View getView(int position, final View convertView, @NonNull ViewGroup parent) {


        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.measurelist, parent, false);

        }


        final Declare word = (Declare) getItem(position);
        final TextView nameTextView = (TextView) listItemView.findViewById(R.id.namev);
        if (word != null) {
            nameTextView.setText(word.getName1());
        }

        final TextView backTextView = (TextView) listItemView.findViewById(R.id.backv);
        if (word != null) {

            backTextView.setText(word.getBack1());
        }

        final TextView sleeveTextView = (TextView) listItemView.findViewById(R.id.sleevev);
        if (word != null) {
            sleeveTextView.setText(word.getSleeve1());
        }

        final TextView roundsleeveTextView = (TextView) listItemView.findViewById(R.id.roundsleevev);
        if (word != null) {
            roundsleeveTextView.setText(word.getRoundsleeve1());
        }

        final TextView waistTextView = (TextView) listItemView.findViewById(R.id.waistv);
        if (word != null) {
            waistTextView.setText(word.getWaist1());
        }

        final TextView chestTextView = (TextView) listItemView.findViewById(R.id.chestv);
        if (word != null) {
            chestTextView.setText(word.getChest1());
        }

        final TextView slimwaistTextView = (TextView) listItemView.findViewById(R.id.slimwaistv);
        if (word != null) {
            slimwaistTextView.setText(word.getSlimwaist1());
        }

        final TextView toplengthTextView = (TextView) listItemView.findViewById(R.id.toplengthv);
        if (word != null) {
            toplengthTextView.setText(word.getToplength1());
        }

        final TextView tightTextView = (TextView) listItemView.findViewById(R.id.tightv);
        if (word != null) {
            tightTextView.setText(word.getTight1());
        }

        final TextView trouserlengthTextView = (TextView) listItemView.findViewById(R.id.trouserlengthv);
        if (word != null) {
            trouserlengthTextView.setText(word.getTrouserlength1());
        }

        final TextView ankleTextView = (TextView) listItemView.findViewById(R.id.anklev);
        if (word != null) {
            ankleTextView.setText(word.getAnkle1());
        }





        final TextView back = (TextView) listItemView.findViewById(R.id.backl);

        final TextView sleeve = (TextView) listItemView.findViewById(R.id.sleevel);

        final TextView roundsleeve = (TextView) listItemView.findViewById(R.id.roundsleevel);

        final TextView chest = (TextView) listItemView.findViewById(R.id.chestl);

        final TextView waist = (TextView) listItemView.findViewById(R.id.waistl);

        final TextView slimwaist = (TextView) listItemView.findViewById(R.id.slimwaistl);

        final TextView top = (TextView) listItemView.findViewById(R.id.toplengthl);

        final TextView tight = (TextView) listItemView.findViewById(R.id.tightl);

        final TextView ankle = (TextView) listItemView.findViewById(R.id.anklel);

        final TextView trouser = (TextView) listItemView.findViewById(R.id.trouserlengthl);



        return listItemView;




    }
}
