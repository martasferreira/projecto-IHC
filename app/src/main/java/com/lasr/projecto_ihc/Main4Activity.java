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

import java.time.Month;
import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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


        ListView lista = (ListView) findViewById(R.id.disponibilidade);

        ArrayList<String> disponibilidade = preencherDados();


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, disponibilidade);
        lista.setAdapter(arrayAdapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(Main4Activity.this, VistaConsulta.class);
                startActivity(intent);
            }
        });



    }

    private ArrayList<String> preencherDados() {

        ArrayList<String> dados = new ArrayList<String>();
        dados.add(" 9h: Maria Moreira");
        dados.add("10h: Vago");
        dados.add("11h: Joana Albuquerque");
        dados.add("12h: Amelia Fonseca");
        dados.add("13h: Vago");
        dados.add("14h: Camila Marques");
        dados.add("15h: Carolina Santos");
        dados.add("16h: Vago");
        dados.add("17h: João Mendes");
        dados.add("18h: André Catarino");
        dados.add("19h: Rui Melo");
        return dados;
    }
}


