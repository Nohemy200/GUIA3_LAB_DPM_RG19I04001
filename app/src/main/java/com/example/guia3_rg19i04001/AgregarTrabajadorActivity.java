package com.example.guia3_rg19i04001;

import static com.example.guia3_rg19i04001.MainActivity.lstTrabajadores;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.guia3_rg19i04001.modelo.TrabajadorHora;
import com.example.guia3_rg19i04001.modelo.TrabajadorTiempoCompleto;

public class AgregarTrabajadorActivity extends AppCompatActivity {
    Button btnAgregar;
    EditText edtSalario, edtCodigo, edtNombre, edtApellido, edtEdad, edtValor, edtHora;
    //TextView tvSalario, tvCodigo, tvNombre, tvApellido, tvEdad, tvValor, tvHora;
    private Bundle bundle;
    private int idEleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_trabajador);

        btnAgregar = findViewById(R.id.btnAgregar);

        edtSalario = findViewById(R.id.edtSalario);
        edtCodigo = findViewById(R.id.edtCodigo);
        edtNombre = findViewById(R.id.edtNombre);
        edtApellido = findViewById(R.id.edtApellido);
        edtEdad = findViewById(R.id.edtEdad);
        edtValor = findViewById(R.id.edtValor);
        edtHora = findViewById(R.id.edtHora);

        //tvSalario = findViewById(R.id.tvSalario);
        //tvValor = findViewById(R.id.tvValor);
        //tvHora= findViewById(R.id.tvHora);

        bundle = getIntent().getExtras();
        idEleccion = bundle.getInt("tipoEleccion");

        if(idEleccion == 1){
            // Es Trabajador hora
            //tvSalario.setVisibility(View.GONE);
            edtSalario.setVisibility(View.GONE);

        }else{
            // Es tiempo completo
            //tvValor.setVisibility(View.GONE);
            edtValor.setVisibility(View.GONE);
            //tvHora.setVisibility(View.GONE);
            edtHora.setVisibility(View.GONE);

        }

        btnAgregar.setOnClickListener(view -> {
            if(idEleccion == 1){
                // Es Trabajador hora
                AgregarTrabajadorHora();

            }else{
                // Es tiempo completo
                AgregarTrabajadorTiempoCompleto();

            }

            // Una vez insertado el registro, se puede mostrar una alerta y sacar de la pila a la actvidad
            new AlertDialog.Builder(this).setMessage("Insertado con éxito")
                .setPositiveButton("Ok", (dialog, which) -> finish()).show();

        });

    }

    private void AgregarTrabajadorTiempoCompleto() {
        if(edtCodigo.getText().toString().equals("")){
            Toast.makeText(this, "Debe ingresar el codigo", Toast.LENGTH_SHORT).show();
            return;
        }
        if(edtNombre.getText().toString().equals("")){
            Toast.makeText(this, "Debe ingresar el nombre", Toast.LENGTH_SHORT).show();
            return;
        }
        if(edtApellido.getText().toString().equals("")){
            Toast.makeText(this, "Debe ingresar el apellido", Toast.LENGTH_SHORT).show();
            return;
        }
        if(edtEdad.getText().toString().equals("")){
            Toast.makeText(this, "Debe ingresar la edad", Toast.LENGTH_SHORT).show();
            return;
        }
        if(edtSalario.getText().toString().equals("")){
            Toast.makeText(this, "Debe ingresar el salario", Toast.LENGTH_SHORT).show();
            return;
        }

        lstTrabajadores.add(
                new TrabajadorTiempoCompleto(
                        edtCodigo.getText().toString(), edtNombre.getText().toString(),
                        edtApellido.getText().toString(), Float.valueOf(edtSalario.getText().toString()))
        );
    }

    private void AgregarTrabajadorHora() {
        if(edtCodigo.getText().toString().equals("")){
            Toast.makeText(this, "Debe ingresar el codigo", Toast.LENGTH_SHORT).show();
            return;
        }
        if(edtNombre.getText().toString().equals("")){
            Toast.makeText(this, "Debe ingresar el nombre", Toast.LENGTH_SHORT).show();
            return;
        }
        if(edtApellido.getText().toString().equals("")){
            Toast.makeText(this, "Debe ingresar el apellido", Toast.LENGTH_SHORT).show();
            return;
        }
        if(edtEdad.getText().toString().equals("")){
            Toast.makeText(this, "Debe ingresar la edad", Toast.LENGTH_SHORT).show();
            return;
        }
        if(edtValor.getText().toString().equals("")){
            Toast.makeText(this, "Debe ingresar el valor de la hora", Toast.LENGTH_SHORT).show();
            return;
        }
        if(edtHora.getText().toString().equals("")){
            Toast.makeText(this, "Debe ingresar las horas trabajadas", Toast.LENGTH_SHORT).show();
            return;
        }

        lstTrabajadores.add(
                new TrabajadorHora(
                        edtCodigo.getText().toString(), edtNombre.getText().toString(),
                        edtApellido.getText().toString(), Integer.parseInt(edtHora.getText().toString()),
                        Float.valueOf(edtValor.getText().toString()))
        );
    }
}
