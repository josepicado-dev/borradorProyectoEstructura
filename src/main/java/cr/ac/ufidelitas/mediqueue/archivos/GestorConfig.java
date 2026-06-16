/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.archivos;
import cr.ac.ufidelitas.mediqueue.estructuras.PilaUsuario;
import cr.ac.ufidelitas.mediqueue.modelo.Sede;
import cr.ac.ufidelitas.mediqueue.modelo.usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author josem
 */
public class GestorConfig {
    //aca se nombra el nombre del arhcivo
    private static String ARCHIVO_CONFIG = "config.txt";
    
    //Scanner para consola.
    Scanner sc = new Scanner(System.in);
    
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
    
    
     public static PilaUsuario<usuario> cargarUsuariosEnPila() {
         PilaUsuario<usuario> pila = new PilaUsuario<>();
         if (!existeArchivoConfig()){
             return pila;
            
         }
         try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_CONFIG))) {
             String leerLinea;
             leerLinea = br.readLine();
             while (leerLinea != null){
                 String usuario = "";
                 String contraseña = "";
                 String nombre = "";
                 int contadorDatos = 0;
                 for (int i = 0; i < leerLinea.length(); i++) {
                     char letra = leerLinea.charAt(i);
                     if (letra == '|') {
                        contadorDatos++;
                        if (contadorDatos == 0) {
                            usuario = usuario + letra;
                          } else if (contadorDatos == 1) {
                            contraseña = contraseña + letra;
                        } else if (contadorDatos == 2) {
                            nombre = nombre + letra;
                        }  
                        }
                    else if (contadorDatos == 2) {
                        nombre = nombre + letra;
                    }
                 }
                 if (usuario.length() > 8) {
                    usuario = usuario.substring(8);
                }
                 usuario u = new usuario(usuario, contraseña, nombre);
                pila.push(u);
             }
             
         }catch (IOException e) {
            System.out.println("Error al cargar usuarios en tu pila: " + e.getMessage());
        }
        return pila;
        
        
     
     }
     
     public static void ejecutarConfiguracion(){
         
     PilaUsuario pila = new PilaUsuario();
         Scanner sc = new Scanner(System.in);
            System.out.println("\n--- CONFIGURACIÓN INICIAL ---");
            System.out.print("Nombre de la sede hospitalaria: ");
            String nombre = sc.nextLine();
            System.out.print("Cantidad de Salas Médicas: ");
            int salas = Integer.parseInt(sc.nextLine());
            System.out.print("Cantidad de Consultorios: ");
            int consultorios = Integer.parseInt(sc.nextLine());
            System.out.print("Cantidad de Salas de Emergencia: ");
            int salasEmergencia = Integer.parseInt(sc.nextLine());
            System.out.print("¿Cuántos usuarios desea registrar para el control de acceso?: ");
            int usuarios = Integer.parseInt(sc.nextLine());
        
            Sede nuevaSede = new Sede(nombre, salas, consultorios, salasEmergencia);
            ArchivoJSON.guardarSede(nuevaSede, "configuracionSede.json");
            for (int i = 1; i <= usuarios; i++) {
            System.out.println("\nRegistro Usuario #" + i + ":");
            System.out.print("Nombre Completo: ");
            String usuario = sc.nextLine();
            System.out.print("Usuario ID: ");
            String contraseña = sc.nextLine();
            System.out.print("Contraseña: ");
            String nombreA = sc.nextLine();
            usuario u = new usuario(usuario, contraseña, nombreA);
            pila.push(u);
            ArchivoJSON.guardarUsuario(pila, "configuracionSede.json");
            
            
            
        }
            
}
}
    
   
    
    

