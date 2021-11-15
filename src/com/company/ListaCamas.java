package com.company;

public class ListaCamas extends Paciente {

    private Camas[] camas;
    private int cantidadCamas;
    private Paciente[] pacientesConCamas;

    public ListaCamas(int cantidadCamas){
        this.cantidadCamas = cantidadCamas;
        inicializarCamasPacientes(cantidadCamas);
    }

    private void inicializarCamasPacientes(int cantidadCamas){
        camas = new Camas[cantidadCamas];
        pacientesConCamas = new Paciente[cantidadCamas];
        for (int i = 0 ; i < cantidadCamas ; i++){
            camas[i] = new Camas(i);
            pacientesConCamas[i] = new Paciente();
        }
    }

    public void MostrarCamas(){
        for (int i = 0 ; i < camas.length ; i++){
            System.out.println("Esta es la cama n° "+camas[i].getNumeroCama());
            if(pacientesConCamas[i] == null){
                System.out.println("NO hay paciente");
            }else{
                System.out.println("si hay paciente");
            }
            System.out.println("----------------------");
        }
        System.out.println("------------FIN DE LAS CAMAS-------------\n");
    }

}
