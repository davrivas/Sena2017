package ejercicio09;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        /* Diseñe un programa (en consola) que llene una matriz de 5 por 5 con 
         * los datos del 5 de sus compañeros nombre, sexo, fecha de cumpleaños, 
         * estado civil, teléfono. Luego de llenarla, la imprima organizada. 
         */
        
        Scanner lector = new Scanner(System.in);
        Matriz matriz = new Matriz();
        String companeros[][] = new String[5][5];
        int repetir = 1;
        
        while (repetir == 1) {
            System.out.println("Bienvenido a la matriz");
            System.out.println("");
            
            matriz.llenarMatriz(companeros);
            matriz.imprimirMatriz(companeros);
            
            System.out.println("");
            System.out.println("Digite 1 para repetir el programa");
            System.out.print("De lo contrario digite otro número: ");
            repetir = lector.nextInt();
            System.out.println("");
            System.out.println("");
        }
    }
}
