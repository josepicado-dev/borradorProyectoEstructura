/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.modelo;

/**
 *
 * @author jose tiquete de emergencias y registro de pacientes
 *
 * Un ejemplo Tiquete #15
 *
 * Nombre: Juan Pérez 
 * Edad: 65
 *
 * Prioridad: Urgente Tipo Atención: Emergencias 
 * Atención: Preferencial
 */
public class tiquete {
    private int id;
    private String nombrePaciente;
    private String identificacion;
    private int edad;
    private String seguro;
    private String fechadeIngreso;
    // Fecha y hora de atención
    // Inicia en "-1" hasta ser atendido
    private String horaAtencion;
    // Critico, Urgente, Regular o Control
    private String prioridad;
    // C = Consulta
    // S = Salón
    // E = Emergencias
    private String Tipoatencion;
    // P = Preferencial
    // N = Normal
    private String atencion;
    
    
    
    public tiquete(){
        
    }

    public tiquete(int id, String nombrePaciente, String identificacion, int edad, String seguro, String fechadeIngreso, String horaAtencion, String prioridad, String Tipoatencion, String atencion) {
        this.id = id;
        this.nombrePaciente = nombrePaciente;
        this.identificacion = identificacion;
        this.edad = edad;
        this.seguro = seguro;
        this.fechadeIngreso = fechadeIngreso;
        this.horaAtencion = horaAtencion;
        this.prioridad = prioridad;
        this.Tipoatencion = Tipoatencion;
        this.atencion = atencion;//estado de la atencion 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public String getFechadeIngreso() {
        return fechadeIngreso;
    }

    public void setFechadeIngreso(String fechadeIngreso) {
        this.fechadeIngreso = fechadeIngreso;
    }

    public String getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(String horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getTipoatencion() {
        return Tipoatencion;
    }

    public void setTipoatencion(String Tipoatencion) {
        this.Tipoatencion = Tipoatencion;
    }

    public String getAtencion() {
        return atencion;
    }

    public void setAtencion(String atencion) {
        this.atencion = atencion;
    }
    
    //convertir este objeto de tiquete en una linea de texto para guardarlo
    public String convertir(){
        return id + "|" +
           nombrePaciente + "|" +
           identificacion + "|" +
           edad + "|" +
           seguro + "|" +
           fechadeIngreso + "|" +
           horaAtencion + "|" +
           prioridad + "|" +
           Tipoatencion + "|" +
           atencion;
    }
}
