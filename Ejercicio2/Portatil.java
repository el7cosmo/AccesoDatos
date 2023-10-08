package Ejercicio2;

public class Portatil extends Ordenadores{

    double peso;

    public Portatil(String codigo,int ram,String cpu,double precio,double peso){
        super(codigo, ram, cpu, precio);
        this.peso=peso;
    }

    public Portatil(){
        
        this.peso=peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString()+ " Portatil [peso=" + peso + "]";
    }

    public String getCaracterísiticas(){

        return super.toString()+ " Portatil [peso=" + peso + "]";
        
    }
    
    
}
