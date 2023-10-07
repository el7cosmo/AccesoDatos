package EjercicioClase5;

public class Circulo extends Figura{

    double radio;


    public Circulo(){

        this.radio=radio;
    }

    public Circulo(double radio){

        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

    public void calcularArea() {
        total = (this.radio*this.radio)*Math.PI;
        System.out.println(total);

    }
}
