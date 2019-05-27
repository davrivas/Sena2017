package edu.ficha1365295.institucion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Institucion institucion = new Institucion();
        Scanner scanner = new Scanner(System.in);
        int repetir = 1, menu = 0;
        
        System.out.println("Bienvenido a la institución.\n\n");
        
        while (repetir == 1) {
            do {
                System.out.println(
                    "Digite la actividad que quiera realizar:\n" +
                    "1 Para agregar un nuevo alumno.\n" +
                    "2 Para mostrar alumnos registrados."
                );
                menu = scanner.nextInt();
                scanner.nextLine();
                
                if (menu < 1 || menu > 2) {
                    System.out.println("¡Opción inválida!");
                }
            } while (menu < 1 || menu > 2);
            
            switch (menu) {
                case 1:
                    int grado = 0, indice = 0;
                    String nombres, apellidos;
                    int[] notas = new int[3];
                    String[] asignaturas = new String[3];

                    System.out.println("Digite los nombres del alumno:");
                    nombres = scanner.nextLine();

                    System.out.println("Digite los apellidos del alumno:");
                    apellidos = scanner.nextLine();
                    
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Digite la asignatura " + (i+1) + ":");
                        asignaturas[i] = scanner.nextLine();
                        System.out.println("Digite la nota " + (i+1) + ":");
                        notas[i] = scanner.nextInt();
                        scanner.nextLine();
                    }

                    do {
                        System.out.println(
                            "Digite el tipo de grado:\n" +
                            "1 Pregrado.\n" +
                            "2 Posgrado."
                        );
                        grado = scanner.nextInt();

                        if (grado < 1 || grado > 2) {
                            System.out.println("¡Opción inválida!");
                        }

                        scanner.nextLine();
                    } while (grado < 1 || grado > 2);

                    institucion.registrarAlumno(nombres, apellidos, asignaturas, notas, grado);
                    break;
                case 2:
                    institucion.mostrarAlumnos();
                    break;
            }

            System.out.println("Digite 1 para repetir el programa, "
                    + "de lo contrario otro número:");
            repetir = scanner.nextInt();
            scanner.nextLine();
            System.out.println("");
        }
    }
}
