package Ejercicio3.Parking;

public class ParkingTestNicolasMiszczuk {

    public static void main(String[] args) {
        
        ParkingVehiculo pv1=new ParkingVehiculo("Calle ejemplo",0);

        Vehiculo v1=new Vehiculo("11A", "2020-01-01", "2020-02-02");
        Vehiculo v2=new Vehiculo("11B", "2020-07-07", "2020-09-09");
        Vehiculo v3=new Vehiculo("11C", "2020-10-10", "2020-12-12");

        System.out.println(pv1.hayPlaza());
        
        if(pv1.hayPlaza()==true){

            pv1.aparcaCoche(v1);
            pv1.sacaCoche(v1);
            System.out.println("El precio por aparcar el coche con matricula ["+v1.getMatricula()+"] es "+pv1.getFactura(v1)+" euros ");

           

        }
        else{
            System.out.println("Ya no puedes aparcar mas vehiculos");
        }

        System.out.println(pv1.hayPlaza());
        
        if(pv1.hayPlaza()==true){

            pv1.aparcaCoche(v2);
            pv1.sacaCoche(v2);
            System.out.println("El precio por aparcar el coche con matricula ["+v2.getMatricula()+"] es "+pv1.getFactura(v2)+" euros ");

           

        }
        else{
            System.out.println("Ya no puedes aparcar mas vehiculos");
        }

        System.out.println(pv1.hayPlaza());
        
        if(pv1.hayPlaza()==true){

            pv1.aparcaCoche(v3);
            pv1.sacaCoche(v3);
            System.out.println("El precio por aparcar el coche con matricula ["+v3.getMatricula()+"] es "+pv1.getFactura(v3)+" euros ");

           

        }
        else{
            System.out.println("Ya no puedes aparcar mas vehiculos");
        }

    }
    
}
            

           