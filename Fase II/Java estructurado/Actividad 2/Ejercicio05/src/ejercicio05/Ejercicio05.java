package ejercicio05;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        /* Diseñe un programa (en consola) que solicite un número a luego un 
         * número b, luego le pregunte al usuario que si desea la serie par o
         * impar, el programa mostrara la serie seleccionada desde el número 
         * menor de los ingresados, hasta el número mayor de los ingresados.
         */
        
        Scanner lector = new Scanner(System.in);
        Operacion opera = new Operacion();
        int a, b, menor, mayor, serie = 0, repetir = 1;
        boolean pi;
        
        while (repetir == 1) {
            System.out.println("Bienvenido al programa de los pares e impares.");
            System.out.println("");
            
            System.out.print("Ingrese el primer número: ");
            a = lector.nextInt();
            
            System.out.print("Ingrese el segundo número: ");
            b = lector.nextInt();
            
            System.out.println("Su numero menor es " + opera.menor(a, b));
            System.out.println("Su numero mayor es " + opera.mayor(a, b));
            
            menor = opera.menor(a, b);
            mayor = opera.mayor(a, b);
            
            pi = opera.poi(menor);
            
            
            System.out.println("");
            System.out.println("Para la serie par digite 1, para impar otro "
                    + "número");
            serie = lector.nextInt();
            
            System.out.println("");
            
            if (serie == 1) {
                if (pi) {
                    for (int i = menor+1; i <  mayor; i+=2) {
                        System.out.print(i + " ");
                    }
                } else {
                     for (int i = menor; i <  mayor; i+=2) {
                        System.out.print(i + " ");
                    }
                }
            } else {
                 if (pi) {
                    for (int i = menor; i <  mayor; i+=2) {
                        System.out.print(i + "  ");
                    }
                } else {
                     for (int i = menor+1; i <  mayor; i+=2) {
                        System.out.print(i + " ");
                    }
                }	
            }
            
            System.out.println("");
            System.out.println("");
            System.out.println("Digite 1 para repetir el programa");
            System.out.print("De lo contrario digite otro número: ");
            repetir = lector.nextInt();
            System.out.println("");
            System.out.println("");
        }
    }
}
