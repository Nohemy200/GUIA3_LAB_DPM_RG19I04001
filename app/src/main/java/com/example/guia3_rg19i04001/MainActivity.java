package com.example.guia3_rg19i04001;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guia3_rg19i04001.modelo.Trabajador;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnAgregar, btnMostrar, btnAcercaDe;
    public static ArrayList<Trabajador> lstTrabajadores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstTrabajadores = new ArrayList<Trabajador>();

        btnAgregar = findViewById(R.id.btnAgregar);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnAcercaDe = findViewById(R.id.btnAcercaDe);

        btnAgregar.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ElegirTipoTrabajadorActivity.class));
        });

        btnMostrar.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MostrarListaActivity.class));
        });

        btnAcercaDe.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, AcercaDelProgramador.class));
        });
    }
}