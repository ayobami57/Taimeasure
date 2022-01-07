package com.example.taimeasure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class TakeMeasurementActivity extends AppCompatActivity {


        public static final ArrayList<Declare> measurement = new ArrayList<Declare>();



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_take_measurement);
            View view;






            //creating onClicklistener on the save button
            Button save = (Button)findViewById(R.id.savebutton);
            save.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    EditText roundsleeve = (EditText) findViewById(R.id.roundsleeve);
                    String roundsleeves = roundsleeve.getText().toString();
                    EditText back = (EditText) findViewById(R.id.back);
                    String backs = back.getText().toString();
                    EditText sleeve = (EditText) findViewById(R.id.sleeve);
                    String sleeves = sleeve.getText().toString();
                    EditText name = (EditText) findViewById(R.id.cusname);
                    String names = name.getText().toString();
                    EditText waist = (EditText) findViewById(R.id.waist);
                    String waists = waist.getText().toString();
                    EditText chest = (EditText) findViewById(R.id.chest);
                    String chests = chest.getText().toString();
                    EditText slimwaist = (EditText) findViewById(R.id.slimwaist);
                    String slimwaists = slimwaist.getText().toString();
                    EditText toplength = (EditText) findViewById(R.id.toplength);
                    String toplengths = toplength.getText().toString();
                    EditText tight = (EditText) findViewById(R.id.tight);
                    String tights = tight.getText().toString();
                    EditText trouserlength = (EditText) findViewById(R.id.trouserlength);
                    String trouserlengths = trouserlength.getText().toString();
                    EditText ankle = (EditText) findViewById(R.id.ankle);
                    String ankles = ankle.getText().toString();





                    measurement.add(new Declare(backs, sleeves, roundsleeves, waists, chests, slimwaists,
                            toplengths, tights, trouserlengths, ankles, names));
                /*Intent intent = new Intent(TakeMeasurementActivity.this, CheckMeasurementActivity.class);
                intent.putExtra("Key", measurement);*/





                }
            });



        }
}