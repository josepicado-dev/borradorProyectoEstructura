/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.archivos;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import cr.ac.ufidelitas.mediqueue.estructuras.Pila;
import cr.ac.ufidelitas.mediqueue.modelo.Sede;
import cr.ac.ufidelitas.mediqueue.modelo.usuario;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author josem
 */
public class ArchivoJSON {
    
    //acá se van a guardar dos funciones principales
    //Guardar JSON
    //Leer JSON
    
    //guarda la configuracion de una sede en el JSON
    public static void guardarSede(Sede sede, String rutaArchivo){
        try{
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter writer= new FileWriter(rutaArchivo);
            gson.toJson(sede, writer);
            writer.close();
            
            System.out.println("Archivo JSON fue guardado correctamente");
        }catch (IOException e1){
            System.out.println("Error al guardar el archivo JSON"+ e1.getMessage());
            
        }
    }
    public static void guardarUsuario(Pila pila, String rutaArchivo){
        try{
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter writer= new FileWriter(rutaArchivo);
            gson.toJson(pila, writer);
            writer.close();
            
            System.out.println("Archivo JSON fue guardado correctamente");
        }catch (IOException e1){
            System.out.println("Error al guardar el archivo JSON"+ e1.getMessage());
            
        }
    }
    
      // Lee una sede desde un archivo JSON
    public static Sede leerSede(String rutaArchivo){
        try{
            Gson gson = new Gson();
            FileReader reader = new FileReader(rutaArchivo);
            Sede sede = gson.fromJson(reader, Sede.class);
            reader.close();
            return sede;
        }catch (IOException e2){
            System.out.println("Error al leer JSON"+e2.getMessage());
            return null;
        }
    }


}

