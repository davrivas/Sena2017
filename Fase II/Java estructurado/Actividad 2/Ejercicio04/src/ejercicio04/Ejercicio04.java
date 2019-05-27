package ejercicio04;
import java.util.Scanner;

public class Ejercicio04 {
     public static void main(String[] args) {
        /* Diseñe un programa (en consola) que solicite 3 números por teclado y 
         * saque los números ordenados ascendente o descendente según lo decida 
         * el usuario. 
         */
        
         Scanner lector = new Scanner(System.in);
         Ordenar orden = new Ordenar();
         int num[] = new int[3], repetir = 1, ordenar = 0, temp;
         
         while (repetir == 1) {
             System.out.println("Bienvenido al programa de ordenar números.");
             System.out.println("");
             
            System.out.print("Digite el primer valor: ");
            num[0] = lector.nextInt();
            
            System.out.print("Digite el segundo valor: ");

            do {
               num[1] = lector.nextInt();
               
               if (num[1] == num[0]) {
                   System.out.println(num[1] + " es un valor repetido.");
                   System.out.print("Digite de nuevo el segundo valor: ");
               }
            } while (num[1] == num[0]); // Para que no se repitan valores

            System.out.print("Digite el tercer valor: ");
            
            do {
                num[2] = lector.nextInt();
                
                if (num[2] == num[0] || num[2] == num[1]) {
                    System.out.println(num[2] + " es un valor repetido.");
                   System.out.print("Digite de nuevo el tercer valor: ");
                }
            } while (num[2] == num[0] || num[2] == num[1]); // No repetir
            
            
             System.out.println("Escoga la forma en que la quiera que se "
                     + "organicen los números:");
            
             do {
                System.out.println("1. Forma ascendente");
                System.out.println("2. Forma descendente");
                ordenar = lector.nextInt();
                
                if  (ordenar < 1 || ordenar > 2) {
                    System.out.println(ordenar + " no es una opción válida.");
                    System.out.println("Escoga de nuevo la forma en que la "
                            + "quiera que se organicen los números:");
                }
             } while (ordenar < 1 || ordenar > 2);
             
             switch (ordenar) {
                 case 1:
                     System.out.println("Números ordenados ascendentemente:");
                     num = orden.ordenarNumeros(num, ordenar);
                     break;
                case 2:
                    System.out.println("Números ordenados descendentemente:"); 
                    num = orden.ordenarNumeros(num, ordenar);
             }
             
             for (int i = 0; i <= 2; i++) {
                 System.out.print(num[i] + " ");
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
