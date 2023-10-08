package Ejercicio4;

public class Punto {

    int x;
    int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }

    public double distancia(Punto otroPunto) {
        int dx = this.x - otroPunto.x;
        int dy = this.y - otroPunto.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Punto punto = (Punto) obj;
        return x == punto.x && y == punto.y;
    }

    
    
}
