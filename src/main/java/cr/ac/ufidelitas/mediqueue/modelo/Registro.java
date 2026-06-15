/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.modelo;

/**
 *
 * @author josem
 */
public class Registro {
    private String indentificacionPaciente;
    private consulta Consulta;
    private String resultado; //estado finalde la atencion
    private String fechaDeRegistro;
    
    public Registro(){
        
    }

    public Registro(String indentificacionPaciente, consulta Consulta, String resultado, String fechaDeRegistro) {
        this.indentificacionPaciente = indentificacionPaciente;
        this.Consulta = Consulta;
        this.resultado = resultado;
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public String getIndentificacionPaciente() {
        return indentificacionPaciente;
    }

    public void setIndentificacionPaciente(String indentificacionPaciente) {
        this.indentificacionPaciente = indentificacionPaciente;
    }

    public consulta getConsulta() {
        return Consulta;
    }

    public void setConsulta(consulta Consulta) {
        this.Consulta = Consulta;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(String fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }
    public String convertirAArchivo(){
         return indentificacionPaciente + "|" +
               Consulta.getIdConsulta() + "|" +
               resultado + "|" +
               fechaDeRegistro;
    }

    @Override
    public String toString() {
        return "Registro{" + "indentificacionPaciente=" + indentificacionPaciente + 
                ", Consulta=" + Consulta + 
                ", resultado=" + resultado + 
                ", fechaDeRegistro=" + fechaDeRegistro + '}';
    }
    
}
