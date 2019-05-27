package ejercicio07;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        
        /* Diseñe un programa (en consola) que solicite por teclado el nombre de
         * un artículo, su valor de unidad, cantidad a llevar, y si es o no de
         * la canasta familiar, como resultado debe mostrar el total del valor
         * de los productos a llevar y si no son de la canasta familiar se le
         * sume el IVA 16%.
         */
        
        Scanner lector = new Scanner(System.in);
        double valor, cantidad, total, totalMasIVA;
        String articulo, canasta;
        int repetir = 1;
        
        while (repetir == 1) {
            System.out.println("Bienvenido al programa del mercado");        
            System.out.println("");

            System.out.print("Digite el nombre del artículo: ");
            articulo = lector.nextLine();

            System.out.print("Digite el valor de unidad ($): ");
            valor = lector.nextDouble();

            System.out.print("Digite la cantidad a llevar: ");
            cantidad = lector.nextDouble();

            System.out.print("¿Es de la canasta familiar? ");
            canasta = lector.next();

            System.out.println("");
            System.out.println("");

            total = valor * cantidad;
            System.out.println("Valor total de " + articulo + ": $" + total);

            // Se verifica que la respuesta sea escrita sin importar cómo
            
            if (canasta.equals("no") || canasta.equals("No") || 
                    canasta.equals("NO")) {
                totalMasIVA = total + (total * 0.16);

                System.out.println("El producto NO es de la canasta familiar.");
                System.out.println("Su total mas IVA es: $" + totalMasIVA);
            } else if (canasta.equals("si") || canasta.equals("Si") || 
                    canasta.equals("SI")) {
                System.out.println("El producto es de la canasta familiar.");
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