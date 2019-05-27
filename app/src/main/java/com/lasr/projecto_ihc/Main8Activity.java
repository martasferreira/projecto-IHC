package com.lasr.projecto_ihc;

import android.R.layout;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.ListView;

import com.lasr.projecto_ihc.ui.login.LoginActivity;

import java.util.ArrayList;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton btnlogout = (FloatingActionButton) findViewById(R.id.floatingActionButton8);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Main8Activity.this, LoginActivity.class);
                startActivity(it);
            }
        });

        ImageButton procurar  = (ImageButton) findViewById(R.id.imageButton);

        procurar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Main8Activity.this, Main11Activity.class);
                startActivity(it);
            }
        });


        String[] countries = getResources().getStringArray(R.array.utentes);

        AutoCompleteTextView editText = findViewById(R.id.actv1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, countries);
        editText.setAdapter(adapter);


        ListView lista = (ListView) findViewById(R.id.tarefas);

        ArrayList<String> tarefas = preencherDados();


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tarefas);
        lista.setAdapter(arrayAdapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Intent intent = new Intent(Main8Activity.this, Main12Activity.class);
                startActivity(intent);
                ArrayList<String> tarefas = preencherDados1();

                ListView lista = (ListView) findViewById(R.id.tarefas);
            }

            private ArrayList<String> preencherDados1() {
                ArrayList<String> dados = preencherDados();
                dados.remove(a);

                return dados;
            }
        });

    }

    public String a = "Tarefa 1";
    private ArrayList<String> preencherDados() {

        ArrayList<String> dados = new ArrayList<String>();
        dados.add(a);
        dados.add("Tarefa 2");
        dados.add("Tarefa 3");
        dados.add("Tarefa 4");
        dados.add("Tarefa 5");
        dados.add("Tarefa 6");
        dados.add("Tarefa 7");
        dados.add("Tarefa 8");
        dados.add("Tarefa 9");
        dados.add("Tarefa 10");
        dados.add("Tarefa 11");
        dados.add("Tarefa 12");
        dados.add("Tarefa 13");


        return dados;
    }

}
