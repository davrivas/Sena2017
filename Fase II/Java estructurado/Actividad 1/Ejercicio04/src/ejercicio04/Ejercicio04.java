package ejercicio04;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /* Diseñe un programa (en consola) que por teclado solicite dos números
         * y los divida, como resultado debe mostrar en pantalla” la división
         * de su numero A sobre su numero B es resultado” si el num dos el
         * denominador es cero debe salir las palabras “Error división por 0”.
         */
        
        Scanner lector = new Scanner(System.in);
        double numerador, denominador, division;
        int repetir = 1;
        
        while (repetir == 1) {
            System.out.println("Binvenido a la división.");
            System.out.println("");

            System.out.print("Digite el numerador: ");
            numerador = lector.nextDouble();

            System.out.print("Digite el denominador: ");
            denominador = lector.nextDouble();

            if (denominador == 0) {
                System.out.println("Error división por 0");
            } else {
                division = numerador / denominador;
                System.out.println("La división de su numero A (" + numerador +
                        ") sobre su número B (" + denominador + ") es " +
                        division);
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
