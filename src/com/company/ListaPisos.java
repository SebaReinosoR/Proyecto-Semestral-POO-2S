package com.company;

public class ListaPisos {

    static final int cantidadSalas = 15;

    private Pisos[] pisos;
    private int tamanioPisos;
    private ListaSalas listaSalas = new ListaSalas(cantidadSalas);

    public ListaPisos(int tamanioPisos){
        this.tamanioPisos = tamanioPisos;
        inicializarArreglo(tamanioPisos);

    }

    public void mostrar(){
        System.out.println("Tamanio del piso es de "+pisos.length);
        for (int i = 0; i < pisos.length ; i++){
            if(pisos[i] == null){
                System.out.println("EL PISO ES NULL");
            }else{
                System.out.println("Estamos en el piso = "+pisos[i].getNumeroPiso());
                listaSalas.mostrarSalas();
            }
            System.out.println("----- FIN DEL PISO -------\n\n");
        }
    }

    private void inicializarArreglo(int tamanioPisos){
        pisos = new Pisos[tamanioPisos];
        for (int i = 0; i < tamanioPisos ; i++){
            pisos[i] = new Pisos(i,cantidadSalas);
        }
    }

}
