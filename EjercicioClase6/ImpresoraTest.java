package EjercicioClase6;

public class ImpresoraTest {

    public static void main(String[] args) {
        
        ImpresoraLaser laser1=new ImpresoraLaser(55);
        laser1.imprimir("Texto desde la imrpesora laser ");

        ImpresoraTinta tinta1=new ImpresoraTinta(20);
        tinta1.imprimir("Texto con tinta ");

        System.out.println("¿Es laser mas rapido que tinta ?"+laser1.esMasRapida(tinta1));
    }
    
}
