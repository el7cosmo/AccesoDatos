public class Televisor extends Electrodomestico{

    int resolucion;

    public Televisor(){

        this.resolucion=0;
    }

    public Televisor(String marca,String modelo,int precio, String color,int potencia,int horas,int dias,double precioEnergia,int resolucion){

        super(marca,modelo,precio,color,potencia,horas,dias,precioEnergia);
        this.resolucion=resolucion;
        
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return super.toString()+ " Televisor [resolucion=" + resolucion + "]";
    }

    public double consumoAnual(){

        double resultado=0;

        if(this.resolucion>50){
                
            resultado=((this.precioEnergia*this.dias)+30);
        }
        else{
             resultado=(this.precioEnergia*this.dias);
        }


        return resultado;


    }

    

    
    
}
