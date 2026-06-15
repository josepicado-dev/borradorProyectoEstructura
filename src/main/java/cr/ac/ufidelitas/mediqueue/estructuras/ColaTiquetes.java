/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.estructuras;
import cr.ac.ufidelitas.mediqueue.modelo.tiquete;
/**
 *
 * @author jose
 */
public class ColaTiquetes {
    private NodoTiquete frente;
    private NodoTiquete fin;
    private int tamano;
    
    public ColaTiquetes(){
        frente = null;
        fin= null;
        tamano= 0;
    }
    //esto retorna true si la cola esta vacia
    public boolean estaVacia(){
        return frente == null;
    }

    public int getTamano() {
        return tamano;
    }
    //esto inserta un paciente al final de la cola
    public void encolar(tiquete Tiquete){
        NodoTiquete nuevo = new NodoTiquete(Tiquete);
         // Si la cola está vacía
        if (estaVacia()) {

            frente = nuevo;
            fin = nuevo;

        } else {

            // El último apunta al nuevo nodo
            fin.setSiguiente(nuevo);

            // El nuevo se convierte en el último
            fin = nuevo;
        }

        tamano++;
    
    }
    //esto elemina y retorna el primer paciente
    public tiquete desencolar(){
        if(estaVacia()){
            return null;
        }
        tiquete Dato= frente.getDato();
        frente = frente.getSiguiente();
        tamano--;
        //si quedo vacía
        if(frente== null){
            fin= null;
        }
        return Dato;
    }
    //retorna el primer paciente sin elemimnarlo
    public tiquete verPrimero(){
        if(estaVacia()){
            return null;
        }
        return frente.getDato();
    }
    //esto muestra todo los pacientes de la cola 
    public void mostrarCola(){
        NodoTiquete actual = frente;
        
        while (actual !=null){
            System.out.println(actual.getDato());
            actual= actual.getSiguiente();
        }
    }


    
}
