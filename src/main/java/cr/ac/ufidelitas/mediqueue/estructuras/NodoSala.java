/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.estructuras;
import cr.ac.ufidelitas.mediqueue.modelo.Sala;
/**
 *
 * @author josem
 */
public class NodoSala {
       // Sala almacenada
    private Sala dato;

    // Siguiente nodo
    private NodoSala siguiente;
    
    public NodoSala(Sala dato){
        this.dato= dato;
        this.siguiente= null;
    }

    public Sala getDato() {
        return dato;
    }

    public void setDato(Sala dato) {
        this.dato = dato;
    }

    public NodoSala getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSala siguiente) {
        this.siguiente = siguiente;
    }
    
}
