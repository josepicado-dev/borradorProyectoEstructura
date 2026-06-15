/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.estructuras;
import cr.ac.ufidelitas.mediqueue.modelo.tiquete;

/**
 *
 * @author jose
 * una cola no puede guardar objetos sueltos, se necesita alog que los concecte 
 * se usa el Nodo que almacena el dato actual y una referencia al siguiente hasta que llegue a null
 * en la pila 
 */
public class NodoTiquete {
    private tiquete Dato;
    private NodoTiquete siguiente;

    public NodoTiquete(tiquete Dato) {
        this.Dato = Dato;
        this.siguiente = null;
        //cuando se crea un nodo incialmente
        //no apunta a ningun lado
    }

    public tiquete getDato() {
        return Dato;
    }

    public void setDato(tiquete Dato) {
        this.Dato = Dato;
    }

    public NodoTiquete getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoTiquete siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
