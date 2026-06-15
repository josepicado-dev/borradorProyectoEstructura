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
public class ListaSalas {

    // Primer nodo de la lista
    private NodoSala primero;

// Cantidad de salas
    private int tamano;

    public ListaSalas() {
        primero = null;
        tamano = 0;
    }
// Verifica si la lista está vacía

    public boolean estaVacia() {

        return primero == null;
    }
// Agrega una sala al final de la lista

    public void agregarSala(Sala sala) {

        NodoSala nuevo = new NodoSala(sala);

        if (estaVacia()) {

            primero = nuevo;

        } else {

            NodoSala actual = primero;

            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }

            actual.setSiguiente(nuevo);
        }

        tamano++;
    }
// Retorna la cantidad de salas

    public int getTamano() {

        return tamano;
    }
    // Muestra todas las salas

    public void mostrarSalas() {

        NodoSala actual = primero;

        while (actual != null) {

            System.out.println(actual.getDato());

            actual = actual.getSiguiente();
        }
    }
    // Retorna la sala con menos pacientes en espera

    public Sala obtenerSalaConMenosPacientes() {

        if (estaVacia()) {
            return null;
        }

        NodoSala actual = primero;

        Sala menor = actual.getDato();

        while (actual != null) {

            if (actual.getDato().cantidadPacientes()
                    < menor.cantidadPacientes()) {

                menor = actual.getDato();
            }

            actual = actual.getSiguiente();
        }

        return menor;
    }
// Busca una sala por número

    public Sala buscarSala(int numeroSala) {

        NodoSala actual = primero;

        while (actual != null) {

            if (actual.getDato().getNumeroSala() == numeroSala) {
                return actual.getDato();
            }

            actual = actual.getSiguiente();
        }

        return null;
    }// Muestra todas las salas asignadas a un médico

    public void mostrarPorMedico(String medico) {

        NodoSala actual = primero;

        boolean encontrado = false;

        while (actual != null) {

            if (actual.getDato().getMedicoResponsable()
                    .equalsIgnoreCase(medico)) {

                System.out.println(
                        "Sala: "
                        + actual.getDato().getNumeroSala());
                System.out.println(
                        "Sala: "
                        + actual.getDato().getNumeroSala()
                        + " | Pacientes en espera: "
                        + actual.getDato().cantidadPacientes());

                encontrado = true;
            }

            actual = actual.getSiguiente();
        }

        if (!encontrado) {

            System.out.println(
                    "No existen salas para ese médico.");
        }
    }
// Muestra todas las salas asignadas a una enfermera

    public void mostrarPorEnfermera(String enfermera) {

        NodoSala actual = primero;

        boolean encontrado = false;

        while (actual != null) {

            if (actual.getDato().getEnfermeraResponsable()
                    .equalsIgnoreCase(enfermera)) {

                System.out.println(
                        "Sala: "
                        + actual.getDato().getNumeroSala());
                System.out.println(
                        "Sala: "
                        + actual.getDato().getNumeroSala()
                        + " | Pacientes en espera: "
                        + actual.getDato().cantidadPacientes());

                encontrado = true;
            }

            actual = actual.getSiguiente();
        }

        if (!encontrado) {

            System.out.println(
                    "No existen salas para esa enfermera.");
        }
    }
}
