/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.estructuras;
import  cr.ac.ufidelitas.mediqueue.modelo.tiquete;
/**
 *
 * @author josem
 */
public class ColaPrioridadTiquetes {
    private ColaTiquetes colaCriticos;
    private ColaTiquetes colaUrgentes;
    private ColaTiquetes colaRegulares;
    private ColaTiquetes colaControl;

    public ColaPrioridadTiquetes() {
        colaCriticos = new ColaTiquetes();
        colaUrgentes = new ColaTiquetes();
        colaRegulares = new ColaTiquetes();
        colaControl = new ColaTiquetes();
    }
    //esto inserta el tiquete en la cola correspondiente
    public void agregarTiquete(tiquete Tiquete){
        String prioridad = Tiquete.getPrioridad();
        
        if(prioridad.equalsIgnoreCase("Critico")){
            colaCriticos.encolar(Tiquete);
            
        }else if (prioridad.equalsIgnoreCase("Urgente")){
            colaUrgentes.encolar(Tiquete);
        }else if (prioridad.equalsIgnoreCase("Regular")){
            colaRegulares.encolar(Tiquete);
        }else{
            colaControl.encolar(Tiquete);
        }
    }
    //esto atiende al siguiente paciente segun la prioridad 
    public tiquete atenderSiguiente(){
        if(!colaCriticos.estaVacia()){
            return colaCriticos.desencolar();
        }
        if (!colaUrgentes.estaVacia()){
            return colaUrgentes.desencolar();
        }
        if (!colaRegulares.estaVacia()){
            return colaRegulares.desencolar();
        }
        if (!colaControl.estaVacia()){
            return colaControl.desencolar();
        }
        return null;
    }
    //esto retorna la cantidad de pacientes criticos  y los demas estados de prioridad 
    public int cantidadCriticos(){
        return colaCriticos.getTamano();
    }
    public int cantidadUrgentes(){
        return colaUrgentes.getTamano();
    }
    public int cantidadRegulares(){
        return colaRegulares.getTamano();
    }
    public int cantidadControl(){
        return colaControl.getTamano();
    }
}
