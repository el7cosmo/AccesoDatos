package EjercicioClase5;

public class Triangulo extends Figura{

    int base;
    int altura;

    public Triangulo(){

        this.base=base;
        this.altura=altura;
    }

    public Triangulo(int base,int altura){

        this.base=base;
        this.altura=altura;
    }

    


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + "]";
    }

     public void calcularArea() {
        total = (this.base*this.altura)/2;
        System.out.println(total);

        
    }

    
    
}
