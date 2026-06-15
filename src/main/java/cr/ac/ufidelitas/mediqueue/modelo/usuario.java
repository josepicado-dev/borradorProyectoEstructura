/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.modelo;

/**
 *
 * @author jose
 * Esta clase representa que usuarios o personas pueden ingresar al sistema, si un usuario no esta registrado o
 * sus datos de usuario y contraseña inexistentes no le permitirá ingrear.
 * 
 * Un ejemplo:
 * Usuario: Admin
 * Passwrod: 1234     atributos 
 * Nombre: Administrador 
 */
public class usuario {
    private String usuario; //ingrear el usuario
    private String contraseña; //ingresar la contraseña
    private String nombre;//ingresar el nombre
   
    
    public usuario(){ //constructor vacío para despues ingresar los datos al JSON
        
        
    }

    public usuario(String usuario, String contraseña, String nombre) { //constructor completo
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
    }
//setter y getters
    public String getUsuario() {
        return usuario;
    }                                                                  //private porque nadie debe modificarlas directamente.



    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //mostrar la información
    
    @Override
    public String toString(){
        return "Usuario{"+
                "usuario= "+ usuario + "\""+
                ", Nombre completo= "+ nombre+ "\"" +
                "}";
                
                
    }
    
    
    
    
    
    
}
