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
public class Menu {

    private Hospital hospital;
    private int posPiso, posSala;

    public Menu() {
        hospital = new Hospital("Hospital General Humberto Suazo", "Av. Charles Aranguiz 263", 98136, 5, 15, 10);
        posPiso = 1;
        posSala = 1;
    }

    /*
        Creacion de menu
     */
    public void panel() throws IOException {

        int entrada = 0;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("--------------------------------");
            System.out.println("Por favor ingrese una seccion:");
            System.out.println("1.- Pisos\n"
                    + "2.- Salas\n"
                    + "3.- Camas\n"
                    + "4.- Pacientes\n"
                    + "5.- Funcionarios\n"
                    + "0.- Salir\n");

            entrada = Integer.parseInt(lector.readLine());
            switch (entrada) {
                case 1:
                    funcionamientoPisos();
                    break;
                case 2:
                    funcionamientosSalas();
                    break;
                case 3:
                    funcionamientoCamas();
                    break;
                case 4:
                    funcionamientoPacientes();
                    break;
                case 5:
                    funcionamientoFuncionario();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }

        } while (entrada != 0);

    }

    public int posicionPiso() throws IOException {

        int entrada, numeroPiso = 1;
        boolean flag = false;

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("¿Usted sabe en que piso se encuentra?\n"
                + "1.-Si\n"
                + "2.-No\n");

        entrada = Integer.parseInt(lector.readLine());

        switch (entrada) {
            case 1:
                System.out.println("Por favor ingresar en el piso que se encuentra:");
                numeroPiso = Integer.parseInt(lector.readLine());
                break;
            case 2:
                do {
                    System.out.println("Seleccione en que piso esta posicionado"); //necesito re-formular la pregunta
                    for (int i = 0; i < hospital.sizePisos(); i++) {
                        if (i < hospital.sizePisos() - 1) {
                            System.out.print((i + 1) + " - ");
                        } else {
                            if (i == hospital.sizePisos() - 1) {
                                System.out.println(i + 1);
                            }
                        }
                    }
                    if (Integer.parseInt(lector.readLine()) < hospital.sizePisos()) {
                        numeroPiso = Integer.parseInt(lector.readLine());
                        flag = true;
                    } else {
                        System.out.println("Ingrese un numero valido");
                    }
                } while (flag != true);

        }

        return numeroPiso;
    }

    public int posicionSala() throws IOException {
        int entrada, numeroSala = 1;
        boolean flag = false;

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("¿Usted sabe en que sala se encuentra?\n"
                + "1.-Si\n"
                + "2.-No\n");

        entrada = Integer.parseInt(lector.readLine());

        switch (entrada) {
            case 1:
                System.out.println("Por favor ingresar en la sala que se encuentra:");
                numeroSala = Integer.parseInt(lector.readLine());
                break;
            case 2:
                do {
                    System.out.println("Seleccione en que sala esta posicionado"); //necesito re-formular la pregunta
                    for (int i = 0; i < hospital.tamanioSala(posPiso); i++) {
                        System.out.print((i + 1) + " - ");
                    }
                    if (Integer.parseInt(lector.readLine()) < hospital.sizePisos()) {
                        numeroSala = Integer.parseInt(lector.readLine());
                        flag = true;
                    } else {
                        System.out.println("Ingrese un numero valido");
                    }
                } while (flag != true);
                break;
        }

        return numeroSala;
    }

    public void funcionamientoPisos() throws IOException {

        posPiso = posicionPiso();
        int entrada;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Que desea realizar:\n"
                    + "1.- Mostrar pisos\n"
                    + "2.- Mostrar todos los pisos\n"
                    + "3.- Agregar piso\n"
                    + "4.- Modificar piso\n"
                    + "5.- Eliminar piso\n"
                    + "0.- Salir\n");
            entrada = Integer.parseInt(lector.readLine());

            switch (entrada) {
                case 1:
                    hospital.mostrarPisos(posPiso);
                    break;
                case 2:
                    hospital.mostrarElemento();
                    break;
                case 3:
                    hospital.agregarElemento();
                    break;
                case 4:
                    hospital.modificarElemento();
                    break;
                case 5:
                    hospital.eliminarElemento();
                    break;
                case 0:
                    System.out.println("saliendo....");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }

        } while (entrada != 0);

    }

    public void funcionamientosSalas() throws IOException {

        int entrada;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Usted se encuentra en el piso " + posPiso + ", ¿Desea cambiar de piso?\n"
                + "1.-Si\n"
                + "2.-No\n");
        entrada = Integer.parseInt(lector.readLine());

        switch (entrada) {
            case 1:
                posPiso = posicionPiso();
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }

        do {
            System.out.println("Que desea realizar:\n"
                    + "1.- Mostrar Todas las Salas \n"
                    + "2.- Mostrar Salas por piso \n"
                    + "3.- Agregar Sala\n"
                    + "4.- Modificar Sala\n"
                    + "5.- Eliminar Sala\n"
                    + "0.- Salir\n");
            entrada = Integer.parseInt(lector.readLine());

            switch (entrada) {
                case 1:
                    hospital.mostrarSala(posPiso);
                    break;
                case 2:
                    for (int i = 0; i < hospital.sizePisos(); i++) {
                        System.out.println("Estamos en el piso " + (i + 1));
                        for (int j = 0; j < hospital.tamanioSala(posPiso); j++) {
                            hospital.mostrarSala(posPiso, j);
                        }
                    }
                    break;
                case 3:
                    hospital.agregarSala(posPiso);
                    break;
                case 4:
                    hospital.modificarSala(posPiso);
                    break;
                case 5:
                    hospital.eliminarSala(posPiso);
                    break;
                case 0:
                    System.out.println("saliendo....");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }

        } while (entrada != 0);

    }

    public void funcionamientoCamas() throws IOException {

        int entrada;
        posSala = posicionSala();
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Que desea realizar:\n"
                    + "1.- Mostrar Todas las Camas \n"
                    + "2.- Mostrar Camas por Sala \n"
                    + "3.- Mostrar Camas por Piso \n"
                    + "4.- Agregar Cama\n"
                    + "5.- Modificar Cama\n"
                    + "6.- Eliminar Cama\n"
                    + "0.- Salir\n");

            entrada = Integer.parseInt(lector.readLine());

            switch (entrada) {
                case 1:
                    hospital.mostrarCama(posPiso, posSala);
                    break;
                case 2:
                    System.out.println("La cantidad de camas por salas son en total: " + hospital.mostrarCamasSala(posPiso, posSala));
                    break;
                case 3:
                    System.out.println("La cantidad de camas por piso son en total: " + hospital.mostrarCamasPiso(posPiso));
                    break;
                case 4:
                    int cantidadCamas;
                    System.out.println("Ingrese la cantidad de camas que desea agregar:");
                    cantidadCamas = Integer.parseInt(lector.readLine());
                    hospital.agregarCama(posPiso, posSala, cantidadCamas);
                    break;
                case 5:
                    hospital.modificarCama(posPiso, posSala);
                    break;
                case 6:
                    hospital.eliminarCama(posPiso, posSala);
                    break;
                case 0:
                    System.out.println("saliendo....");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }

        } while (entrada != 0);

    }

    public void funcionamientoPacientes() throws IOException {

        int entrada;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Que desea realizar:\n"
                    + "1.- Mostrar Todos los pacientes\n"
                    + "2.- Ficha del Paciente\n"
                    + "3.- Agregar paciente\n"
                    + "4.- Modificar paciente\n"
                    + "5.- Eliminar paciente\n"
                    + "6.- Filtrar pacientes por Diagnostico"
                    + "7.- Urgencias del hospital"
                    + "0.- Salir\n");
            entrada = Integer.parseInt(lector.readLine());

            switch (entrada) {
                case 1:
                    hospital.mostrarTotalPaciente();
                    break;
                case 2:
                    pantallaGafete();
                    break;
                case 3:
                    hospital.agregarPaciente();
                    break;
                case 4:
                    hospital.modificarPaciente();
                    break;
                case 5:
                    hospital.eliminarPaciente();
                    break;
                case 6:
                    filtrarGravedad();
                    break;
                case 7:
                    urgencia();
                    break;
                case 0:
                    System.out.println("saliendo....");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }

        } while (entrada != 0);

    }

    public int pantallaGafete() throws IOException {
    
        int posCama = 0;    
        int valorPiso = 0, valorSala, valorCama;
        String rut;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese el rut del paciente = (formato 12.345.789-8)");
        rut = lector.readLine();
        
        while(valorPiso != hospital.sizePisos()){
            valorSala = 0;
            while(valorSala != hospital.tamanioSala(valorPiso)){
                valorCama = 0;
                while(valorCama != hospital.mostrarCamasSala(valorPiso, valorSala)){
                    if(rut.equals(hospital.entregarRutPaciente(posCama, posSala, posPiso))){
                        hospital.mostrarGafete(posPiso, posSala, posCama);
                    }
                   valorCama++;         
                }
                valorSala++;
            }
            valorPiso++;
        }
        
        return posCama;
    }

    public void funcionamientoFuncionario() throws IOException {

        int entrada;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Que desea realizar:\n"
                    + "1.- Mostrar Funcionarios \n"
                    + "2.- Mostrar Gafete\n"
                    + "2.- Agregar Funcionario\n"
                    + "3.- Modificar Funcionario\n"
                    + "4.- Eliminar Funcionario\n"
                    + "0.- Salir\n");
            entrada = Integer.parseInt(lector.readLine());

            switch (entrada) {
                case 1:
                    hospital.mostrarFuncionario();
                    break;
                case 2:
                    hospital.mostrarGafete();
                    break;
                case 3:
                    hospital.agregarFuncionario();
                    break;
                case 4:
                    hospital.modificarFuncionario();
                    break;
                case 5:
                    hospital.eliminarFuncionario();
                    break;

                case 0:
                    System.out.println("saliendo....");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }

        } while (entrada != 0);

    }

    public void filtrarGravedad() throws IOException {
        int filtro;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Por favor ingrese el estado de gravedad a filtrar:");
        filtro = Integer.parseInt(lector.readLine());
        filtro(filtro);

    }

    public void filtro(int gravedad) {

        int valorPiso = 0, valorSala, valorCama;
        ArrayList<Paciente> pacientesFiltro = new ArrayList<>();
        int diagnosticoPac;
        while (valorPiso != hospital.sizePisos()) {
            valorSala = 0;
            while (valorSala != hospital.tamanioSala(valorPiso)) {
                valorCama = 0;
                while (valorCama != hospital.mostrarCamasSala(valorPiso, valorSala)) {
                    diagnosticoPac = Integer.parseInt(hospital.diagnosticoPaciente(valorPiso, valorSala, valorCama));
                    if (diagnosticoPac == gravedad) {
                        pacientesFiltro.add(hospital.pacienteSolicitado(valorPiso, valorSala, valorCama));
                    }
                    valorCama++;
                }
                valorSala++;
            }
            valorPiso++;
        }

        System.out.println("Lista de las gravedades de : " + gravedad);
        System.out.println(pacientesFiltro.toString());

    }

    public void urgencia() {
        int valorPiso = 0, valorSala, valorCama, diagnostico;

        while (valorPiso != hospital.sizePisos()) {
            System.out.println("La lista del piso " + (valorPiso + 1) + " de urgencias");
            valorSala = 0;
            while (valorSala != hospital.tamanioSala(valorPiso)) {
                valorCama = 0;
                System.out.println("En la sala " + valorSala + " estan con urgencias los pacientes:");
                if (existe(5, valorPiso, valorSala)) {
                    while (valorCama != hospital.mostrarCamasSala(valorPiso, valorSala)) {
                        diagnostico = Integer.parseInt(hospital.diagnosticoPaciente(valorPiso, valorSala, valorCama));
                        if (diagnostico == 5) {
                            Paciente pacienteGuardado = hospital.pacienteSolicitado(valorPiso, valorSala, valorCama);
                            System.out.println(pacienteGuardado.toString());
                        }
                        valorCama++;
                    }
                } else {
                    if (existe(4, valorPiso, valorSala)) {
                        while (valorCama != hospital.mostrarCamasSala(valorPiso, valorSala)) {
                            diagnostico = Integer.parseInt(hospital.diagnosticoPaciente(valorPiso, valorSala, valorCama));
                            if (diagnostico == 4) {
                                Paciente pacienteGuardado = hospital.pacienteSolicitado(valorPiso, valorSala, valorCama);
                                System.out.println(pacienteGuardado.toString());
                            }
                            valorCama++;
                        }
                    }
                }

                valorSala++;
            }
            valorPiso++;
        }

    }

    public boolean existe(int gravedad, int posPiso, int posSala) {
        boolean flag = false;
        int diagnostico, posCama = 0;

        while (posCama != hospital.mostrarCamasSala(posPiso, posSala)) {
            diagnostico = Integer.parseInt(hospital.diagnosticoPaciente(posPiso, posSala, posCama));
            if (diagnostico == gravedad) {
                flag = true;
            }
            posCama++;
        }

        return flag;
    }

}
