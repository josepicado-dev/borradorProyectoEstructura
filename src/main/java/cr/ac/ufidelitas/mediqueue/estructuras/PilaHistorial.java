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
public class PilaHistorial {
   private NodoHistorial cima;
   private int tamano;
   
   public PilaHistorial(){
       cima= null;
       tamano= 0;
   }
   // Verifica si la pila está vacía
    public boolean estaVacia() {

        return cima == null;
    }

    // Retorna cantidad de elementos
    public int getTamano() {

        return tamano;
    }
   // Inserta un elemento en la cima
    public void push(Registro registro) {

        NodoHistorial nuevo = new NodoHistorial(registro);

        nuevo.setSiguiente(cima);

        cima = nuevo;

        tamano++;
    }
    // Elimina el elemento de la cima
    public Registro pop() {

        if (estaVacia()) {
            return null;
        }

        Registro dato = cima.getDato();

        cima = cima.getSiguiente();

        tamano--;

        return dato;
    }
    // Consulta el elemento de la cima sin eliminarlo
    public Registro peek() {

        if (estaVacia()) {
            return null;
        }

        return cima.getDato();
    }
}

