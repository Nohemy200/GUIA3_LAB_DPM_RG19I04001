package com.example.guia3_rg19i04001.modelo;

public class TrabajadorHora extends Trabajador {
    private int numeroHoras;
    private float valorHora;

    public TrabajadorHora() {
    }

    public TrabajadorHora(String codigoPersona, String nombrePersona, String apellidoPersona, int numeroHoras, float valorHora) {
        super(codigoPersona, nombrePersona, apellidoPersona);
        this.numeroHoras = numeroHoras;
        this.valorHora = valorHora;
        Calcular();
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public int getTipoTrabajador() {
        return 1;
    }

    private void Calcular(){
        super.sueldoMensual = this.numeroHoras * this.valorHora;
        float ri = super.sueldoMensual;
        if(ri > 0 && ri <= 487.60){
            super.descuentoISR = 0;
        } else if(ri > 487.60 && ri <= 642.85){
            super.descuentoISR = 17.48f + (super.sueldoMensual - 487.60f) * 0.10f;
        } else if(ri > 642.85 && ri <= 915.82f){
            super.descuentoISR = 32.70f + (super.sueldoMensual - 642.85f) * 0.10f;
        } else if(ri > 915.82 && ri <= 2058.67){
            super.descuentoISR = 60.08f + (super.sueldoMensual - 915.82f) * 0.20f;
        } else{
            super.descuentoISR = 288.57f + (super.sueldoMensual - 2058.67f) * 0.30f;
        }
        super.totalDescuentos = super.descuentoISR;
        super.totalPagar = super.sueldoMensual-super.totalDescuentos;
    }

    @Override
    public String toString() {
        return super.codigoPersona + super.nombrePersona + super.apellidoPersona + " TH " + super.totalPagar;
    }
}
