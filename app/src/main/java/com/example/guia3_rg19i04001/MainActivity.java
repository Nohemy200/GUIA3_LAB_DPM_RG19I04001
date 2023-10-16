package com.example.guia3_rg19i04001;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guia3_rg19i04001.databinding.ActivityMainBinding;
import com.example.guia3_rg19i04001.modelo.Trabajador;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    Button btnAgregar, btnMostrar, btnAcercaDe;
    public static ArrayList<Trabajador> lstTrabajadores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        lstTrabajadores = new ArrayList<Trabajador>();

        btnAgregar = findViewById(R.id.btnAgregar);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnAcercaDe = findViewById(R.id.btnAcercaDe);

        btnAgregar.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ElegirTipoTrabajadorActivity.class));
        });

        btnMostrar.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MostrarListaActivity.class));
        });

        btnAcercaDe.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AcercaDelProgramador.class));
        });
    }
}