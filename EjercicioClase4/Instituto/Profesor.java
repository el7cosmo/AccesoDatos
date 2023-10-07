package EjercicioClase4.Instituto;

public class Profesor extends Persona{
    
     String materia;

    public Profesor(String nombre, int edad, String aulaAsignada, String materia) {
        super(nombre, edad, aulaAsignada);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString()+" Profesor [materia=" + materia + "]";
    }



    
}
