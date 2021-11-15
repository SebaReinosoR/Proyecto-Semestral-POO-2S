/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_semestral;

import java.io.*;
import java.util.*;

/**
 *
 * @author cagaj
 */
public class ListaSalas {
    
    static final int cantidadCamas = 10;

    private HashMap<Integer,Salas> salas;
    private int tamanioSalas;
    private ListaCamas listaCamas;

    public ListaSalas(int tamanioSalas,int tamanioCamas){
        this.tamanioSalas = tamanioSalas;
        listaCamas = new ListaCamas(tamanioCamas);
    }


    public int getTamanioSalas() {
        return tamanioSalas;
    }

    public void setTamanioSalas(int tamanioSalas) {
        this.tamanioSalas = tamanioSalas;
    }
    
    
    public void mostrarSalas(int numeroPiso){
        
        for (int i : salas.keySet()) {
            System.out.println("la sala "+ i + " del piso " +numeroPiso);
        }
        
    }
    
    public void buscarSala() throws IOException{
        
        int keySalaBuscar = 0;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); 
        
        System.out.println("Ingrese el codigo de la sala a buscar:");
        keySalaBuscar = Integer.parseInt(lector.readLine());
        
        if(salas.containsKey(keySalaBuscar)){
            System.out.println("La sala "+keySalaBuscar+" si se encuentra" );
        }else{
            System.out.println("La sala solicitada no se encuentra");
        }
        
    }
    
    public void modificarSala() throws IOException{
        
        int keySalaModificar = 0,cantidadCamas = 0;
        String decision = null;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); 
        
        System.out.println("Ingrese el codigo de la sala a modificar:");
        keySalaModificar = Integer.parseInt(lector.readLine());
        
        if(salas.containsKey(keySalaModificar)){
            System.out.println("Sala "+keySalaModificar+" con "
                    +salas.get(keySalaModificar).getCantCamas()+" camas.");
            System.out.println("¿Desea modificar el numero de camas? (si/no)");
            decision = lector.readLine();
            if(decision.equals("si")){
                System.out.println("Ingrese la nueva cantidad de camas:");
                cantidadCamas = Integer.parseInt(lector.readLine());
                salas.get(keySalaModificar).setCantCamas(cantidadCamas);
            }else{
                if(decision.equals("no")){
                    System.out.println("Devolviendo al menu");
                }
            } 
        }
        
        
        
    }
    
    public void eliminarSala() throws IOException{
        
         int keySalaEliminar = 0;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); 
        
        System.out.println("Ingrese el numero de la sala a eliminar:");
        keySalaEliminar = Integer.parseInt(lector.readLine());
        
        if (salas.containsKey(keySalaEliminar)) {
            salas.remove(keySalaEliminar);
            System.out.println("Sala borrada.");
        }else{
            System.out.println("La sala solicitada no se encuentra.");
        }
        
        
    }
    
    
}
