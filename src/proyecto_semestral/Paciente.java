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
public class Paciente extends Persona{
    
    
    private String diagnostico;
    private short diaIngreso;
    private short mesIngreso;
    private short anioIngreso;
    private short diaSalida;
    private short mesSalida;
    private short anioSalida;


    public Paciente(String nombres, String apellidos, String rut, short edad, String diagnostico, short diaIngreso, short mesIngreso, short añoIngreso) {
        super(nombres, apellidos, rut, edad);
        this.diagnostico = diagnostico;
        this.diaIngreso = diaIngreso;
        this.mesIngreso = mesIngreso;
        this.anioIngreso = añoIngreso;
    }
    
    public Paciente(String nombres, String apellidos, String rut, short edad, String diagnostico, short diaIngreso, short mesIngreso, short añoIngreso, short diaSalida, short mesSalida, short añoSalida) {
        super(nombres, apellidos, rut, edad);
        this.diagnostico = diagnostico;
        this.diaIngreso = diaIngreso;
        this.mesIngreso = mesIngreso;
        this.anioIngreso = añoIngreso;
        this.diaSalida = diaSalida;
        this.mesSalida = mesSalida;
        this.anioSalida = añoSalida;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String fechaIngreso() {
        return diaIngreso+" "+mesIngreso+" "+anioIngreso;
    }

    public void setFechaIngreso(short diaIngreso,short mesIngreso,short anioIngreso) {
        this.diaIngreso = diaIngreso;
        this.mesIngreso = mesIngreso;
        this.anioIngreso = anioIngreso;
    }
    
    public String fechaAlta(){
        return diaSalida+" "+mesSalida+" "+anioSalida+" ";
    }

    public void setFechaSalida(short diaSalida,short mesSalida,short anioSalida){
        this.diaSalida = diaSalida;
        this.mesSalida = mesSalida;
        this.anioSalida = anioSalida;
    }
    
}
