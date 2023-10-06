package EjercicioClase2;

import java.util.Random;

public class Persona {

    String nombre;
    int edad;
    String DNI;
    final String sexo;
    int peso;
    int altura;

         public Persona(){

        this.nombre="";
        this.edad=0;
        this.DNI="";
        this.sexo="Hombre";
        this.peso=0;
        this.altura=0;
   
    }

     public Persona(String nombre, int edad,String DNI,String sexo,int peso,int altura){

        this.nombre=nombre;
        this.edad=edad;
        this.DNI=DNI;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
   
    }

     public Persona(String nombre, int edad,String sexo){

        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;

        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
                + ", altura=" + altura + "]";
    }

    public void calcularIMC() {
        
        double alturaMetros = this.altura / 100.0;

        
        double imc = this.peso / (alturaMetros * alturaMetros);

        System.out.println("El IMC es: " + imc);
    }

    public void validaDNI() {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        // Comprobar si el DNI tiene la longitud correcta
        if (DNI.length() != 9) {
            System.out.println("El DNI no es válido: longitud incorrecta.");
            return;
        }
        
        // Extraer el número y la letra del DNI
        String numeroDNI = DNI.substring(0, 8);
        char letraDNI = DNI.charAt(8);
        
        // Comprobar si el número del DNI es un número válido
        try {
            int numero = Integer.parseInt(numeroDNI);
        } catch (NumberFormatException e) {
            System.out.println("El DNI no es válido: formato incorrecto.");
            return;
        }
        
        // Calcular la letra esperada del DNI
        int numeroDNIInt = Integer.parseInt(numeroDNI);
        int indiceLetraEsperada = numeroDNIInt % 23;
        char letraEsperada = letras.charAt(indiceLetraEsperada);
        
        // Comparar la letra esperada con la letra del DNI
        if (letraDNI == letraEsperada) {
            System.out.println("El DNI es válido.");
        } else {
            System.out.println("El DNI no es válido: la letra no coincide.");
        }
    }

     public void generarDNI() {
        Random rand = new Random();
        
        // Generar un número de DNI aleatorio entre 10000000 y 99999999
        int numeroDNI = rand.nextInt(90000000) + 10000000;
        
        // Calcular la letra del DNI
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indiceLetra = numeroDNI % 23;
        char letraDNI = letras.charAt(indiceLetra);
        
        // Formatear el DNI completo
        String DNICompleto = String.valueOf(numeroDNI) + letraDNI;
        
        // Asignar el DNI generado a la propiedad DNI de la persona
        this.DNI = DNICompleto;
        
        // Mostrar el DNI generado en la consola
        System.out.println("DNI generado: " + DNICompleto);
    }
    

    
}
