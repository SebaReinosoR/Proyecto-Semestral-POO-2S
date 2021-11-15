package com.company;

public class Funcionarios extends Persona{

    private String especialidad;

    public Funcionarios(String nombres, String apellidos, String rut, short edad, String especialidad) {
        super(nombres, apellidos, rut, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
