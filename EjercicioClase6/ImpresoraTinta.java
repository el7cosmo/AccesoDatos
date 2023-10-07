package EjercicioClase6;

public class ImpresoraTinta implements Impresora{

    int velocidad;

    public ImpresoraTinta() {
        this.velocidad = velocidad;
    }

    public ImpresoraTinta(int velocidad) {
        this.velocidad = velocidad;
    }

    public void imprimir(String texto) {
      
        System.out.println("Imprimiendo documento (Tinta): " + texto);
    }

 
    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return "ImpresoraTinta [velocidad=" + velocidad + "]";
    }

    
    
}
