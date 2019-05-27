package ejercicio01;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /* Diseñe un programa (en consola) que permita hacer las operaciones
         * suma, resta, multiplicación, división, potencia y porcentaje, con un
         * menú utilizando el switch.
         */
        
        Scanner lector = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        double a = 0, b = 0, res = 0;
        int opcion, repetir = 1;
        
        while (repetir == 1) {
            System.out.println("Bienvenido a la calculadora");
            System.out.println("");

            do {
                System.out.println("Digite la operación que va a realizar");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Potenciación");
                System.out.println("6. Porcentaje");
                opcion = lector.nextInt();

                if (opcion < 1 || opcion > 6) {
                    System.out.println(opcion + " no es una opción válida");
                }
            } while (opcion < 1 || opcion > 6);

            System.out.println("");

            switch (opcion) {
                case 1:
                    // Método sin retorno ni parámetros
                    calculadora.suma();
                    break;
                case 2:
                    // Método con retorno pero sin parámetros
                    System.out.println("La resta da " + calculadora.resta());
                    break;
                case 3:
                    // No hay método
                    System.out.println("Bienvenido a la multiplicación");

                    System.out.print("Digite valor 1: ");
                    a = lector.nextInt();
                    System.out.print("Digite valor 2: ");
                    b = lector.nextInt();
                    res = a*b;

                    System.out.println("La multiplicación da " + res);
                    break;
                case 4:
                    // Método con parámetros pero sin retorno
                    System.out.println("Bienvenido a la división");

                    System.out.print("Digite numerador: ");
                    a = lector.nextInt();
                    System.out.print("Digite denominador: ");
                    b = lector.nextInt();

                    calculadora.division(a, b);
                    break;
                case 5:
                    // Método con parámetros y retorno
                    System.out.println("Bienvenido a la potenciación");

                    System.out.print("Digite valor base: ");
                    a = lector.nextInt();
                    System.out.print("Digite valor exponente: ");
                    b = lector.nextInt();

                    System.out.println("La potenciación da " + 
                            calculadora.potencia(a, b));
                    break;
                case 6:
                    // Método con parámetros pero sin retorno
                    System.out.println("Bienvenido al porcentaje");

                    System.out.print("Digite valor 1: ");
                    a = lector.nextInt();
                    System.out.print("Digite valor 2: ");
                    b = lector.nextInt();

                    calculadora.porcentaje(a, b);
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
}
