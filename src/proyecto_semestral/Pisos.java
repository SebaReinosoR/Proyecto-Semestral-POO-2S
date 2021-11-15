/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_semestral;

/**
 *
 * @author cagaj
 */
public class Pisos {
    
    
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
