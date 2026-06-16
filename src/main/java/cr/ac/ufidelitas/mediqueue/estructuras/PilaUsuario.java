/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.estructuras;

import cr.ac.ufidelitas.mediqueue.modelo.usuario;

/**
 *
 * @author Usuario
 */
public class PilaUsuario <T> {
    
    private Nodo<T> cima;

    public PilaUsuario() {
        this.cima = null;
    }

   
    
    public void push(T nuevoUsuario) {
        Nodo nuevoNodo = new Nodo(nuevoUsuario);
        nuevoNodo.setSiguienteM(nuevoNodo);
        this.cima = nuevoNodo;
    }
    
    public boolean esVacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public T pop() {
        if (esVacia()) {
            return null;
        } else {
            T auxDato = cima.getDato();
            cima = cima.getSiguienteM();
            return auxDato;
        }
    }
    
    public void mostrar() {
        if (esVacia()) {
            System.out.println("Esta vacia!!");
        } else {
            Nodo actual = this.cima;
            while (actual != null) {
                
                System.out.println(actual.toString());
                actual = actual.getSiguienteM();
            }
        }
    }
    
    @Override
    public String toString() {
        
        if (esVacia()) {
            System.out.println("Esta vacia!!");
        }
        
        StringBuilder sb = new StringBuilder();
        Nodo<T> actual = this.cima;
        while (actual != null) {
            sb.append("\n");
            sb.append(actual.toString());
            actual = actual.getSiguienteM();//En el caso de la pila es un abajo
            if(actual!=null)
                sb.append(",");
        }
        return sb.toString().trim();
    }

    public Nodo<T> getCima() {
        return cima;
    }

    public void setCima(Nodo<T> cima) {
        this.cima = cima;
    }

   
    
    
    
}
