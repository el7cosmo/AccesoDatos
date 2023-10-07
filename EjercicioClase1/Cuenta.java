package EjercicioClase1;

public class Cuenta {

    String dni;
    String nombre;
    int numCuenta;
    int saldoCuenta;
    String IBAN;
    String tipo;

    Cuenta() {

    }

    Cuenta(int numCuenta, int saldoCuenta) {

        this.numCuenta = numCuenta;
        this.saldoCuenta = saldoCuenta;

    }

    Cuenta(String dni, String nombre, int numCuenta, int saldoCuenta) {

        this.dni = dni;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.saldoCuenta = saldoCuenta;

    }

     Cuenta(String dni, String nombre, int numCuenta, int saldoCuenta,String IBAN,String tipo) {

        

        this.dni = dni;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.saldoCuenta = saldoCuenta;
        this.IBAN=IBAN;
        this.tipo=tipo;

    }

    public String validarCuentaBancariaEspaña(Cuenta c1) {
        boolean correcto = true; // Inicializamos como true
    
        // Obtener el IBAN de la cuenta
        String iban2 = c1.getIBAN(); // Asumiendo que existe un método getIBAN() en la clase Cuenta
    
        // Verificar que todos los caracteres sean dígitos
        if (!iban2.matches("\\d+")) {
            correcto = false;
        }
    
        // Obtener el dígito de control de la cuenta (como carácter)
        char digitoControl = iban2.charAt(18);
    
        // Calcular el dígito de control esperado usando el algoritmo de módulo 11
        int[] pesos = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
        int suma = 0;
    
        for (int i = 0; i < 10; i++) {
            int digito = Integer.parseInt(iban2.substring(i, i + 1));
            suma += digito * pesos[i];
        }
    
        int resto = suma % 11;
        int digitoCalculado = (resto == 0) ? 0 : 11 - resto;
    
        // Comprobar si el dígito de control coincide con el calculado (como carácter)
        if (digitoControl != Character.forDigit(digitoCalculado, 10)) {
            correcto = false;
        }
    
        if (correcto) {
            return "El IBAN es correcto " + iban2;
        } else {
            return "El IBAN no es correcto " + iban2;
        }
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta [dni=" + dni + ", nombre=" + nombre + ", numCuenta=" + numCuenta + ", saldoCuenta=" + saldoCuenta
                + ", IBAN=" + IBAN + ", tipo=" + tipo + "]";
    }

    public void ingresarDinero(int dinero) {

        if (dinero > 6000) {
            System.out.println("No se puede ingresar tanto dinero");
        } else {
            this.saldoCuenta = saldoCuenta + dinero;
            System.out.println("El dinero ha sido ingresado de forma correcta");
        }
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getTipo() {
        return tipo;
    }

    public void sacarDinero(int dinero) {

        if (dinero > 3000) {
            System.out.println("No se puede retirar tanto dinero");
        } else if (dinero > saldoCuenta) {
            throw new RuntimeException("No hay suficiente saldo en la cuenta para retirar esta cantidad");
        } else {
            this.saldoCuenta = saldoCuenta - dinero;
            System.out.println("Ha retirado el dinero de forma correcta ");
        }

    }

    public void mostrarSaldo() {
        System.out.println("Su saldo actual es de " + this.saldoCuenta + " euros");

    }

    public void cambioTitular(Cuenta c1, String dni2, String nombre2) {

        c1.setDni(dni2);
        c1.setNombre(nombre2);

        System.out.println("Se ha cambiado el titular de la cuenta");

    }

}
