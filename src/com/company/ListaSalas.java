package com.company;

public class ListaSalas extends ListaPisos {

    static final int cantidadCamas = 10;

    private Salas[] salas;
    private int tamanioSalas;
    private ListaCamas listaCamas = new ListaCamas(cantidadCamas);

    public ListaSalas(int tamanioSalas){
        this.tamanioSalas = tamanioSalas;
        inicializarArreglos(tamanioSalas);
    }

    private void inicializarArreglos(int cantSalas){
        salas = new Salas[cantSalas];
        for (int i = 0 ; i < cantSalas ; i++){
            salas[i] = new Salas(i,cantidadCamas);
        }
    }

    public void mostrarSalas(){
        for (int i = 0 ; i < salas.length ; i++){
            System.out.println("ESTAMOS EN LA SALA "+salas[i].getNumeroSala());
            System.out.println("LA CUAL TIENE "+salas[i].getCantCamas()+" CAMAS");
            listaCamas.MostrarCamas();
            System.out.println("------------- FIN DE LAS SALA--------------------\n");
        }

    }

}
