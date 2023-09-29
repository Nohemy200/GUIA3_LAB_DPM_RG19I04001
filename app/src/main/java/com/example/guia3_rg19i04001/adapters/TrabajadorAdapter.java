package com.example.guia3_rg19i04001.adapters;

import static com.example.guia3_rg19i04001.MainActivity.lstTrabajadores;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guia3_rg19i04001.R;
import com.example.guia3_rg19i04001.modelo.Trabajador;
import com.example.guia3_rg19i04001.viewHolders.ViewHolderTrabajador;


import java.util.ArrayList;

public class TrabajadorAdapter extends RecyclerView.Adapter<ViewHolderTrabajador>{
    private ArrayList<Trabajador> datos;

    public TrabajadorAdapter(ArrayList<Trabajador> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public ViewHolderTrabajador onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trabajadores, parent, false);
        return new ViewHolderTrabajador(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTrabajador holder, int position) {
        holder.getCodigoTrabajador().setText(datos.get(position).getCodigoPersona());
        holder.getNombreTrabajador().setText(datos.get(position).getNombrePersona());
        holder.getApellidoTrabajador().setText(datos.get(position).getApellidoPersona());
        if(datos.get(position).getTipoTrabajador() == 1){
            holder.getTipoTrabajador().setText("TH");
        }else{
            holder.getTipoTrabajador().setText("TC");
        }
        holder.getSalarioTrabajador().setText(String.valueOf(datos.get(position).getTotalPagar()));

    }

    @Override
    public int getItemCount() {
        return lstTrabajadores.size();
    }

}
