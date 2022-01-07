package com.example.taimeasure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Calendar;

public class InputUpdateActivity extends AppCompatActivity {

    public static final ArrayList<Update> schedule = new ArrayList<Update>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_update);

        final EditText name = (EditText) findViewById(R.id.editname);
        final String names = name.getText().toString();

        Button save2 = (Button)findViewById(R.id.save2);
        save2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText roundsleeve = (EditText) findViewById(R.id.editname);
                String roundsleeves = roundsleeve.getText().toString();
                EditText back = (EditText) findViewById(R.id.editno);
                String backs = back.getText().toString();
                EditText sleeve = (EditText) findViewById(R.id.editentry);
                String sleeves = sleeve.getText().toString();
                EditText name = (EditText) findViewById(R.id.editcol);
                String names = name.getText().toString();



                schedule.add(new Update(roundsleeves, backs, sleeves, names));
            }
        });

        Button reminder = (Button)findViewById(R.id.remind);
        reminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                Intent intent = new Intent(Intent.ACTION_EDIT);
                intent.setType("vnd.android.cursor.item/event");
                intent.putExtra("beginTime", cal.getTimeInMillis());
                intent.putExtra("allDay", false);
                intent.putExtra("rrule", "FREQ=DAILY");
                intent.putExtra("endTime", cal.getTimeInMillis()+60*60*1000);
                intent.putExtra("title", name.getText().toString()+"'s Cloth Schedule");
                startActivity(intent);
            }
        });
    }

}