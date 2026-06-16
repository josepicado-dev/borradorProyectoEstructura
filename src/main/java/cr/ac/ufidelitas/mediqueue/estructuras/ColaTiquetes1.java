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
public class ColaTiquetes1 {
    private Nodo <tiquete> frente;

    public ColaTiquetes1() {
        this.frente = null;
    }
  
    //esto retorna true si la cola esta vacia
    public boolean estaVacia(){
        return frente == null;
    }

  //esto inserta un paciente de acuerdo a su prioridad
    public void encolar(tiquete nuevoPaciente){
        Nodo<tiquete> nuevoNodo = new Nodo<>(nuevoPaciente);
         // Si la cola está vacía
        if (estaVacia()) {
            frente = nuevoNodo;
// si la criticidad es mayor, ira al frente
    }else if (calcularCriticidad(nuevoPaciente) > calcularCriticidad(frente.getDato())){
        nuevoNodo.setSiguienteM(frente);
        frente = nuevoNodo;
    } else{
        Nodo <tiquete> aux = frente;
        //Prioridad segun tamaño
        while (aux.getSiguienteM() != null && calcularCriticidad(aux.getSiguienteM().getDato())>= calcularCriticidad(nuevoPaciente)){
            aux = aux.getSiguienteM();
            
        }
        //el nuevo ira detras de el aux
        nuevoNodo.setSiguienteM(aux.getSiguienteM());
        aux.setSiguienteM(nuevoNodo);
    }
        
    }
        
        private int calcularCriticidad(tiquete t){
            int peso = 0;
            
            if (t.getPrioridad().equalsIgnoreCase("Critico")) peso += 400;
            else if (t.getPrioridad().equalsIgnoreCase("Urgente")) peso += 300;
            else if (t.getPrioridad().equalsIgnoreCase("Regular")) peso += 200;
            else if (t.getPrioridad().equalsIgnoreCase("Control")) peso += 100;
            if (t.getAtencion().equalsIgnoreCase("P")) peso += 50;
            
            return peso;
        }

    public Nodo <tiquete> getFrente() {
        return frente;
    }

    public void setFrente(Nodo <tiquete> frente) {
        this.frente = frente;
    }
    
        
        
    }



