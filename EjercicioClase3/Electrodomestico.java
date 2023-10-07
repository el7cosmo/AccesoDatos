public class Electrodomestico{
   
    String marca;
    String modelo;
    int precio;
    String color;
    int potencia;
    int horas;
    int dias;
    double precioEnergia;

    public Electrodomestico(String marca,String modelo,int precio, String color,int potencia,int horas,int dias,double precioEnergia){

        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
        this.color=color;
        this.potencia=potencia;
        this.horas=horas;
        this.dias=dias;
        this.precioEnergia=precioEnergia;
    }

 
    public Electrodomestico(){

        this.marca="bosch";
        this.modelo="7200";
        this.precio=400;
        this.color="gris";
        this.potencia=2300;
        this.horas=1;
        this.dias=3;
        this.precioEnergia=0.40397;
    }

    public Electrodomestico(String marca,String modelo,int precio){

        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
        
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getPrecio() {
        return precio;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public int getPotencia() {
        return potencia;
    }


    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }


    public int getHoras() {
        return horas;
    }


    public void setHoras(int horas) {
        this.horas = horas;
    }


    public int getDias() {
        return dias;
    }


    public void setDias(int dias) {
        this.dias = dias;
    }


    public double getPrecioEnergia() {
        return precioEnergia;
    }


    public void setPrecioEnergia(double precioEnergia) {
        this.precioEnergia = precioEnergia;
    }


    @Override
    public String toString() {
        return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color
                + ", potencia=" + potencia + ", horas=" + horas + ", dias=" + dias + ", precioEnergia=" + precioEnergia
                + "]";
    }

    public double consumoAnual(){

        double resultado=0;
        int dias1=this.dias;
        double precioEnergia1=this.precioEnergia;
        resultado=(dias1*precioEnergia1);


        return resultado;


    }




}