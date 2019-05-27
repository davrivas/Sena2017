package edu.ficha1365295.escuela;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Escuela escuela = new Escuela();
        Scanner scanner = new Scanner(System.in);
        int repetir = 1;
        
        System.out.println("Bienvenido a la escuela");
        System.out.println("");
        
        while(repetir == 1) {
            String nombre = "";
            int edad = 0;
            int[] notas = new int[5];
            String[] materias = new String[5];
            
            System.out.println("Digite el nombre del alumno:");
            nombre = scanner.nextLine();
            
            System.out.println("Digite la edad del alumno:");
            edad = scanner.nextInt();
            scanner.nextLine();
            
            if (edad < 17) {
                System.out.println("La edad no puede ser inferior a 17 años.");
            } else {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Digite la materia " + (i+1) + ":");
                    materias[i] = scanner.nextLine();
                    System.out.println("Digite la nota " + (i+1) + ":");
                    notas[i] = scanner.nextInt();
                    scanner.nextLine();
                }

                escuela.registrarAlumno(nombre, edad, notas, materias);
            }
            
            System.out.println("Digite 1 para agregar un nuevo alumno");
            repetir = scanner.nextInt();
            scanner.nextLine();
        }
        
        escuela.mostrarAlumnos();
    }
}
