package EjercicioClase4.Instituto;

import java.util.ArrayList;

public class InstitutoTest {
    public static void main(String[] args) {
        
       
          String nombreProfesor1 = "Roberto";
          String nombreProfesor2 = "Juan";
          String nombreAlumno1 = "Alumno1";
          String nombreAlumno2 = "Alumno2";
  
         
          if (!Constantes.profesorExiste(nombreProfesor1)) {
              throw new IllegalArgumentException("El profesor " + nombreProfesor1 + " no existe en la lista de profesores disponibles.");
          }
  
          if (!Constantes.profesorExiste(nombreProfesor2)) {
              throw new IllegalArgumentException("El profesor " + nombreProfesor2 + " no existe en la lista de profesores disponibles.");
          }
  
       
          if (!Constantes.alumnoExiste(nombreAlumno1)) {
              throw new IllegalArgumentException("El alumno " + nombreAlumno1 + " no existe en la lista de alumnos disponibles.");
          }
  
          if (!Constantes.alumnoExiste(nombreAlumno2)) {
              throw new IllegalArgumentException("El alumno " + nombreAlumno2 + " no existe en la lista de alumnos disponibles.");
          }
  
       
          Profesor profesor1 = new Profesor(nombreProfesor1, 35, "2.6", "Programación");
          Profesor profesor2 = new Profesor(nombreProfesor2, 40, "2.7", "Base de datos");
          Alumno alumno1 = new Alumno(nombreAlumno1, 18, "2.6", 8);
          Alumno alumno2 = new Alumno(nombreAlumno2, 19, "2.6", 7);
  
        
          ArrayList<Profesor> profesoresAula1 = new ArrayList<Profesor>();
          ArrayList<Alumno> alumnosAula1 = new ArrayList<Alumno>();
  
          ArrayList<Profesor> profesoresAula2 = new ArrayList<Profesor>();
          ArrayList<Alumno> alumnosAula2 = new ArrayList<Alumno>();
  
          profesoresAula1.add(profesor1);
          alumnosAula1.add(alumno1);
          profesoresAula2.add(profesor2);
          alumnosAula2.add(alumno2);
  
          Aula aula1 = new Aula("2.6", profesoresAula1, alumnosAula1);
          Aula aula2 = new Aula("2.7", profesoresAula2, alumnosAula2);
          
    
    }
    
}
