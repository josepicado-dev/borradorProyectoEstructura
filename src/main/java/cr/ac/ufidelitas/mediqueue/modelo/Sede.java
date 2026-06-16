/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ufidelitas.mediqueue.modelo;

/**
 *
 * @author jose
 * objetivo de la clase:
 * esta clase representa una sede hospitalaria dentro del sistema 
 * cada sede tiene salas médicas, consultorios y salas de emergencua
 * 
 * Siempre debe de haber 1 sala preferencial y 1 consultorio preferencial
 * siempre debe haber 1 sala de emergencuas cruticas
 * las demas deben de ser normales 
 * 
 */
public class Sede {
    //nombre identificador de la sede hospitalaria
    private String nombreSede;
    private int cantidadSalasM;                          //numeros de salas por departamento
    private int cantidasConsultorios; //numero total de consultorios
    private int cantidadSalasEmer;
    
   public static int SALAS_PREFERENCIALES =1; //siempre hay 1 sala preferencial en cada sede
   public static int CONSULTORIOS_PREFERENCIALES =1; //consultorios preferenciales en cada sede
   public static int SALAS_CRITICAS =1; //salas criticas por sede
   
   public Sede(){ //constructor vacio, este se necesita cuando Gson ocupa crear un objeto, vacio para luego llamar a los atributos
    
}

    public Sede(String nombreSede, int cantidadSalasM, int cantidasConsultorios, int cantidadSalasEmer) {//crea la sede con toda su información
        this.nombreSede = nombreSede;
        this.cantidadSalasM = cantidadSalasM;
        this.cantidasConsultorios = cantidasConsultorios;
        this.cantidadSalasEmer = cantidadSalasEmer;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public int getCantidadSalasM() {
        return cantidadSalasM;
    }

    public void setCantidadSalasM(int cantidadSalasM) {
        this.cantidadSalasM = cantidadSalasM;
    }

    public int getCantidasConsultorios() {
        return cantidasConsultorios;
    }

    public void setCantidasConsultorios(int cantidasConsultorios) {
        this.cantidasConsultorios = cantidasConsultorios;
    }

    public int getCantidadSalasEmer() {
        return cantidadSalasEmer;
    }

    public void setCantidadSalasEmer(int cantidadSalasEmer) {
        this.cantidadSalasEmer = cantidadSalasEmer;
    }

    public static int getSALAS_PREFERENCIALES() {
        return SALAS_PREFERENCIALES;
    }

    public static void setSALAS_PREFERENCIALES(int SALAS_PREFERENCIALES) {
        Sede.SALAS_PREFERENCIALES = SALAS_PREFERENCIALES;
    }

    public static int getCONSULTORIOS_PREFERENCIALES() {
        return CONSULTORIOS_PREFERENCIALES;
    }

    public static void setCONSULTORIOS_PREFERENCIALES(int CONSULTORIOS_PREFERENCIALES) {
        Sede.CONSULTORIOS_PREFERENCIALES = CONSULTORIOS_PREFERENCIALES;
    }

    public static int getSALAS_CRITICAS() {
        return SALAS_CRITICAS;
    }

    public static void setSALAS_CRITICAS(int SALAS_CRITICAS) {
        Sede.SALAS_CRITICAS = SALAS_CRITICAS;
    }
    
    //metodos para calcular
    public int getSalasNormales(){
        return this.cantidadSalasM - SALAS_PREFERENCIALES- SALAS_CRITICAS;
    }
    
    public int getConsultoriosNormales(){
        return this.cantidasConsultorios - CONSULTORIOS_PREFERENCIALES;
    }
    
    public int getEmergenciasNormales(){
        return this.cantidadSalasEmer - SALAS_CRITICAS;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sede{");
        sb.append("nombreSede=").append(nombreSede);
        sb.append(", cantidadSalasM=").append(cantidadSalasM);
        sb.append(", cantidasConsultorios=").append(cantidasConsultorios);
        sb.append(", cantidadSalasEmer=").append(cantidadSalasEmer);
        sb.append('}');
        return sb.toString();
    }
    
    
    
   
   

   


    
    
    
}
