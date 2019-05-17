package com.lasr.projecto_ihc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ListView lista = (ListView) findViewById(R.id.historico);

        ArrayList<String> historico = preencherDados();


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, historico);
        lista.setAdapter(arrayAdapter);



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
