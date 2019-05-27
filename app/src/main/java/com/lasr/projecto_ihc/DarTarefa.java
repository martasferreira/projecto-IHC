package com.lasr.projecto_ihc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.lasr.projecto_ihc.ui.login.LoginActivity;

public class DarTarefa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dar_tarefa);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton btnprevious = (FloatingActionButton) findViewById(R.id.floatingActionButton13);

        btnprevious.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(DarTarefa.this, VistaConsulta.class);
                startActivity(it);
            }
        });

        FloatingActionButton btnlogout = (FloatingActionButton) findViewById(R.id.floatingActionButton17);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(DarTarefa.this, LoginActivity.class);
                startActivity(it);

                Context context = getApplicationContext();
                CharSequence text = "Logout successful!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });


        Button btn = (Button) findViewById(R.id.button12);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(DarTarefa.this, VistaConsulta.class);
                startActivity(it);
            }
        });


        Spinner dropdown =  (Spinner) findViewById(R.id.spinner7);

        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(DarTarefa.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.items));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(myAdapter1);



    }

}
