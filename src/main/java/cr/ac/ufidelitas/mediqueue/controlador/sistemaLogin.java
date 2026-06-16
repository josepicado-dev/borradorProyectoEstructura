/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.controlador;

import cr.ac.ufidelitas.mediqueue.archivos.ArchivoJSON;
import cr.ac.ufidelitas.mediqueue.archivos.GestorConfig;
import cr.ac.ufidelitas.mediqueue.estructuras.Pila;
import cr.ac.ufidelitas.mediqueue.modelo.Sede;
import cr.ac.ufidelitas.mediqueue.modelo.usuario;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class sistemaLogin {
    private static ConfigurarSistema configurarSistema = new ConfigurarSistema();
    private static Sede sedeActual = null;
    private static Scanner sc = new Scanner(System.in);
    
    public static void ejecutarConfiguracion(){
         
     Pila pila = new Pila();
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
            configurarSistema.agregarUsuario(u);
            
            
            
        }
            
            
    
}
    
    public static void crearNuevaSedeDinamica() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n--- REGISTRO DINÁMICO DE SEDE ---");
        System.out.print("Nombre de la sede hospitalaria: ");
        String nombre = teclado.nextLine();
        System.out.print("Cantidad de Salas Médicas Totales: ");
        int salas = Integer.parseInt(sc.nextLine());
        System.out.print("Cantidad de Consultorios Totales: ");
        int consultorios = Integer.parseInt(sc.nextLine());
        System.out.print("Cantidad de Salas de Emergencia Totales: ");
        int emergencias = Integer.parseInt(sc.nextLine());
        teclado.nextLine();

        Sede nuevaSede = new Sede(nombre, salas, consultorios, emergencias);
        configurarSistema.agregarSede(nuevaSede);
        
        GestorConfig.guardarConfiguracionSede(configurarSistema);
    }
    
    
    
}    
