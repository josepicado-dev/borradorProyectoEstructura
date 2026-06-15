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
public class Sala {
    // Número identificador
    private int numeroSala;

    // Capacidad máxima
    private int capacidad;

    // Médico responsable
    private String medicoResponsable;

    // Enfermera responsable
    private String enfermeraResponsable;

    // Indica si es la sala preferencial
    private boolean preferencial;

    // Indica si es la sala crítica
    private boolean critica;
    

    // Cola de pacientes
    private ColaTiquetes colaEspera; //*****

    public Sala(int numeroSala, int capacidad, String medicoResponsable, String enfermeraResponsable, boolean preferencial, boolean critica) {
        this.numeroSala = numeroSala;
        this.capacidad = capacidad;
        this.medicoResponsable = medicoResponsable;
        this.enfermeraResponsable = enfermeraResponsable;
        this.preferencial = preferencial;
        this.critica = critica;
        this.colaEspera = new ColaTiquetes(); //cada sala tiene su propia cola
    }
    
    // Retorna cantidad de pacientes esperando
    public int cantidadPacientes() {
        return colaEspera.getTamano();
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMedicoResponsable() {
        return medicoResponsable;
    }

    public void setMedicoResponsable(String medicoResponsable) {
        this.medicoResponsable = medicoResponsable;
    }

    public String getEnfermeraResponsable() {
        return enfermeraResponsable;
    }

    public void setEnfermeraResponsable(String enfermeraResponsable) {
        this.enfermeraResponsable = enfermeraResponsable;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    public boolean isCritica() {
        return critica;
    }

    public void setCritica(boolean critica) {
        this.critica = critica;
    }

    public ColaTiquetes getColaEspera() {
        return colaEspera;
    }

    public void setColaEspera(ColaTiquetes colaEspera) {
        this.colaEspera = colaEspera;
    }
    
    // Indica si es sala preferencial
    public boolean ispreferencial() {
        return preferencial;
    }

// Indica si es sala crítica
    public boolean iscritica() {
        return critica;
    }

// Retorna la cola de espera
    public ColaTiquetes getcolaEspera() {
        return colaEspera;
    }

}

