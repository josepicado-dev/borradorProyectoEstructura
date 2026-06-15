/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.archivos;
import cr.ac.ufidelitas.mediqueue.modelo.Sede;
import cr.ac.ufidelitas.mediqueue.modelo.usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



/**
 *
 * @author josem
 */
public class GestorConfig {
    //aca se nombra el nombre del arhcivo
    private static String ARCHIVO_CONFIG = "config.txt";
    
    //aca se verifica si el archivo existe
    public static boolean existeArchivoConfig(){
        File archivo = new File(ARCHIVO_CONFIG);
            return archivo.exists(); 
    }
    
    //crea el archivo 
    public static void creaArchivoI(){
        try{
            File archivo = new File(ARCHIVO_CONFIG);
            if(!archivo.exists()){
                archivo.createNewFile();
                System.out.println("Archivo config.txt creado");
            }
        }catch(IOException e1){
            System.out.println("Error creando el archivo"+ e1.getMessage());
        }
    }
    
    //para guardar el usuario acá en config.txt
    public static void guardarUsuario(usuario usuario){
        try{
            FileWriter writer = new FileWriter(ARCHIVO_CONFIG, true);
            
            writer.write("USUARIO: "+usuario.getUsuario()+""
                    + "|"
                    + usuario.getContraseña()+""
                            + "|"
                            + usuario.getNombre()+""
                                    + "\n");
            writer.close();
        }catch(IOException e2){
            System.out.println("Error guardando usuarios "+ e2.getMessage());
        }
        
    }
    
    
}
