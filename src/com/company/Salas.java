package com.company;

public class Salas extends ListaSalas {

    private int numeroSala;
    private int cantCamas;

    public Salas(int numeroSala, int cantCamas) {
        this.numeroSala = numeroSala;
        this.cantCamas = cantCamas;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }
}
