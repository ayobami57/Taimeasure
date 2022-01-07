package com.example.taimeasure;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class WriteMeasurementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_measurement);

        final ArrayList<Update> measurement = InputUpdateActivity.schedule;

        final UpdateAdapter adapter = new UpdateAdapter(this, measurement);
        // Find a reference to the {@link ListView} in the layout
        final ListView measurementlistView = (ListView) findViewById(R.id.list1);

        measurementlistView.setAdapter(adapter);




        measurementlistView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id){
                final int which_item = position;

                AlertDialog.Builder alertbuilder = new AlertDialog.Builder(WriteMeasurementActivity.this);
                alertbuilder.setIcon(android.R.drawable.ic_delete)
                        .setTitle("Are you sure ?")
                        .setMessage("Do you want to delete this schedule ?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which){

                                measurement.remove(which_item);
                                adapter.notifyDataSetChanged();
                            }
                        });
                alertbuilder.setNegativeButton("No", null);
                alertbuilder.show();
                return true;
            }
        });



    }
}