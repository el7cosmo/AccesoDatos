package Ejercicio3.Parking;

public class Vehiculo {

    String matricula;
    String fechaInicio;
    String fechaFin;

    public Vehiculo(){
        this.matricula=matricula;
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
    }

     public Vehiculo( String matricula,String fechaInicio,String fechaFin){
        this.matricula=matricula;
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
    }

    

    
    
}
