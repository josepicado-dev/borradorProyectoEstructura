/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.estructuras;
import cr.ac.ufidelitas.mediqueue.modelo.Registro;
/**
 *
 * @author josem
 */
public class NodoHistorial {
    private Registro Dato;
    private NodoHistorial Siguiente;
    
    public NodoHistorial(Registro dato){
        this.Dato = Dato;
        this.Siguiente= null;
    }

    public Registro getDato() {
        return Dato;
    }

    public void setDato(Registro Dato) {
        this.Dato = Dato;
    }

    public NodoHistorial getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(NodoHistorial Siguiente) {
        this.Siguiente = Siguiente;
    }
    
}
