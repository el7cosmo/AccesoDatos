package Ejercicio2;

public class OrdenadorTestNicolasMiszczuk {

    public static void main(String[] args) {
        Sobremesa s1=new Sobremesa("S001", 8, "Rayzen 5 1600x", 1000, "Ordenador para trabajar en casa ");
        Sobremesa s2=new Sobremesa("S002", 16, "Rayzen 5 2600x", 2000, "Ordenador para trabajar en la oficina ");

        Portatil p1=new Portatil("P001", 8, " Intel Core i3", 500, 3.5);
        Portatil p2=new Portatil("P002", 16, " Intel Core i5", 1500, 5.5);

      

        System.out.println(s1.getCaracterísiticas());
        System.out.println(s2.getCaracterísiticas());
        System.out.println(p1.getCaracterísiticas());
        System.out.println(p2.getCaracterísiticas());

        System.out.println();

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
