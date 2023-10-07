package EjercicioClase4.Instituto;

public class Alumno extends Persona{
    
     int nota;

    public Alumno(String nombre, int edad, String aulaAsignada, int nota) {
        super(nombre, edad, aulaAsignada);
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return super.toString()+" Alumno [nota=" + nota + "]";
    }

    
}
