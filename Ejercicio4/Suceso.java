package Ejercicio4;

public class Suceso extends Punto3D{

     String descripcion;
     double tiempo;

     public Suceso(int x, int y, int z, String descripcion, double tiempo) {
        super(x, y, z);
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }

    public Suceso() {
       
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return super.toString()+" Suceso [descripcion=" + descripcion + ", tiempo=" + tiempo + "]";
    }

    

    
    
}
