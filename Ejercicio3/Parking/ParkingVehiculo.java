package Ejercicio3.Parking;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public  class ParkingVehiculo implements Parking{

    static final double PRECIO_POR_MINUTO = 0.0425;
    static final int MAX_PLAZAS = 100;

    String direccion;
    int plazasOcupadas;

    public ParkingVehiculo(String direccion,int plazasOcupadas) {
        this.direccion = direccion;
        this.plazasOcupadas = 0;
    }

     public ParkingVehiculo() {
        this.direccion = direccion;
        this.plazasOcupadas = 0;
    }

    

    public static double getPrecioPorMinuto() {
        return PRECIO_POR_MINUTO;
    }

    public static int getMaxPlazas() {
        return MAX_PLAZAS;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPlazasOcupadas() {
        return plazasOcupadas;
    }

    public void setPlazasOcupadas(int plazasOcupadas) {
        this.plazasOcupadas = plazasOcupadas;
    }

    public boolean hayPlaza() {
        if(this.plazasOcupadas<MAX_PLAZAS){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "ParkingVehiculo [direccion=" + direccion + ", plazasOcupadas=" + plazasOcupadas + "]";
    }

    @Override
    public void aparcaCoche(Vehiculo v1) {
        
        this.plazasOcupadas=plazasOcupadas+1;
        
    }

    @Override
    public void sacaCoche(Vehiculo v1) {
        
        this.plazasOcupadas=plazasOcupadas-1;
    }

    @Override
    public double getFactura(Vehiculo v1) {

        String fechaInicio1 = v1.getFechaInicio();
    String fechaFin1 = v1.getFechaFin();

  
    LocalDate fechaInicio2 = LocalDate.parse(fechaInicio1);
    LocalDate fechaFin2 = LocalDate.parse(fechaFin1);

  
    long dias = ChronoUnit.DAYS.between(fechaInicio2, fechaFin2);

   
    long minutos = dias * 24 * 60;

   
    double total = minutos * PRECIO_POR_MINUTO;

    return total;


    }

    



    
}
