/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.controlador;
import cr.ac.ufidelitas.mediqueue.estructuras.*;
import cr.ac.ufidelitas.mediqueue.modelo.*;
/**
 *
 * @author josem
 */
public class AdministracionHospital {
    // Maneja todas las prioridades
    private ColaPrioridadTiquetes colaPrioridades;

    // Historial clínico
    private PilaHistorial historial;

    // Salas dinámicas
    private ListaSalas listaSalas;

    // Consultorios dinámicos
    private ListaConsultorios listaConsultorios;
    
    public AdministracionHospital(){
        colaPrioridades= new ColaPrioridadTiquetes();
        historial= new PilaHistorial();
        listaSalas = new ListaSalas();
        listaConsultorios= new ListaConsultorios();
    }
    // Registra un nuevo paciente

    public void registrarTiquete(tiquete Tiquete) {

        colaPrioridades.agregarTiquete(Tiquete);
    }
    // Obtiene el siguiente paciente según prioridad

    public tiquete obtenerSiguientePaciente() {

        return colaPrioridades.atenderSiguiente();
    }
    // Guarda una consulta en el historial

    public void registrarEnHistorial(
            Registro registro) {

        historial.push(registro);
    }
    // Consulta el último registro sin eliminarlo

    public Registro verUltimoRegistro() {

        return historial.peek();
    }
    // Agrega una nueva sala

    public void agregarSala(Sala sala) {

        listaSalas.agregarSala(sala);
    }
    // Agrega un nuevo consultorio

    public void agregarConsultorio(
            Consultorio consultorio) {

        listaConsultorios.agregarConsultorio(
                consultorio);
    }
    
    
}
