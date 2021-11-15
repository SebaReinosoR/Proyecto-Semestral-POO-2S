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
public class ListaPisos {
    
    private HashMap<Integer,Pisos> pisos;
    private int tamanioPisos;
    private ListaSalas salas;

    public ListaPisos(int tamanioPisos,int tamanioSalas,int tamanioCamas){
        this.tamanioPisos = tamanioPisos;
        salas = new ListaSalas(tamanioSalas,tamanioCamas);
    }
    
    public void mostrarPisos(){
        for (Integer i : pisos.keySet()) {
            System.out.println("Esta en el piso " + i);
        }
    }

    public void agregarPiso() throws IOException{

        int numeroPiso,cantidadSalas;
        Pisos nuevoPiso;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); 
        
        System.out.println("Ingrese el numero del piso:");
        numeroPiso = Integer.parseInt(lector.readLine());
        
        System.out.println("Ingrese la cantidad de salas:");
        cantidadSalas = Integer.parseInt(lector.toString());
        
        nuevoPiso = new Pisos(numeroPiso,cantidadSalas);
        
        if (!pisos.containsValue(nuevoPiso)) {
            pisos.put(numeroPiso, nuevoPiso);
            System.out.println("pisos agregado con exito");
        }else{
            System.out.println("El piso ya se encuentra");
        }
 
    }
    
    public void buscarPiso() throws IOException{
        
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        int keyPisoBuscar = 0;
        
        System.out.println("Ingrese el numero del piso a buscar:");
        keyPisoBuscar = Integer.parseInt(lector.readLine());
        
        if (pisos.containsKey(keyPisoBuscar)) {
            System.out.println("el piso "+keyPisoBuscar+" SI se encuentra");
        }else{
            System.out.println("el piso "+keyPisoBuscar+" NO se encuentra");
        }
                
    }
    
    public void modificarPiso() throws IOException{
        
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        int keyPisoModificar = 0;
        
        System.out.println("Ingrese el numero del piso a Modificar:");
        keyPisoModificar = Integer.parseInt(lector.readLine());
        String decision = null;
        if (pisos.containsKey(keyPisoModificar)) {
            
            System.out.println("Desea modificar la cantidad de salas: (si/no)");
            decision = lector.readLine();
            
            if(decision.equals("si")){
                int salas = 0;
                System.out.println("Ingrese el nuevo numero de salas:");
                salas = Integer.parseInt(lector.readLine());
                pisos.get(keyPisoModificar).setCantidadSalas(salas);
                System.out.println("Cambio exitoso.");
            }else{
                if (decision.equals("no")) {
                    System.out.println("Terminando accion");
                }
            }
  
        }else{
            System.out.println("El piso solicitado no existe");
        }
        
        
    }
    
    public void eliminarPiso(){
        
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        int keyPisoEliminar = 0;
        
        if (pisos.containsKey(keyPisoEliminar)) {
            System.out.println("El piso "+keyPisoEliminar+" sera eliminado");
            pisos.remove(keyPisoEliminar);
        }else{
            System.out.println("El piso solicitado no se encuentra/no existe");
        }
        
    }
    
}
