/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.controlador;

import cr.ac.ufidelitas.mediqueue.archivos.ArchivoJSON;
import cr.ac.ufidelitas.mediqueue.modelo.Sede;

/**
 *
 * @author josem
 */
public class InicializadorSistema {
     public static  AdministracionHospital inicializar() {

        AdministracionHospital admin = new  AdministracionHospital();

        // Leer JSON
        Sede sede =
            ArchivoJSON.leerSede(
            "configuracionSede.json");

        // Crear salas
        // Crear consultorios

        return admin;
    }
}
