package com.example.guia3_rg19i04001.modelo;

public class TrabajadorTiempoCompleto extends Trabajador{
    float descuentoAFP;
    float descuentoISSS;

    public TrabajadorTiempoCompleto() {
    }

    public TrabajadorTiempoCompleto(String codigoPersona, String nombrePersona, String apellidoPersona, float sueldoMensual) {
        super(codigoPersona, nombrePersona, apellidoPersona);
        super.sueldoMensual = sueldoMensual;

        this.Calcular();
    }

    public float getDescuentoAFP() {
        return descuentoAFP;
    }

    public void setDescuentoAFP(float descuentoAFP) {
        this.descuentoAFP = descuentoAFP;
    }

    public float getDescuentoISSS() {
        return descuentoISSS;
    }

    public void setDescuentoISSS(float descuentoISSS) {
        this.descuentoISSS = descuentoISSS;
    }

    private void Calcular(){
        //ISSS
        if(super.sueldoMensual > 0 && super.sueldoMensual <= 1000){
            this.descuentoISSS = super.sueldoMensual * 0.03f;
        }else{
            this.descuentoISSS = 30;
        }

        //AFP
        if(super.sueldoMensual > 0 && super.sueldoMensual <= 7045.06){
            this.descuentoAFP = super.sueldoMensual * 0.0725f;
        } else{
            this.descuentoAFP = 510.76f;
        }

        float ri = super.sueldoMensual -(this.getDescuentoISSS() + this.getDescuentoAFP());
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

        super.totalDescuentos = (this.descuentoAFP + this.descuentoISSS + super.descuentoISR);
        super.totalPagar = super.sueldoMensual - super.totalDescuentos;
    }

    @Override
    public int getTipoTrabajador() {
        return 2;
    }

    @Override
    public String toString() {
        return super.codigoPersona + super.nombrePersona + super.apellidoPersona + " TC " + super.totalPagar;
    }
}
