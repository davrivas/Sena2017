//Clase Guayabita
package ejercicio08;
import java.util.Scanner;
import java.util.Random;

public class Guayabita {
    Scanner lector = new Scanner(System.in);
    Random random = new Random();
    int dado = 0;

    public String[] llenarNombres(int cant) {
        String[] nombres = new String[cant];

        for (int i = 0; i <= (cant-1); i++) {
            System.out.print("Por favor ingrese el nombre del usuario " + 
                    (i+1) + ": ");
            nombres[i] = lector.nextLine();
        }

        System.out.println("");
        return nombres;
    }

    public int lanzarDado() {
        dado = random.nextInt(6) + 1;
        return dado;
    }
}
