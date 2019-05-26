package com.lasr.projecto_ihc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.lasr.projecto_ihc.ui.login.LoginActivity;

public class Main11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton btn = (FloatingActionButton) findViewById(R.id.floatingActionButton14);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Main11Activity.this, Main8Activity.class);
                startActivity(it);
            }
        });

        FloatingActionButton btnlogout = (FloatingActionButton) findViewById(R.id.floatingActionButton17);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Main11Activity.this, LoginActivity.class);
                startActivity(it);
            }
        });

    }

}
