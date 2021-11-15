/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_semestral;
import java.util.*;
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
    private Funcionarios[] funcionarios; //listas
    private ArrayList<Paciente> pacientes; //lista
    private ListaPisos listaPisos;

    public Hospital(String nombreHospital, String direccionHospital, int idHospital, int cantidadPisos, int cantidadSalas, int cantidadCamas) {
        this.nombreHospital = nombreHospital;
        this.direccionHospital = direccionHospital;
        this.idHospital = idHospital;
        this.cantidadPisos = cantidadPisos;
        this.cantidadSalas = cantidadSalas;
        this.cantidadCamas = cantidadCamas;
        listaPisos = new ListaPisos(cantidadPisos,cantidadSalas,cantidadCamas);
    }

   
    
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

    @Override
    public String toString() {
        return "Hospital{" + "nombreHospital=" + nombreHospital + ", direccionHospital=" + direccionHospital + ", idHospital=" + idHospital + '}';
    }


    /*
        ESTO ES SOLO DE PRUEBA
        YA QUE EN EL INTENTO DE ASIGNAR VALORES
        COLAPSABA
        Y TUVIMOS QUE PREGUNTAR
        1 POR 1
        QUE ES LO QUE PODIA PASAR
        TRATANDO DE VER NIVEL POR NIVEL
     */
    
   
    
    
}
