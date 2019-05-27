package ejercicio02y03;
import java.util.Scanner;

public class Ejercicio02y03 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();
        Factorial factorial = new Factorial();
        int opcion = 0, repetir = 1;
        
        while (repetir == 1) {
            System.out.println("Bienvenido al programa de fibonacci y factorial");
            System.out.println("");        
            System.out.println("Digite la opción de preferencia");

            do {
                System.out.println("1. Fibonacci");
                System.out.println("2. Factorial");
                opcion = lector.nextInt();

                if (opcion < 1 || opcion > 2) {
                    System.out.println(opcion + " no es válido");
                    System.out.println("Digite de nuevo la opción de preferencia");
                }
            } while (opcion < 1 || opcion > 2);

            System.out.println("");
            System.out.println("");

            switch (opcion) {
                case 1:
                    fibonacci.fibonacci();
                    break;
                case 2:
                    double num;

                    System.out.println("Bienvenido al programa del factorial");
                    System.out.println("");
                    System.out.print("Digite un número: ");
                    num = lector.nextInt();

                    if (num > 150) {
                        System.out.println("Factorial es infinito");
                    } else if (num < 0) {
                         System.out.println("No existe el factorial.");
                    } else {
                        System.out.println(num + "! = " + factorial.factorial(num));
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
}
