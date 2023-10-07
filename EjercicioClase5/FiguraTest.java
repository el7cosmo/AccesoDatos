package EjercicioClase5;

public class FiguraTest {

    public static void main(String[] args) {
        Rectangulo r1=new Rectangulo(10, 10);
        Circulo c1=new Circulo(2.5);
        Triangulo t1=new Triangulo(10, 10);

        Figura [] listFiguras={r1,c1,t1};

        for(int i=0;i<listFiguras.length;i++){
            
                listFiguras[i].calcularArea();
                listFiguras[i].mostrarArea();
        }


    }
    
}
