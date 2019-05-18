package com.lasr.projecto_ihc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

import java.util.ArrayList;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        String[] countries = getResources().getStringArray(R.array.utentes);

        AutoCompleteTextView editText = findViewById(R.id.actv1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, countries);
        editText.setAdapter(adapter);


        ListView lista = (ListView) findViewById(R.id.tarefas);

        ArrayList<String> tarefas = preencherDados();


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tarefas);
        lista.setAdapter(arrayAdapter);



    }


    private ArrayList<String> preencherDados() {

        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Tarefa 1");
        dados.add("Tarefa 2");
        dados.add("Tarefa 3");
        dados.add("Tarefa 4");
        dados.add("Tarefa 5");
        dados.add("Tarefa 6");


        return dados;
    }

}
