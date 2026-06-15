/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.estructuras;
import cr.ac.ufidelitas.mediqueue.modelo.Consultorio;
/**
 *
 * @author josem
 */
public class NodoConsultorio {
    // Consultorio almacenado
    private Consultorio dato;

    // Referencia al siguiente nodo
    private NodoConsultorio siguiente;

    // Constructor
    public NodoConsultorio(Consultorio dato) {

        this.dato = dato;
        this.siguiente = null;
    }

    public Consultorio getDato() {
        return dato;
    }

    public void setDato(Consultorio dato) {
        this.dato = dato;
    }

    public NodoConsultorio getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoConsultorio siguiente) {
        this.siguiente = siguiente;
    }
    
}
