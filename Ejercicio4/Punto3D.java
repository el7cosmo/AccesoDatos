package Ejercicio4;

public class Punto3D extends Punto{

    int z;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Punto3D() {
       
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString()+" Punto3D [z=" + z + "]";
    }

    public double distancia(Punto3D otroPunto) {
        int dx = this.getX() - otroPunto.getX();
        int dy = this.getY() - otroPunto.getY();
        int dz = this.z - otroPunto.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Punto3D punto3D = (Punto3D) obj;
        return super.equals(obj) && z == punto3D.z;
    }
}
