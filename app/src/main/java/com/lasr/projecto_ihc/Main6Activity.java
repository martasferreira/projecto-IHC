package com.lasr.projecto_ihc;

import android.content.Context;
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
import android.widget.Toast;

import com.lasr.projecto_ihc.ui.login.LoginActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton btnlogout = (FloatingActionButton) findViewById(R.id.floatingActionButton6);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Main6Activity.this, LoginActivity.class);
                startActivity(it);

                Context context = getApplicationContext();
                CharSequence text = "Logout successful!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        FloatingActionButton back = (FloatingActionButton) findViewById(R.id.floatingActionButton7);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Main6Activity.this, Main5Activity.class);
                startActivity(it);
            }
        });

        ListView lista = (ListView) findViewById(R.id.pacientes);

        ArrayList<String> pacientes = preencherDados();


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pacientes);
        lista.setAdapter(arrayAdapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Intent intent = new Intent(Main6Activity.this, VistaConsulta.class);
                startActivity(intent);

            }
        });


        }

    private ArrayList<String> preencherDados() {

        ArrayList<String> dados = new ArrayList<String>();
        dados.add(" 9h: Maria Moreira");
        dados.add("10h: Joaquim Pereira");
        dados.add("11h: Joana Albuquerque");
        dados.add("12h: Amelia Fonseca");
        dados.add("13h: Marina Moniz");
        dados.add("14h: Camila Marques");
        dados.add("15h: Carolina Santos");
        dados.add("16h: Carlos Soares");
        dados.add("17h: João Mendes");
        dados.add("18h: André Catarino");
        dados.add("19h: Rui Melo");
        return dados;
    }
}


