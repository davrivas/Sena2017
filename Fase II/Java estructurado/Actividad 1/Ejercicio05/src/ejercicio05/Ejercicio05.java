package ejercicio05;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        /* Diseñe un programa ( en consola ) que muestre un menú.
         * Para amarillo 1
         * Para azul 2
         * Para rojo 3
         * Luego solicite al usuario digitar dos de estos números para descifrar
         * la combinación.
         * Ejemplo: 1, 3 resultado mostrado en pantalla “su combinación da 
         * naranja “
         * Recuerde que el usuario puede colocar el mismo número dos veces y
         * números fuera del rango. 
         */

        Scanner lector = new Scanner(System.in);
        int color1 = 0, color2 = 0;
        int repetir = 1;

        while (repetir == 1) {
            System.out.println("Bienvenido al programa de los colores.");
            System.out.println("");
            System.out.println("Para amarillo digite 1");
            System.out.println("Para azul digite 2");
            System.out.println("Para rojo digite 3");
            System.out.println("");

            // Llamo el metodo escogerColor para solicitar colores y definirlos
            color1 = escogerColor(color1, 1);
            color2 = escogerColor(color2, 2);

            if (color1 == color2) {      
                System.out.println("Ambos colores son iguales.");
            } else if (color1==1 && color2==2 || color1==2 && color2==1) {
                System.out.println("Su combinación da verde.");
            } else if (color1==1 && color2==3 || color1==3 && color2==1) {
                System.out.println("Su combinación da naranja.");
            } else {
                System.out.println("Su combinación da morado.");
            }

            System.out.println("");
            System.out.println("Digite 1 para repetir el programa");
            System.out.print("De lo contrario digite otro número: ");
            repetir = lector.nextInt();
            System.out.println("");
            System.out.println("");
        }
    }
    
    // Este metodo es para solicitar el color y definirlo
    public static int escogerColor(int color, int numero) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Digite el valor del color " + numero + ": ");

        do {
            color = lector.nextByte();

            switch (color) {
                case 1:
                    System.out.println("Usted escogió el color amarillo.");
                    break;                    
                case 2:
                    System.out.println("Usted escogió el color azul.");
                    break;                    
                case 3:
                    System.out.println("Usted escogió el color rojo.");
                    break;                    
                default:
                    System.out.println(color + " no es un valor válido para el "
                        + "color " + numero + ".");
                    System.out.print("Digite de nuevo el valor del color " + 
                            numero + ": ");
                    break;
            }
        } while (color < 1 || color > 3);
        
        System.out.println("");
        
        return color;
    }
}
