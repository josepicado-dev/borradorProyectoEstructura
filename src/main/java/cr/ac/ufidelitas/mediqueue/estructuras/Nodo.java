/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.estructuras;

/**Esta es la clase BASE de todas las estructuras de datos.
 * Un Nodo es como una "cajita" que guarda un dato y una
 * referencia al siguiente nodo.
 *
 * @author josem
 */
public class Nodo<T> {
    private T dato;         //es de tipo generico, puede ser sede, usuario etc
    private Nodo<T> siguienteM; //hace referencia al siguiente nodo

    public Nodo(T dato) {
        this.dato = dato;// crea el nodo con un dato nada mas
        this.siguienteM = null;
    }

    public Nodo(T dato, Nodo<T> siguienteM) {
        this.dato = dato;
        this.siguienteM = siguienteM; //este crea con un dato y el siguiente que es la referencia
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguienteM() {
        return siguienteM;
    }

    public void setSiguienteM(Nodo<T> siguienteM) {
        this.siguienteM = siguienteM;
    }
    
    
    
    
    
    
    
    
    




}



