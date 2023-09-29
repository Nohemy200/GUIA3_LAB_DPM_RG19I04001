package com.example.guia3_rg19i04001.modelo;

public abstract class Persona {
    protected String codigoPersona;
    protected String nombrePersona;
    protected String apellidoPersona;

    public Persona() {
    }

    public Persona(String codigoPersona, String nombrePersona, String apellidoPersona) {
        this.codigoPersona = codigoPersona;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
    }

   public String getCodigoPersona(){
        return codigoPersona;
   }
    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }
}
