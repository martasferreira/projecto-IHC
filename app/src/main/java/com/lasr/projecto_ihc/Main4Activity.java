package com.lasr.projecto_ihc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.lasr.projecto_ihc.ui.login.LoginActivity;

import java.time.Month;
import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton btnlogout = (FloatingActionButton) findViewById(R.id.floatingActionButton4);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Main4Activity.this, MainActivity.class);
                startActivity(it);
            }
        });

        Spinner DoctorSpinner =  (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Main4Activity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        DoctorSpinner.setAdapter(myAdapter);

        Spinner DaysSpinner =  (Spinner) findViewById(R.id.spinner3);

        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(Main4Activity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.days));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        DaysSpinner.setAdapter(myAdapter1);


        Spinner MonthsSpinner =  (Spinner) findViewById(R.id.spinner4);

        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(Main4Activity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.months));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        MonthsSpinner.setAdapter(myAdapter2);


        Spinner YearsSpinner =  (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdapter3 = new ArrayAdapter<String>(Main4Activity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.years));
        myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        YearsSpinner.setAdapter(myAdapter3);


        Button button8 =(Button) findViewById(R.id.button8);

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Main4Activity.this, Main10Activity.class);
                startActivity(it);
            }
        });
    }

   }


