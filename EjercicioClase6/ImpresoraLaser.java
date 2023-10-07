package EjercicioClase6;

public class ImpresoraLaser implements Impresora{

     int velocidad;

     public ImpresoraLaser() {
        this.velocidad = velocidad;
    }

    public ImpresoraLaser(int velocidad) {
        this.velocidad = velocidad;
    }

     public int getVelocidad() {
        return velocidad;
    }

    

    @Override
    public String toString() {
        return "ImpresoraLaser [velocidad=" + velocidad + "]";
    }

   
    public void imprimir(String texto) {
      
        System.out.println("Imprimiendo documento (Láser): " + texto);
    }

    public String esMasRapida(ImpresoraTinta tinta1) {
       
        
        int laser=this.velocidad;
        int tinta=tinta1.getVelocidad();

        if(laser>tinta){
            
            return "Es mas rapido el laser "+laser;
           
        }
        else{
            
            return "Es mas rapido la tinta "+tinta;
        }
    }

   

   
   
    
}
