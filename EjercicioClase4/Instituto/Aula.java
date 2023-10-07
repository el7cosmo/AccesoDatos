package EjercicioClase4.Instituto;

import java.util.ArrayList;
import java.util.Arrays;

public class Aula {

      String nombre;
     ArrayList<Profesor> profesores;
    ArrayList<Alumno> alumnos;
    ArrayList<String> materias;

    public Aula(String nombre, ArrayList<Profesor> profesores, ArrayList<Alumno> alumnos) {
        this.nombre = nombre;
        this.profesores = profesores;
        this.alumnos = alumnos;
        this.materias = new ArrayList<String>();

       
        for (Profesor profesor : profesores) {
            if (Arrays.asList(Constantes.AULAS_DISPONIBLES).contains(profesor.getAulaAsignada())) {
                materias.add(profesor.getMateria());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Aula [nombre=" + nombre + ", profesores=" + profesores + ", alumnos=" + alumnos + ", materias="
                + materias + "]";
    }

    
}
