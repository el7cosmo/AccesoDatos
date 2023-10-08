package Ejercicio4;

public class Principal {

    public static void main(String[] args) {
        
        
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(3, 4);

      
        double distancia = p1.distancia(p2);
        System.out.println("Distancia entre p1 y p2: " + distancia);

       
        boolean sonIguales = p1.equals(p2);
        System.out.println("Los puntos p1 y p2 son iguales: " + sonIguales);

      
        Punto3D p3d1 = new Punto3D(1, 2, 3);
        Punto3D p3d2 = new Punto3D(3, 4, 5);

     
        double distancia3D = p3d1.distancia(p3d2);
        System.out.println("Distancia entre p3d1 y p3d2: " + distancia3D);

     
        boolean sonIguales3D = p3d1.equals(p3d2);
        System.out.println("Los puntos 3D p3d1 y p3d2 son iguales: " + sonIguales3D);

       
        Suceso s1 = new Suceso(1, 2, 3, "Evento 1", 5.0);
        Suceso s2 = new Suceso(3, 4, 5, "Evento 2", 10.0);

        
        boolean sonSucesosIguales = s1.equals(s2);
        System.out.println("Los sucesos s1 y s2 son iguales: " + sonSucesosIguales);
    }
    
}
