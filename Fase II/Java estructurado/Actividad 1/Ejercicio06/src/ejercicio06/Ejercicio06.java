package ejercicio06;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        /* Diseñe un programa (en consola) que encuentre el área y perímetro de
         * un rectángulo o un círculo mostrando un menú para que seleccione,
         * cuadrado o circulo luego pida los datos necesarios para das solución
         * y muestre en pantalla el nombre de la figura su área en unidades
         * cuadradas y su perímetro en unidades simples, recuerde que no existen
         * áreas o perímetros menores o iguales a cero. 
         */
        
        Scanner lector = new Scanner(System.in);
        int opcion;
        double b, h, r, p, a;
        int repetir = 1;

        while (repetir == 1) {
            System.out.println("Bienvenido al programa del rectángulo y "
                    + "círculo");
            System.out.println("");
            
            System.out.println("Seleccione la figura:");

            do {
                System.out.println("1. Rectángulo");
                System.out.println("2. Círculo");
                opcion = lector.nextInt();

                if (opcion < 1 || opcion > 2) {
                    System.out.println(opcion + " no es un valor válido.");
                    System.out.println("Seleccione de nuevo la figura:");
                }
            } while (opcion < 1 || opcion > 2);

            System.out.println("");
            
            switch (opcion) {
                case 1:
                    System.out.println("Usted escogió rectángulo.");
                    System.out.print("Digite la base (en metros): ");
                    b = lector.nextInt();
                    System.out.print("Digite la altura (en metros): ");
                    h = lector.nextInt();

                    a = b * h;
                    p = 2 * (b + h);

                    if (a <= 0 || p <= 0) {
                        System.out.println("ERROR:");
                        System.out.println("No existen áreas menores o iguales "
                                + "a cero.");
                        System.out.println("No existen perímetros menores o "
                                + "iguales a cero.");
                    } else {
                        System.out.println("Nombre de la figura: Rectángulo");
                        System.out.println("-Area: " + a + "m^2");
                        System.out.println("-Perímetro: " + p + "m");
                    }

                    break;

                case 2:
                    System.out.println("Usted escogió círculo.");
                    System.out.print("Digite el radio (en metros): ");
                    r = lector.nextInt();

                    a = Math.PI * Math.pow(r, 2);
                    p = 2 * (Math.PI * r);

                    if (a <= 0 || p <= 0) {
                        System.out.println("ERROR:");
                        System.out.println("No existen áreas menores o iguales"
                                + " a cero.");
                        System.out.println("No existen perímetros menores o "
                                + "iguales a cero.");
                    } else {
                        System.out.println("Nombre de la figura: Circulo");
                        System.out.println("-Area: " + a + "m^2");
                        System.out.println("-Perímetro: " + p + "m");
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
