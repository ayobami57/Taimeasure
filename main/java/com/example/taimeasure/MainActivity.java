package com.example.taimeasure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText username;
    EditText password;
    int couter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // declaring and finding the EditText in the activity.xml
        username = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.pass);
        // declaring and setting OnClickListener on the submit button
        final Button submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Intent menuIntent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(menuIntent);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Invalid username or password", Toast.LENGTH_SHORT).show();

                    couter--;
                    if (couter == 0) {
                        submit.setEnabled(false);
                    }
                }

            }
        });
    }


}