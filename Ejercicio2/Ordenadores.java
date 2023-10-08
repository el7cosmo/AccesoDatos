package Ejercicio2;

public class Ordenadores {

    String codigo;
    int ram;
    String cpu;
    double precio;

    public Ordenadores(){
        this.codigo=codigo;
        this.ram=ram;
        this.cpu=cpu;
        this.precio=precio;
    }

     public Ordenadores(String codigo,int ram,String cpu,double precio){
        this.codigo=codigo;
        this.ram=ram;
        this.cpu=cpu;
        this.precio=precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenadores [codigo=" + codigo + ", ram=" + ram + ", cpu=" + cpu + ", precio=" + precio + "]";
    }

    

    
}
