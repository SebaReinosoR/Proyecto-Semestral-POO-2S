/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.*;

/**
 *
 * @author cagaj
 */
public class Hospital {

    private String nombreHospital;
    private String direccionHospital;
    private int idHospital;
    private int cantidadPisos;
    private int cantidadSalas;
    private int cantidadCamas;
    private Funcionario[] funcionarios; //listas
    private ListaPacientes listaPaciente; //lista
    private ListaPisos listaPisos;

    public Hospital(String nombreHospital, String direccionHospital, int idHospital, int cantidadPisos, int cantidadSalas, int cantidadCamas) {
        this.nombreHospital = nombreHospital;
        this.direccionHospital = direccionHospital;
        this.idHospital = idHospital;
        this.cantidadPisos = cantidadPisos;
        this.cantidadSalas = cantidadSalas;
        this.cantidadCamas = cantidadCamas;
        listaPisos = new ListaPisos();
        listaPaciente = new ListaPacientes();
        funcionarios = new Funcionario[20];
        listaPisos.llenarPisos(cantidadPisos, cantidadSalas, cantidadCamas);

        //rellenofuncionarios  HAY QUE VER COMO USAR ESTO O SACARLO SOLO ES EL TXT
    }

    //get - set
    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public String getDireccionHospital() {
        return direccionHospital;
    }

