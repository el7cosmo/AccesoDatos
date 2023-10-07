package EjercicioClase2;

import java.util.Scanner;

public class PersonaTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cont=0;
        Persona [] array1=new Persona[10];
        System.out.println("Introduce un nombre");
        String nombre=sc.nextLine();
        System.out.println("Introduce una edad");
        int edad=sc.nextInt();
        System.out.println("Introduce tu genero");
        String sexo=sc.nextLine();
        System.out.println("Introduzca su peso");
        int peso=sc.nextInt();
        System.out.println("Introduzca su altura");
        int altura=sc.nextInt();

        Persona p1=new Persona(nombre,edad,"12345678A",sexo,peso,altura);

        
            array1[cont]=p1;
            cont++;
        

        Persona p2=new Persona("Antonio Ruiz", 22, "Hombre");
         array1[cont]=p2;
            cont++;
        Persona p3=new Persona();
        p3.setNombre("luis garcia");
        p3.setEdad(40);
        p3.setDNI("98765432B");
        p3.setPeso(100);
        p3.setAltura(100);
        array1[cont]=p3;
        cont++;

        System.out.println();
        p1.validaDNI();
        p3.validaDNI();
         System.out.println();
        for(int i=0;i<array1.length;i++){
            if(array1[i]!=null){
                 System.out.println(array1[i].toString());
            }
           
        }

a

         


    }
    
}
