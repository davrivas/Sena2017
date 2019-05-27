package ejercicio08;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio08 {
    public static void main(String[] args) {
        /* Utilizando el método RANDOM diseñe un programa (en consola) que de
         * números aleatorios desde 0 hasta el número que ingrese el usuario por
         * teclado.
         */

        Scanner lector = new Scanner(System.in);
        Random random = new Random(); // Se crea un objeto de la clase Random
        int repetir = 1, numero, azar;
        
        while (repetir == 1) {
            System.out.println("Bienvenido al programa de los números "
                    + "aleatorios");
            System.out.println("");

            System.out.print("Digite un número: ");
            numero = lector.nextInt();

            if (numero > 0) {
                // Se define el número aleatorio
                azar = random.nextInt(numero);
                System.out.println("Su número aleatorio es: " + azar);
            } else {
                System.out.println("ERROR: el número debe de ser igual o menor"
                        + " a 0.");
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
