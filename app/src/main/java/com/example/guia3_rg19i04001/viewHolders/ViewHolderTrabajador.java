package com.example.guia3_rg19i04001.viewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.guia3_rg19i04001.R;


public class ViewHolderTrabajador extends RecyclerView.ViewHolder {
    private TextView codigoTrabajador;
    private TextView nombreTrabajador;
    private TextView apellidoTrabajador;
    private TextView tipoTrabajador;
    private TextView salarioTrabajador;
    public ViewHolderTrabajador(@NonNull View itemView) {
        super(itemView);
        this.codigoTrabajador = itemView.findViewById(R.id.tvCodigo);
        this.nombreTrabajador = itemView.findViewById(R.id.tvNombre);
        this.apellidoTrabajador = itemView.findViewById(R.id.tvApellido);
        this.tipoTrabajador = itemView.findViewById(R.id.tvTipo);
        this.salarioTrabajador = itemView.findViewById(R.id.tvSalario);
    }

    public TextView getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public TextView getNombreTrabajador() {
        return nombreTrabajador;
    }

    public TextView getApellidoTrabajador() {
        return apellidoTrabajador;
    }

    public TextView getTipoTrabajador() {
        return tipoTrabajador;
    }

    public TextView getSalarioTrabajador() {
        return salarioTrabajador;
    }
}
