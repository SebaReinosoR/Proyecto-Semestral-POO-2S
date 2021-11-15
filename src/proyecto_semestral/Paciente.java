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
public class Paciente extends Personas{
    
    
    private String diagnostico;
    private short diaIngreso;
    private short mesIngreso;
    private short añoIngreso;
    private short diaSalida;
    private short mesSalida;
    private short añoSalida;

    public Paciente(){
        super();
    }

    public Paciente(String nombres, String apellidos, String rut, short edad, String diagnostico, short diaIngreso, short mesIngreso, short añoIngreso) {
        super(nombres, apellidos, rut, edad);
        this.diagnostico = diagnostico;
        this.diaIngreso = diaIngreso;
        this.mesIngreso = mesIngreso;
        this.añoIngreso = añoIngreso;
    }
    
    public Paciente(String nombres, String apellidos, String rut, short edad, String diagnostico, short diaIngreso, short mesIngreso, short añoIngreso, short diaSalida, short mesSalida, short añoSalida) {
        super(nombres, apellidos, rut, edad);
        this.diagnostico = diagnostico;
        this.diaIngreso = diaIngreso;
        this.mesIngreso = mesIngreso;
        this.añoIngreso = añoIngreso;
        this.diaSalida = diaSalida;
        this.mesSalida = mesSalida;
        this.añoSalida = añoSalida;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public short getDiaIngreso() {
        return diaIngreso;
    }

    public void setDiaIngreso(short diaIngreso) {
        this.diaIngreso = diaIngreso;
    }

    public short getMesIngreso() {
        return mesIngreso;
    }

    public void setMesIngreso(short mesIngreso) {
        this.mesIngreso = mesIngreso;
    }

    public short getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(short añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public short getDiaSalida() {
        return diaSalida;
    }

    public void setDiaSalida(short diaSalida) {
        this.diaSalida = diaSalida;
    }

    public short getMesSalida() {
        return mesSalida;
    }

    public void setMesSalida(short mesSalida) {
        this.mesSalida = mesSalida;
    }

    public short getAñoSalida() {
        return añoSalida;
    }

    public void setAñoSalida(short añoSalida) {
        this.añoSalida = añoSalida;
    }
    
    
}
