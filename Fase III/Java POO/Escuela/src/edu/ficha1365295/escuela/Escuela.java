package edu.ficha1365295.escuela;

import java.util.ArrayList;
import java.util.List;

public class Escuela {
    private List<Alumno> alumnos;
    
    public Escuela() {
        alumnos = new ArrayList<>();
    }
    
    public void registrarAlumno(String nombre, int edad, int[] notas, String[] materias) {
        Alumno alumno = new Alumno(nombre, edad, notas, materias);
        
        alumnos.add(alumno);
        
        System.out.println(
            "El promedio es: " + alumno.getPromedio(notas) + "\n" +
            "La nota más alta es: " + alumno.getNotaAlta(notas) + "\n" +
            "La nota más baja es: " + alumno.getNotaBaja(notas)
        );
        
        if (alumno.getAprueba(notas) == false) {
            System.out.println("El alumno " + nombre +" reprobó.");
        }
    }
    
    public void mostrarAlumnos() {
        int[] notas = new int[5];
        
        System.out.println("\n\nLista de alumnos:\n");
        
        for(int i = 0; i < alumnos.size(); i++) {
            notas = alumnos.get(i).getNotas();
            
            System.out.println(
                "Alumno " + (i+1) + ":\n" +
                "Nombre: " + alumnos.get(i).getNombre() + "\n" +
                "Edad: " + alumnos.get(i).getEdad() + "\n" +
                "Promedio: "  + alumnos.get(i).getPromedio(notas) + "\n" +
                "Nota alta: " + alumnos.get(i).getNotaAlta(notas) + "\n" +
                "Nota baja: " + alumnos.get(i).getNotaBaja(notas)
            );
            
            if (alumnos.get(i).getAprueba(notas) == true) {
                System.out.println("El alumno aprobó.");
            } else {
                System.out.println("El alumno reprobó.");
            }
            
            System.out.println("");
        }
    }
}
