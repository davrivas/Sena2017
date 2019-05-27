// Clase Fibonacci
package ejercicio02y03;
import java.util.Scanner;

public class Fibonacci {
    public void fibonacci() {
        Scanner lector = new Scanner(System.in);
        double cant, a = -1, b = 1, c;
        
        System.out.println("Bienvenido al programa de Fibonacci");
        System.out.println("");
        System.out.print("Digite la cantidad de números de la sucesión "
                + "Fibonacci: ");
        cant = lector.nextInt();
        
        if (cant > 0) {
            for (int i=1; i<=cant; i++) {
                c = a+b;
                System.out.println(c);
                a = b;
                b = c;
            }
        } else {
            System.out.println("No es posible realizar la sucesión Fibonacci");
        }
    }
}
