/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.controlador;

import cr.ac.ufidelitas.mediqueue.archivos.GestorConfig;
import java.util.Scanner;
import cr.ac.ufidelitas.mediqueue.archivos.ArchivoJSON;
/**
 *
 * @author Usuario
 */
public class Main {
    private static Scanner sc = new Scanner(System.in);
     private static GestorConfig config = new GestorConfig();
     
    
   
    
    public static void main(String[] args) {
       
        System.out.println("=========================================");
        System.out.println("   SISTEMA MEDIQUEUE HOSPITALARIO       ");
        System.out.println("=========================================");
        if (!GestorConfig.existeArchivoConfig())
            GestorConfig.ejecutarConfiguracion();
        }
            
        
        
    
    
}
