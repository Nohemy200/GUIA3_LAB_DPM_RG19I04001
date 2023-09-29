package com.example.guia3_rg19i04001.modelo;

public abstract class Trabajador extends  Persona{
    protected float sueldoMensual;
    protected float descuentoISR;
    protected float totalDescuentos;
    protected float totalPagar;

    public Trabajador() {
    }

    public Trabajador(String codigoPersona, String nombrePersona, String apellidoPersona) {
        super(codigoPersona, nombrePersona, apellidoPersona);
    }

    public float getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(float sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public float getDescuentoISR() {
        return descuentoISR;
    }

    public void setDescuentoISR(float descuentoISR) {
        this.descuentoISR = descuentoISR;
    }

    public float getTotalDescuentos() {
        return totalDescuentos;
    }

    public void setTotalDescuentos(float totalDescuentos) {
        this.totalDescuentos = totalDescuentos;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }

    public abstract int getTipoTrabajador();
}
