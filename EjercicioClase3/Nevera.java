public class Nevera extends Electrodomestico{

    int capacidadFrigorífico;
    int capacidadCongelador;
    int sonoridad;

    public Nevera(int capacidadFrigorífico, int capacidadCongelador,int sonoridad){

        this.capacidadFrigorífico=0;
        this.capacidadCongelador=0;
        this.sonoridad=0;
        
    }

    public Nevera(String marca,String modelo,int precio, String color,int potencia,int horas,int dias,double precioEnergia,int capacidadFrigorífico, int capacidadCongelador,int sonoridad){

        super(marca,modelo,precio,color,potencia,horas,dias,precioEnergia);
        this.capacidadFrigorífico=capacidadFrigorífico;
        this.capacidadCongelador=capacidadCongelador;
        this.sonoridad=sonoridad;
        
    }

    public int getCapacidadFrigorífico() {
        return capacidadFrigorífico;
    }

    public void setCapacidadFrigorífico(int capacidadFrigorífico) {
        this.capacidadFrigorífico = capacidadFrigorífico;
    }

    public int getCapacidadCongelador() {
        return capacidadCongelador;
    }

    public void setCapacidadCongelador(int capacidadCongelador) {
        this.capacidadCongelador = capacidadCongelador;
    }

    public int getSonoridad() {
        return sonoridad;
    }

    public void setSonoridad(int sonoridad) {
        this.sonoridad = sonoridad;
    }

    @Override
    public String toString() {
        return  super.toString()+" Nevera [capacidadFrigorífico=" + capacidadFrigorífico + ", capacidadCongelador=" + capacidadCongelador
                + ", sonoridad=" + sonoridad + "]";
    }

    public double consumoAnual(){

        double resultado=0;

        if(this.capacidadFrigorífico>300 || this.capacidadCongelador>200){
                
            resultado=((this.precioEnergia*this.dias)+50);
        }
        else{
             resultado=(this.precioEnergia*this.dias);
        }


        return resultado;


    }

    


    
}
