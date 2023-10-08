package Ejercicio2;

public class Sobremesa  extends Ordenadores{

    String descripcion;

    public Sobremesa(String codigo,int ram,String cpu,double precio,String descripcion){
        super(codigo, ram, cpu, precio);
        this.descripcion=descripcion;
    }

     public Sobremesa(){
        this.descripcion=descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return  super.toString()+ " Sobremesa [descripcion=" + descripcion + "]";
    }

    public String getCaracterísiticas(){

        return  super.toString()+ " Sobremesa [descripcion=" + descripcion + "]";
        
    }

    
    
}
