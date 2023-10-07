import java.util.ArrayList;

public class ElectrodTest {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> array1 = new ArrayList<Electrodomestico>();

        Electrodomestico e1=new Electrodomestico("bosch", "a41", 1000, "azul", 3000, 540, 225, 1.12);
        Electrodomestico e2=new Electrodomestico("hp", "b45", 2400, "rojo", 4000, 650, 300, 2.24);
        Nevera n1=new Nevera("xiaomi", "8g", 3000, "gris", 4000, 1000, 360, 1000, 1000, 250, 60);
        Televisor t1=new Televisor("xiaomi", "9g", 5000, "negro", 1000, 800, 200, 150, 70);

        array1.add(e1);
        array1.add(e2);
        array1.add(n1);
        array1.add(t1);

        double total=0;

        for(int i=0;i<array1.size();i++){

            total+=array1.get(i).consumoAnual();
            System.out.println(array1.get(i).toString());
        }

        System.out.println("El total es "+total+" euros");



        
    }
    
}
