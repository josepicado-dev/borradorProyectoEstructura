/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.modelo;
import cr.ac.ufidelitas.mediqueue.estructuras.ColaTiquetes;
/**
 *
 * @author josem
 */
public class Consultorio {
    // Número del consultorio
    private int numeroConsultorio;

    // Capacidad máxima
    private int capacidad;

    // Especialidad médica
    private String especialidad;

    // Médico responsable
    private String medicoResponsable;

    // Indica si es el consultorio preferencial
    private boolean preferencial;

    // Cola de pacientes esperando
    private ColaTiquetes colaEspera;

    public Consultorio(int numeroConsultorio, int capacidad, String especialidad, String medicoResponsable, boolean preferencial, ColaTiquetes colaEspera) {
        this.numeroConsultorio = numeroConsultorio;
        this.capacidad = capacidad;
        this.especialidad = especialidad;
        this.medicoResponsable = medicoResponsable;
        this.preferencial = preferencial;
        this.colaEspera = new ColaTiquetes();
    }
    // Retorna cantidad de pacientes esperando
    public int cantidadPacientes() {
        return colaEspera.getTamano();
    }

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(int numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getMedicoResponsable() {
        return medicoResponsable;
    }

    public void setMedicoResponsable(String medicoResponsable) {
        this.medicoResponsable = medicoResponsable;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    public ColaTiquetes getColaEspera() {
        return colaEspera;
    }

    public void setColaEspera(ColaTiquetes colaEspera) {
        this.colaEspera = colaEspera;
    }

    
}
