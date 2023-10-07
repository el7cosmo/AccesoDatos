package EjercicioClase4.Instituto;

import java.util.Arrays;

public class Constantes {

    public static final String[] AULAS_DISPONIBLES = {"2.6", "2.7", "B3", "B5"};
    public static final String[] PROFESORES_DISPONIBLES = {"Roberto", "Juan", "Álvaro", "David", "Miguel"};
    public static final String[] ALUMNOS_DISPONIBLES = {"Alumno1", "Alumno2", "Alumno3", "Alumno4", "Alumno5", "Alumno6", "Alumno7", "Alumno8", "Alumno9", "Alumno10"};
    public static final String[] MATERIAS_DISPONIBLES = {"Base de datos", "Programación", "Lenguaje de Marcas", "Aplicaciones Web", "Montaje y mantenimiento", "Ofimática"};
    public static final int MAX_ESTUDIANTES_POR_AULA = 30;


   public static boolean alumnoExiste(String nombreAlumno) {
        return Arrays.asList(ALUMNOS_DISPONIBLES).contains(nombreAlumno);
    }

    public static boolean profesorExiste(String nombreProfesor) {
        return Arrays.asList(PROFESORES_DISPONIBLES).contains(nombreProfesor);
    }

    
}
