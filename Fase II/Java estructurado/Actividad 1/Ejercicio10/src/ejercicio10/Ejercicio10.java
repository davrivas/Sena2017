package ejercicio10;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /* Diseñe un programa (en consola) que encuentre el tipo de triangulo
         * que se tiene, mostrando un menú que pida si se ingresaran ángulos o
         * lados y se dé la opción para escoger uno de los dos. Si se selecciona
         * por ángulos la suma de los 3 ángulos debe ser 180° y si se selecciona
         * por lados, la suma de los dos lados más cortos debe ser mayor a la
         * longitud del lado más largo, para que sean un triángulo. Y mostrar en
         * pantalla su triangulo es (equilátero o isósceles, o escaleno) o
         * (rectángulo o acutángulo u obtusángulo).
         */

        Scanner lector = new Scanner(System.in);
        int opcion = 0, repetir = 1;
        double v1 = 0, v2 = 0, v3 = 0, largo = 0;

        while (repetir == 1) {
            System.out.println("Bienvenido al programa de los triangulos.");
            System.out.println("");
            System.out.println("Digite la opción de su preferencia:");

            do {
                System.out.println("1 Para ángulos");
                System.out.println("2 Para lados");
                opcion = lector.nextInt();

                if (opcion < 1 || opcion > 2) {
                    System.out.println(opcion + " no es una opción válida.");
                    System.out.println("Digite de nuevo la opción de su "
                            + "preferencia:");
                }
            } while (opcion < 1 || opcion > 2);

            System.out.println("");

            switch (opcion) {
                case 1:
                    System.out.println("Usted escogió ángulos.");
                    v1 = anguloLado(v1, 1, "ángulo");
                    v2 = anguloLado(v2, 2, "ángulo");
                    v3 = anguloLado(v3, 3, "ángulo");

                    // Si la suma de todos los angulos es igual a 180
                    if (v1 + v2 + v3 == 180) {
                        // Halla el ángulo más largo
                        largo = largo(largo, v1, v2, v3);

                        // Comprobamos el ángulo más largo
                        if (largo == 90) { // Si es igual a 90°
                            System.out.println("Su triangulo es rectángulo");
                        } else if (largo < 90) { // Si es menor a 90°
                            System.out.println("Su triangulo es acutángulo.");
                        } else { // Si es mayor a 90°
                            System.out.println("Su triangulo es obtusángulo");
                        }
                    } else {
                        System.out.println("ERROR: la sumatoria de todos los "
                                + "ángulos debe de ser 180.");
                    }
                    break;
                case 2:
                    System.out.println("Usted escogió lados.");
                    v1 = anguloLado(v1, 1, "lado");
                    v2 = anguloLado(v2, 2, "lado");
                    v3 = anguloLado(v3, 3, "lado");

                    // Se comprueba el lado más largo
                    largo = largo(largo, v1, v2, v3);

                    /* Si la suma de los dos lados más cortos es mayor a la
                     * longitud del lado más largo
                     */
                    
                    if (largo < v1+v2 || largo < v1+v3 || largo < v2+v3) {
                        if (v1==v2&&v1!=v3 || v1==v3&&v1!=v2 || v2==v3&&v2!=v1) {
                            // Si dos de sus lados son iguales
                            System.out.println("Su triangulo es isósceles.");
                        } else if (v1!=v2 && v1!=v3 && v2!=v3) {
                            // Si todos los lados son diferentes
                            System.out.println("Su triangulo es escaleno.");
                        } else { // Si todos los lados son iguales
                            System.out.println("Su triangulo es equilatero.");
                        }
                    } else {
                        System.out.println("ERROR: no es un triangulo.");
                    }
                    break;
            }
            
            System.out.println("");
            System.out.println("Digite 1 para repetir el programa");
            System.out.print("De lo contrario digite otro número: ");
            repetir = lector.nextInt();
            System.out.println("");
            System.out.println("");
        }

              
    }
    
    // Para evitar lineas de código al solicitar angulos o lados
    public static double anguloLado(double dato, int num, String tipoDato) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Digite el " + tipoDato + " " + num + ": ");
        dato = lector.nextInt();
        
        return dato;
    }
    
    // Para comprobar el lado o ángulo más largo
    public static double largo(double largo, double x, double y, double z) {
        /* Se pone como ángulo o lado más largo la variable v3 para luego 
         * comprobarla con  v1 y v2
         */
        largo = z;

        // Luego se comprueba cual es el ángulo o lado mas largo
        if (largo < x) {
            z = largo;
            largo = x;
            x = z;
        }

        if (largo < y) {
            z = largo;
            largo = y;
            y = z;
        }
        
        return largo;
    }
}
