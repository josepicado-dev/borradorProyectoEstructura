/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.modelo;

/**
 *
 * @author josem
 */
public class consulta {
    private int idConsulta;
    private tiquete Tiquete; //tiquete asociado
    private String medico;
    private String diagnostico;
    private String medicamentos;
    private String observaciones;
    private String procedimientos;
    // Ejemplos:
// Sala 1
// Sala Critica
// Consultorio 3
// Consultorio Preferencial
    private String consultorioAsignado;
    private double costo;
    
    public consulta(){
        
    }

    public consulta(int idConsulta, tiquete Tiquete, String medico, String diagnostico, String medicamentos, String observaciones, String procedimientos, String consultorioAsignado, double costo) {
        this.idConsulta = idConsulta;
        this.Tiquete = Tiquete;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.medicamentos = medicamentos;
        this.observaciones = observaciones;
        this.procedimientos = procedimientos;
        this.consultorioAsignado = consultorioAsignado;
        this.costo = costo;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public tiquete getTiquete() {
        return Tiquete;
    }

    public void setTiquete(tiquete Tiquete) {
        this.Tiquete = Tiquete;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getProcedimientos() {
        return procedimientos;
    }

    public void setProcedimientos(String procedimientos) {
        this.procedimientos = procedimientos;
    }

    public String getConsultorioAsignado() {
        return consultorioAsignado;
    }

    public void setConsultorioAsignado(String consultorioAsignado) {
        this.consultorioAsignado = consultorioAsignado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("consulta{");
        sb.append("idConsulta=").append(idConsulta);
        sb.append(", Tiquete=").append(Tiquete);
        sb.append(", medico=").append(medico);
        sb.append(", diagnostico=").append(diagnostico);
        sb.append(", medicamentos=").append(medicamentos);
        sb.append(", observaciones=").append(observaciones);
        sb.append(", procedimientos=").append(procedimientos);
        sb.append(", consultorioAsignado=").append(consultorioAsignado);
        sb.append(", costo=").append(costo);
        sb.append('}');
        return sb.toString();
    }


    public String convertirArcivoo(){
        return idConsulta + "|" +
                Tiquete.getId() + "|" +
                medico + "|" +
                diagnostico + "|" +
                medicamentos + "|" +
                observaciones + "|" +
                procedimientos + "|" +
                consultorioAsignado + "|" +
                costo + "|" +
                Tiquete.getAtencion() + "|" +
                Tiquete.getHoraAtencion();
        
    }
    
    
    
    
    
}
