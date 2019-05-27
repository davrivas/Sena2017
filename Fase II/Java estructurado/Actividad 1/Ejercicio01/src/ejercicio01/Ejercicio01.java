package ejercicio01;
import java.util.Scanner;

public class Ejercicio01 {    
    public static void main(String[] args) {        
        /* Diseñe un programa (en consola) que por teclado solicite dos números
         * y los sume, como resultado debe mostrar en pantalla” la suma de su
         * número A más su número B es resultado”.
         */
        
        Scanner lector = new Scanner(System.in);
        double num1, num2, suma;
        int repetir = 1;
        
        while (repetir == 1) {
            System.out.println("Binvenido a la suma.");
            System.out.println("");

            System.out.print("Digite el primer valor: ");
            num1 = lector.nextDouble();

            System.out.print("Digite el segundo valor: ");
            num2 = lector.nextDouble();

            suma = num1 + num2;

            System.out.println("La suma de su numero A (" + num1 + ") más su "
                    + "número B (" + num2 + ") es " + suma);

            System.out.println("");
            System.out.println("Digite 1 para repetir el programa");
            System.out.print("De lo contrario digite otro número: ");
            repetir = lector.nextInt();
            System.out.println("");
            System.out.println("");
        }
    }
}
