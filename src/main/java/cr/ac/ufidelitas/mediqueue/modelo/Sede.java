/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.modelo;

/**
 *
 * @author jose
 * acá se guarda la configuración del hospital dependiendo de cuantas salas se van a 
 * configurar
 * 
 */
public class Sede {
    private String nombreSede;
    private int cantidadSalasM;                          //numeros de salas por departamento sin inicarlas en un valor porque afecta en los requirimientos
    private int cantidasConsultorios;
    private int cantidadSalasEmer;
    private int salaPreferencial;
    private int consultorPreferencial; 
    private int salaEmergenciaCritica;
    
    public Sede(){
        
    }

    public Sede(String nombreSede, int cantidadSalasM, int cantidasConsultorios, int cantidadSalasEmer, int salaPreferencial, int consultorPreferencial, int salaEmergenciaCritica) {
        this.nombreSede = nombreSede;
        this.cantidadSalasM = cantidadSalasM;
        this.cantidasConsultorios = cantidasConsultorios;
        this.cantidadSalasEmer = cantidadSalasEmer;
        this.salaPreferencial = salaPreferencial;
        this.consultorPreferencial = consultorPreferencial;
        this.salaEmergenciaCritica = salaEmergenciaCritica;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public int getCantidadSalasM() {
        return cantidadSalasM;
    }

    public void setCantidadSalasM(int cantidadSalasM) {
        this.cantidadSalasM = cantidadSalasM;
    }

    public int getCantidasConsultorios() {
        return cantidasConsultorios;
    }

    public void setCantidasConsultorios(int cantidasConsultorios) {
        this.cantidasConsultorios = cantidasConsultorios;
    }

    public int getCantidadSalasEmer() {
        return cantidadSalasEmer;
    }

    public void setCantidadSalasEmer(int cantidadSalasEmer) {
        this.cantidadSalasEmer = cantidadSalasEmer;
    }

    public int getSalaPreferencial() {
        return salaPreferencial;
    }

    public void setSalaPreferencial(int salaPreferencial) {
        this.salaPreferencial = salaPreferencial;
    }

    public int getConsultorPreferencial() {
        return consultorPreferencial;
    }

    public void setConsultorPreferencial(int consultorPreferencial) {
        this.consultorPreferencial = consultorPreferencial;
    }

    public int getSalaEmergenciaCritica() {
        return salaEmergenciaCritica;
    }

    public void setSalaEmergenciaCritica(int salaEmergenciaCritica) {
        this.salaEmergenciaCritica = salaEmergenciaCritica;
    }

    @Override
    public String toString() {
        return "Sede{" + "nombreSede=" + nombreSede + ", cantidadSalasM=" + cantidadSalasM + 
                ", cantidasConsultorios=" + cantidasConsultorios + 
                ", cantidadSalasEmer=" + cantidadSalasEmer + 
                ", salaPreferencial=" + salaPreferencial + 
                ", consultorPreferencial=" + consultorPreferencial + 
                ", salaEmergenciaCritica=" + salaEmergenciaCritica + '}';
    }
    
    
    
}
