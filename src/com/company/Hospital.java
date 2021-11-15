package com.company;

import java.util.ArrayList;

public class Hospital {

    private Funcionarios[] funcionarios;
    private ArrayList<Paciente> pacientes;
    private ListaPisos listaPisos = new ListaPisos(5);


    /*
        ESTO ES SOLO DE PRUEBA
        YA QUE EN EL INTENTO DE ASIGNAR VALORES
        COLAPSABA
        Y TUVIMOS QUE PREGUNTAR
        1 POR 1
        QUE ES LO QUE PODIA PASAR
        TRATANDO DE VER NIVEL POR NIVEL
     */
    public void mostrar(){
        listaPisos.mostrar();
    }



}
