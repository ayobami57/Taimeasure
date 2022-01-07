package com.example.taimeasure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        TextView take = (TextView)findViewById(R.id.takemea);
        take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takeIntent = new Intent(MenuActivity.this,TakeMeasurementActivity.class);
                startActivity(takeIntent);
            }
        });



        TextView check = (TextView)findViewById(R.id.checkmea);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takeIntent = new Intent(MenuActivity.this,CheckMeasurementActivity.class);
                startActivity(takeIntent);
            }
        });

        TextView update = (TextView)findViewById(R.id.update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent updateIntent = new Intent(MenuActivity.this,WriteMeasurementActivity.class);
                startActivity(updateIntent);
            }
        });

        TextView updateinput = (TextView)findViewById(R.id.input);
        updateinput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent updateinputIntent = new Intent(MenuActivity.this,InputUpdateActivity.class);
                startActivity(updateinputIntent);
            }
        });


    }
}