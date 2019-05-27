package ejercicio02;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /* Diseñe un programa (en consola) que por teclado solicite dos números
         * y los reste, como resultado debe mostrar en pantalla” la resta de su
         * numero A menos su numero B es resultado”.
         */
        
        Scanner lector = new Scanner(System.in);
        double num1, num2, resta;
        int repetir = 1;
        
        while (repetir == 1) {
            System.out.println("Binvenido a la resta.");
            System.out.println("");

            System.out.print("Digite el primer valor: ");
            num1 = lector.nextDouble();

            System.out.print("Digite el segundo valor: ");
            num2 = lector.nextDouble();

            resta = num1 - num2;

            System.out.println("La resta de su numero A (" + num1 + ") menos su"
                    + "bnúmero B (" + num2 + ") es " + resta);

            System.out.println("");
            System.out.println("Digite 1 para repetir el programa");
            System.out.print("De lo contrario digite otro número: ");
            repetir = lector.nextInt();
            System.out.println("");
            System.out.println("");
        }
    }
}
