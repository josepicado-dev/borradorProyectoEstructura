/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.estructuras;
import cr.ac.ufidelitas.mediqueue.modelo.Consultorio;
/**
 *
 * @author josem
 */
public class ListaConsultorios {
    private NodoConsultorio primero;
    private int tamano;
    
    public ListaConsultorios() {

        primero = null;
        tamano = 0;
    }
    public void agregarConsultorio(Consultorio consultorio) {

        NodoConsultorio nuevo
                = new NodoConsultorio(consultorio);

        if (primero == null) {

            primero = nuevo;

        } else {

            NodoConsultorio actual = primero;

            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }

            actual.setSiguiente(nuevo);
        }

        tamano++;
    }
    // Retorna el consultorio normal con menos pacientes

    public Consultorio obtenerConsultorioConMenosPacientes() {

        NodoConsultorio actual = primero;

        Consultorio menor = null;

        while (actual != null) {

            if (!actual.getDato().isPreferencial()) {

                if (menor == null
                        || actual.getDato().cantidadPacientes()
                        < menor.cantidadPacientes()) {

                    menor = actual.getDato();
                }
            }

            actual = actual.getSiguiente();
        }

        return menor;
    }
    // Busca un consultorio por número

    public Consultorio buscarConsultorio(int numeroConsultorio) {

        NodoConsultorio actual = primero;

        while (actual != null) {

            if (actual.getDato().getNumeroConsultorio()
                    == numeroConsultorio) {

                return actual.getDato();
            }

            actual = actual.getSiguiente();
        }

        return null;
    }
    // Muestra todos los consultorios

    public void mostrarConsultorios() {

        NodoConsultorio actual = primero;

        while (actual != null) {

            System.out.println(
                    "Consultorio: "
                    + actual.getDato().getNumeroConsultorio()
                    + " | Especialidad: "
                    + actual.getDato().getEspecialidad()
                    + " | Pacientes en espera: "
                    + actual.getDato().cantidadPacientes());

            actual = actual.getSiguiente();
        }
    }
    // Muestra los consultorios asignados a un médico

    public void mostrarPorMedico(String medico) {

        NodoConsultorio actual = primero;

        boolean encontrado = false;

        while (actual != null) {

            if (actual.getDato().getMedicoResponsable()
                    .equalsIgnoreCase(medico)) {

                System.out.println(
                        "Consultorio: "
                        + actual.getDato().getNumeroConsultorio()
                        + " | Especialidad: "
                        + actual.getDato().getEspecialidad());

                encontrado = true;
            }

            actual = actual.getSiguiente();
        }

        if (!encontrado) {

            System.out.println(
                    "No existen consultorios para ese médico.");
        }
    }
}
