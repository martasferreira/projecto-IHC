package com.lasr.projecto_ihc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.lasr.projecto_ihc.ui.login.LoginActivity;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton btnlogout = (FloatingActionButton) findViewById(R.id.floatingActionButton5);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Main5Activity.this, LoginActivity.class);
                startActivity(it);

                Context context = getApplicationContext();
                CharSequence text = "Logout successful!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Spinner DaysSpinner =  (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(Main5Activity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.days));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        DaysSpinner.setAdapter(myAdapter1);


        Spinner MonthsSpinner =  (Spinner) findViewById(R.id.spinner5);

        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(Main5Activity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.months));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        MonthsSpinner.setAdapter(myAdapter2);


        Spinner YearsSpinner =  (Spinner) findViewById(R.id.spinner6);

        ArrayAdapter<String> myAdapter3 = new ArrayAdapter<String>(Main5Activity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.years));
        myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        YearsSpinner.setAdapter(myAdapter3);



        Button button4 =(Button) findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Main5Activity.this, Main6Activity.class);
                startActivity(it);
            }
        });



    }

}
