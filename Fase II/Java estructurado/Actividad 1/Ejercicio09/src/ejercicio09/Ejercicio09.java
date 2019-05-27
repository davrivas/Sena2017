package ejercicio09;
import java.util.Random;
import java.io.*;


public class Ejercicio09 {
    public static void main(String[] args) throws IOException {
        /* Utilizando el método RANDOM diseñe un programa (en consola) que de
         * dos números aleatorios del 1 al 6 (como los dados), de sacar dos
         * números pares (1,1 o 2,2 o 3,3 o 4,4 o 5,5 o 6,6) saldrá un mensaje
         * en pantalla que dice lanzar de nuevo, de lazar en dos ocasiones mas y
         * de nuevo en las dos ocasiones sean pares saldrá un mensaje en
         * pantalla que diga “saque una ficha”, de no sacar pares saldrá en
         * pantalla un mensaje lance de nuevo. (como en el juego parques)
         */

        Random random = new Random();
        int pares = 0, dado1, dado2;

        do {
            dado1 = random.nextInt(6) + 1;
            dibujo(dado1, 1);
            dado2 = random.nextInt(6) + 1;
            dibujo(dado2, 2);

            if (dado1 == dado2) {
                System.out.println("¡Sacó un par!");
                pares++;
            }

            if (pares == 3) {
                System.out.println("Presione enter para sacar una ficha");
                pares = 0;
            } else {
                System.out.println("Presione enter para lanzar de nuevo");
            }

            System.in.read(); // Para leer el enter

            System.out.println("");
        } while (pares != 3);
    }

    // Método para dibujar los dados
    public static void dibujo(int num, int dado) {
        System.out.println("Dado " + dado + ":");

        switch (num) {
            case 1:
                System.out.println("     ");
                System.out.println("  ●  ");
                System.out.println("     ");

                break;
            case 2:
                System.out.println("●    ");
                System.out.println("     ");
                System.out.println("    ●");
                break;
            case 3:
                System.out.println("●    ");
                System.out.println("  ●  ");
                System.out.println("    ●");
                break;
            case 4:
                System.out.println("●   ●");
                System.out.println("     ");
                System.out.println("●   ●");
                break;
            case 5:
                System.out.println("●   ●");
                System.out.println("  ●  ");
                System.out.println("●   ●");
                break;
            case 6:
                System.out.println("●   ●");
                System.out.println
        ("●   ●");
                System.out.println("●   ●");
                break;
        }
    }
}
