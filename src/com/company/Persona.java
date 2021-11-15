package com.company;

public class Persona {

    private String nombres;
    private String apellidos;
    private String rut;
    private short edad;

    public Persona(){
    }

    public Persona(String nombres, String apellidos, String rut, short edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rut = rut;
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }
}
