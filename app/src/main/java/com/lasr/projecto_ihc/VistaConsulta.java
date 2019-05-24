package com.lasr.projecto_ihc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.lasr.projecto_ihc.ui.login.LoginActivity;

public class VistaConsulta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_consulta);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button button11 = (Button) findViewById(R.id.button11);

        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(VistaConsulta.this, DarTarefa.class);
                startActivity(it);
            }
        });

        Button button7 = (Button) findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(VistaConsulta.this, Main7Activity.class);
                startActivity(it);
            }
        });
    }
}
