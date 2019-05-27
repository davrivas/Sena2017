package ejercicio06;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio06 {
    public static void main(String[] args) {
        /* Diseñe un programa (en consola) que en un vector de 10 posiciones, primero solicite al
         * usuario con un ciclo para el llenado de este, luego ordene el vector en orden ascendente y
         * luego lo imprima. (método burbuja)
         */
        
        Random random = new Random();
        Scanner lector = new Scanner(System.in);
        OrdenarVector ordenador = new OrdenarVector();
        int repetir = 1, vector[] = new int[10];
        
        while (repetir == 1) {
            System.out.println("Bienvenido al vector.");
            System.out.println("");
            
            for (int i = 0; i <= 9; i++) {
                vector[i] = random.nextInt(20) + 1; // Genera numeros aleatorios
            }
            
            ordenador.imprimir(vector); // Lo imprime en desorden
            vector = ordenador.burbuja(vector); // Ordena el vector con el metodo burbuja
            ordenador.imprimir(vector); // Lo imprime ordenado
            
            System.out.println("");
            System.out.println("Digite 1 para repetir el programa");
            System.out.print("De lo contrario digite otro número: ");
            repetir = lector.nextInt();
            System.out.println("");
            System.out.println("");
        }
    }
}
