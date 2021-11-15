package com.company;

public class Pisos extends ListaPisos {



    private int numeroPiso;
    private int cantidadSalas;

    public Pisos(int numeroPiso, int cantidadSalas) {
        this.numeroPiso = numeroPiso;
        this.cantidadSalas = cantidadSalas;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public int getCantidadSalas() {
        return cantidadSalas;
    }

    public void setCantidadSalas(int cantidadSalas) {
        this.cantidadSalas = cantidadSalas;
    }
}
