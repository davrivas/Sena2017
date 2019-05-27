package ejercicio07;
import java.util.Scanner;

public class Ejercicio07 {
   public static void main(String[] args) {
        /* Diseñe un programa (en consola) que en un vector de x posiciones, (x 
         * lo define el usuario) primero solicite al usuario con un ciclo para 
         * el llenado de este, luego ordene el vector en orden ascendente o 
         * descendente según lo decida el usuario y luego lo imprima. (método
         * burbuja, arreglo dinámico).
         */
        
        Scanner lector = new Scanner(System.in);
        Vector v = new Vector();
        int repetir = 1, x, ordenar;
        
        while (repetir == 1) {
            System.out.println("Bienvenido al vector de x posiciones");
            System.out.println("");
            
            System.out.print("Digite la cantidad de posiciones: ");
            
            do {
                x = lector.nextInt();
                
                if (x < 2) {
                    System.out.println(x + " no es un valor válido.");
                    System.out.print("Digite de nuevo la cantidad de "
                            + "posiciones: ");
                }
            } while (x < 2);
            
            int vector[] = new int[x];
            
            v.llenarVector(x, vector);
            
            System.out.println("");
            System.out.print("Digite 1 para ordenar el vector ascendentemente,"
                    + " sino otro número: ");
            ordenar = lector.nextInt();
            v.burbuja(vector, ordenar);
            v.imprimir(vector);

            System.out.println("");
            System.out.println("Digite 1 para repetir el programa");
            System.out.print("De lo contrario digite otro número: ");
            repetir = lector.nextInt();
            System.out.println("");
            System.out.println("");
        }
    }
}
