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
public class Salas {
    
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
