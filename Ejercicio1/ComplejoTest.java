package Ejercicio1;

public class ComplejoTest {

    public static void main(String[] args) {
        Complejo c1 = new Complejo(50, 50);
        Complejo c2 = new Complejo(80, 30);
        
        Complejo c3 = new Complejo(); 

        c3.asignar(20.0, 20.0); 

        System.out.println("La suma es " + c1.sumar(c1, c2));
        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
        c3.asignar(100, 100);
        c3.imprimir();

    }

   
    
}
