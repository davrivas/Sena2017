package ejercicio03;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /* Diseñe un programa (en consola) que por teclado solicite dos números
         * y los multiplique, como resultado debe mostrar en pantalla” la
         * multiplicacion de su numero A por su numero B es resultado”.
         * 
         */
        Scanner lector = new Scanner(System.in);
        double num1, num2, multiplicacion;
        int repetir = 1;
        
        while (repetir == 1) {
            System.out.println("Binvenido a la multiplicación.");
            System.out.println("");
        
            System.out.print("Digite el primer valor: ");
            num1 = lector.nextDouble();
        
            System.out.print("Digite el segundo valor: ");
            num2 = lector.nextDouble();
        
            multiplicacion = num1 * num2;
        
            System.out.println("La multiplicación de su numero A (" + num1 + ")"
                    + " por su número B (" + num2 + ") es " + multiplicacion);
            
            System.out.println("");
            System.out.println("Digite 1 para repetir el programa");
            System.out.print("De lo contrario digite otro número: ");
            repetir = lector.nextInt();
            System.out.println("");
            System.out.println("");
        }
    }
}
