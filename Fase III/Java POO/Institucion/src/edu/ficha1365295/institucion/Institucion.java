package edu.ficha1365295.institucion;

import java.util.ArrayList;
import java.util.List;

public class Institucion {
    private List<Alumno> alumnos;
    
    public Institucion() {
        alumnos = new ArrayList<>();
    }
    
    public void registrarAlumno(String nombres, String apellidos, String[] asignaturas, int[] notas, int grado) {
        Alumno alumno = new Alumno(nombres, apellidos, asignaturas, notas, grado);

        if (alumno.getGrado() == 1 && alumno.getPromedio(notas) < 2.5) {
            System.out.println("El alumno no pudo matricularse.");
        } else {
            alumnos.add(alumno);
            System.out.println(
                "Nombres: " + nombres + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "Número de créditos que registra: " + alumno.getCreditos(notas) + "\n" +
                "Valor a pagar: $" + alumno.getValorMatricula(notas) + "\n"
            );
        }
    }
    
    public void mostrarAlumnos() {
        int[] notas = new int[5];
        
        System.out.println("\n\nAlumnos registrados\n");
        
        for (int i = 0; i < alumnos.size(); i++) {
            notas = alumnos.get(i).getNotas();
            System.out.println(
                "Nombres: " + alumnos.get(i).getNombres() + "\n" +
                "Apellidos: " + alumnos.get(i).getApellidos() + "\n" +
                "Número de créditos que registra: " + alumnos.get(i).getCreditos(notas) + "\n" +
                "Valor a pagar: $" + alumnos.get(i).getValorMatricula(notas) + "\n"
            );
        }
    }
}
