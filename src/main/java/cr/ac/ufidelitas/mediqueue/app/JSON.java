/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.app;
import cr.ac.ufidelitas.mediqueue.archivos.ArchivoJSON;
import cr.ac.ufidelitas.mediqueue.modelo.Sede;
/**
 *
 * @author josem
 */
public class JSON {
    public static void main(String[]args){
        //esto es para crear una sede 
        Sede sede = new Sede(
        "Hospital Central",
        5,
        4,
        2,
        1,
        1,
        2);
        
        //guardar el JSON
        ArchivoJSON.guardarSede(sede, "configuracionSede.json");
        
        //leer el JSON
        Sede sedeLeida = ArchivoJSON.leerSede("configuracionSede.json");
        
        //mostrar el resultado
        System.out.println(sedeLeida);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
