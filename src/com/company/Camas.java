package com.company;

public class Camas extends ListaCamas {

    private int numeroCama;
    private boolean disponibilidad;

    public Camas(int numeroCama) {
        this.numeroCama = numeroCama;
    }

    public int getNumeroCama() {
        return numeroCama;
    }

    public void setNumeroCama(int numeroCama) {
        this.numeroCama = numeroCama;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
