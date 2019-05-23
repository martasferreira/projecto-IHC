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
import android.widget.ListView;

import com.lasr.projecto_ihc.ui.login.LoginActivity;

import java.util.ArrayList;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton btnlogout = (FloatingActionButton) findViewById(R.id.floatingActionButton10);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Main7Activity.this, VistaConsulta.class);
                startActivity(it);
            }
        });

        ListView lista = (ListView) findViewById(R.id.historico);

        ArrayList<String> historico = preencherDados();


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, historico);
        lista.setAdapter(arrayAdapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(Main7Activity.this, ShowActivity.class);
                startActivity(intent);
            }
        });

    }


    private ArrayList<String> preencherDados() {

        ArrayList<String> dados = new ArrayList<String>();
        dados.add("02-04-2015: Dr. Joaquim");
        dados.add("03-07-2015: Dr. Alberto");
        dados.add("15-12-2015: Dr. Moreira");
        dados.add("01-02-2017: Dr. Jorge");
        dados.add("02-06-2018: Dr. Mário");
        dados.add("13-04-2019: Dr. Rui");


        return dados;
    }

}
