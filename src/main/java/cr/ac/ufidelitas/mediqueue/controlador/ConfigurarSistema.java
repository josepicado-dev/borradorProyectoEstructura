/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.controlador;

import cr.ac.ufidelitas.mediqueue.estructuras.Nodo;
import cr.ac.ufidelitas.mediqueue.estructuras.Pila;
import cr.ac.ufidelitas.mediqueue.modelo.Sede;
import cr.ac.ufidelitas.mediqueue.modelo.usuario;

/**
 *
 * @author Usuario
 */
public class ConfigurarSistema {
   private Pila<usuario> nuevaPila = new Pila<>();
   private Pila<Sede> nuevaSede = new Pila<>();

   public void agregarSede(Sede nuevaSede){
       this.nuevaSede.push(nuevaSede);
   }

   public void agregarUsuario(usuario nuevaPila){
       this.nuevaPila.push(nuevaPila);
   }
   
   
    
    
    
}