    public void setDireccionHospital(String direccionHospital) {
        this.direccionHospital = direccionHospital;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    /*
        Llamado de funciones para el piso
     */
    public int entregarSizePiso() {
        return listaPisos.sizePisos();
    }

    public void mostrarPiso(int posPiso) {
        listaPisos.mostrarPisos(posPiso);
    }

    public void mostrarPiso() {
        listaPisos.mostrarPisos();
    }

    public void addPiso() throws IOException {
        listaPisos.agregarPiso();
    }

    public void corregirPiso() throws IOException {
        listaPisos.modificarPiso();
    }

    public void removePiso() throws IOException {
        listaPisos.eliminarPiso();
    }

    public int sizePiso() {
        return listaPisos.sizePisos();
    }

    /*
        llamado de funciones de las salas
     */
    public int entregarSizeSala(int posPiso) {
        return listaPisos.sizeSalas(posPiso);
    }

    public void mostrarSala(int posPiso, int posSala) {
        listaPisos.mostrarSala(posPiso, posSala);
    }

    public void mostrarSala(int posPiso) {
        listaPisos.exponerSalas(posPiso);
    }

    public void addSala(int posPiso) throws IOException {
        listaPisos.agregarSala(posPiso);
    }

    public void corregirSala(int posPiso, int posSala) throws IOException {
        listaPisos.modificarSala(posPiso, posSala);
    }

    public void removeSala(int posPiso) throws IOException {
        listaPisos.eliminarSala(posPiso);
    }

    public int sizeSala(int posPiso) {
        return listaPisos.sizeSalas(posPiso);
    }

    /*
        llamado de funciones para las camas 
     */
    public int sizeCama(int posPiso, int posSala) {
        return listaPisos.sizeCama(posPiso, posSala);
    }

    public void setDisponibilidad(boolean disponible, int posCama, int posSala, int posPiso) {
        listaPisos.setDisponibilidad(disponible, posCama, posSala, posPiso);

    }

    public boolean isDisponible(int posCama, int posSala, int posPiso) {
        return listaPisos.isDisponible(posCama, posSala, posPiso);
    }

    public void mostrarCamas(int posPiso, int posSalas) {

        listaPisos.mostrarCamas(posPiso, posSalas);

    }

    public void addCama(int posPiso, int posSala, int cantCamas) {
        listaPisos.agregarCamas(posPiso, posSala, cantCamas);
    }

    public void corregirCama(int posPiso, int posSala) throws IOException {
        listaPisos.modificarCama(posPiso, posSala);
    }

    public void removeCama(int posPiso, int posSala) throws IOException {
        Paciente pacienteSinCama = listaPisos.eliminarCama(posPiso, posSala);
        encontrarCamaDesocupada(pacienteSinCama);
    }

    public void encontrarCamaDesocupada(Paciente pacienteSinCama) throws IOException {
        boolean agregado = false;
        int posAgregado = 0;

        for (int i = 1; i < listaPisos.sizePisos(); i++) {
            for (int j = 0; j < listaPisos.sizeSalas(i); j++) {
                agregado = listaPisos.agregarPaciente(pacienteSinCama, j, i);
                if (agregado) {
                    posAgregado = j;
                    break;
                }
            }
        }

        if (agregado) {
            System.out.println("Paciente agregado en la cama " + posAgregado);
            System.out.println("----------------------");
        } else {
            System.out.println("Todas las salas estan llenas");
            listaPaciente.agregarPaciente();
            System.out.println("----------------------");
        }
    }

    /*
        Llamado listaPaciente con camas
     */
    public void mostrarPacientesConCamasSala(int posPiso, int posSala) {
        listaPisos.mostrarPacientesConCamas(posPiso, posSala);
    }

    public void mostrarPacientesConCamasSala() {
        listaPisos.mostrarTodosPacientesCamas();
    }

    public void removePacienteConCama(int posPiso, int posSala) throws IOException {
        listaPisos.eliminarPaciente(posPiso, posSala);
    }

    public String rutPaciente(int posPaciente, int posSala, int posPiso) {
        return listaPisos.rutPaciente(posPaciente, posSala, posPiso);
    }

    public void mostrarGafete(int posPaciente, int posSala, int posPiso) {
        listaPisos.mostrarGafete(posPaciente, posSala, posPiso);
    }

    public Paciente retornoPaciente(int posPaciente, int posSala, int posPiso) {
        return listaPisos.pacienteSolicitado(posPiso, posSala, posSala);
    }

    public String diagnosticoPaciente(int posPaciente, int posSala, int posPiso) {
        return listaPisos.diagnosticoPaciente(posPiso, posSala, posPaciente);
    }

    /*
        llamado de funciones para los listaPaciente
     */
    public void mostrarListaPacientes() {
        listaPaciente.mostrarElemento();
    }

    public void agregarPaciente() throws IOException {
        listaPaciente.agregarPaciente();
    }

    public void modificarPaciente() throws IOException {
        listaPaciente.mostrarElemento();
    }

    public void eliminarPaciente() throws IOException {
        listaPaciente.eliminarElemento();
    }

    public int sizePacientes() {
        return listaPaciente.sizeListaPacientes();
    }

    public String diagnosticoPaciente(int posPac) {
        return listaPaciente.diagnosticoPaciente(posPac);
    }

    public Paciente retornoPaciente(int posPac) {
        return listaPaciente.getPaciente(posPac);
    }

    public void mostrarGafete(int pos) {
        listaPaciente.mostrarGafete(pos);
    }

    /*
        Llamado de funciones para los funcionarios
     */
    
    public void agregarFuncionario() throws IOException {
        String nombre, apellido, rut, especialidad;
        int edad;
        Funcionario nuevoFuncionario;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                System.out.println("Ingrese su nombre:");
                nombre = lector.readLine();
                System.out.println("Ingrese su apellido");
                apellido = lector.readLine();
                System.out.println("Ingrese su rut:");
                rut = lector.readLine();
                System.out.println("Ingrese su edad:");
                edad = Integer.parseInt(lector.readLine());
                System.out.println("Ingrese el dia:");
                especialidad = lector.readLine();
                nuevoFuncionario = new Funcionario(especialidad, nombre, apellido, rut, edad);
                funcionarios[i] = nuevoFuncionario;
                System.out.println("Funcionario agregado con exito");
            }
        }

    }

    public void mostrarFuncionario() {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios != null) {
                funcionarios[i].gafete();
            }
        }
    }

    public void eliminarFuncionario(String rutFuncionario) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios != null && funcionarios[i].getRut().equals(rutFuncionario)) {
                funcionarios[i] = null;
            }

        }
    }

    public void modificarFuncionario() throws IOException {

        int posFuncionario = 0, indicacion = 0;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = false;
        String rutFuncionario;

        System.out.println("Ingrese el rut del paciente");
        rutFuncionario = lector.readLine();

        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i].equals(rutFuncionario)) {
                posFuncionario = i;
                flag = true;
            }
        }

        if (flag) {
            do {
                System.out.println("Que desea modificar:\n"
                        + "1.- Nombre\n"
                        + "2.- Apellido\n"
                        + "3.- Edad\n"
                        + "4.- Especialidad\n"
                        + "0.- Salir\n");
                indicacion = Integer.parseInt(lector.readLine());

                switch (indicacion) {
                    case 1:
                        System.out.println("Ingrese el nombre:");
                        funcionarios[posFuncionario].setNombres(lector.readLine());
                        break;
                    case 2:
                        System.out.println("Ingrese el apellido:");
                        funcionarios[posFuncionario].setApellidos(lector.readLine());
                        break;
                    case 3:
                        System.out.println("Ingrese la edad:");
                        funcionarios[posFuncionario].setEdad(Integer.parseInt(lector.readLine()));
                        break;
                    case 4:
                        System.out.println("Ingrese la especialidad:");
                        funcionarios[posFuncionario].setEspecialidad(lector.readLine());
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                }
            } while (indicacion != 0);
        } else {
            System.out.println("No hay paciente con ese rut");
        }

    }

}
