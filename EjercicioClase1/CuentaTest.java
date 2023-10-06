package EjercicioClase1;

public class CuentaTest {

    public static void main(String[] args) {
        
        Cuenta c1= new Cuenta("111111111A", "Luis Antonio Figo",1234567891 , 1000);
        Cuenta c2= new Cuenta("222222222B", "Antonio Lozano", 654321555, 2000);
        Cuenta c3= new Cuenta("333333333C", "Emilio Gomez", 658546245, 500);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        c1.ingresarDinero(7000);
        c1.ingresarDinero(1000);
        c2.sacarDinero(4000);
        c2.sacarDinero(1000);

        transferencia(c1,c3,500);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    
   

   
        


    }

    private static void transferencia(Cuenta c1, Cuenta c3, int i) {

        c3.setSaldoCuenta(c3.getSaldoCuenta()+i);
        c1.setSaldoCuenta(c1.getSaldoCuenta()-i);


    }

    
    
}
