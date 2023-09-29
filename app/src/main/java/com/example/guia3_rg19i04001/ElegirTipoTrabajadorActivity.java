package com.example.guia3_rg19i04001;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class ElegirTipoTrabajadorActivity extends AppCompatActivity {
    RadioButton rbTHora, rbTTCompleto;
    Button btnSiguiente;
    private Bundle bundle;
    private int idEleccion = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_tipo_trabajador);

        rbTHora = findViewById(R.id.rbTHora);
        rbTTCompleto = findViewById(R.id.rbTTCompleto);
        btnSiguiente = findViewById(R.id.btnSiguiente);

        rbTHora.setOnClickListener(v -> idEleccion = 1); // En caso de que el usuario elija libro
        rbTTCompleto.setOnClickListener(v -> idEleccion = 2); // En caso de que el usuario elija revista

        btnSiguiente.setOnClickListener(v -> {
            bundle = new Bundle();
            bundle.putInt("tipoEleccion", idEleccion);
            Intent intent = new Intent(this, AgregarTrabajadorActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}
