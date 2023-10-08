package Ejercicio1;

public class Complejo {

    double dPReal;
    double dPImag;

    public Complejo(){

        this.dPReal=dPReal;
        this.dPImag=dPImag;
    }

    public Complejo(double dPReal,double dPImag){
        
        this.dPReal=dPReal;
        this.dPImag=dPImag;
    }

    public double getdPReal() {
        return dPReal;
    }

    public void setdPReal(double dPReal) {
        this.dPReal = dPReal;
    }

    public double getdPImag() {
        return dPImag;
    }

    public void setdPImag(double dPImag) {
        this.dPImag = dPImag;
    }

    @Override
    public String toString() {
        return "Complejo [dPReal=" + dPReal + ", dPImag=" + dPImag + "]";
    }

    public void asignar(double dPReal2,double dPImag2){
       
        setdPReal(dPReal2);
        setdPImag(dPImag2);
        

    }

    public Complejo sumar(Complejo c1, Complejo c2) {
        double dPReal2 = c1.getdPReal() + c2.getdPReal();
        double dPImag2 = c1.getdPImag() + c2.getdPImag();
        return new Complejo(dPReal2, dPImag2);
    }

    public void imprimir() {

        System.out.println(toString());
    }


    
}
