package ejercicio10;
import java.util.Scanner;

public class Matrices {
    Scanner lector = new Scanner(System.in);
    String m[][] = new String[11][7];

    public String[][] iniciarMatriz(String a[][], int num) {
        m = a;
        
        if (num == 1) {
            // Asigna nombres a las columnas
            m[0][0]="ID";
            m[0][1]="Nombre";
            m[0][2]="Val/U";
            m[0][3]="Iva";
        } else if (num == 2) {
            // Asigna nombres a las columnas
            m[0][0]="Item";
            m[0][1]="ID";
            m[0][2]="Nombre P";
            m[0][3]="Cantidad";
            m[0][4]="Valor U";
            m[0][5]="IVA";
            m[0][6]="Valor T";
        }
        
        // Asigna numeros de fila
        for (int i = 1; i < 11; i++) {
                m[i][0] = Integer.toString(i);
            }

        return m;
    }

    public String[][] llenarTienda(String a[][], int col, int fila) {
        m = a;
        
        for (int i = 1; i < col; i++) {
            System.out.println("Producto " + (i) + ":");

            for (int j = 1; j < fila; j++) {
                System.out.print("Digite " + m[0][j]);
                if (j == 3) { // cuando pregunte el IVA
                    System.out.print(" (si o no)");
                }
                System.out.print(": ");
                m[i][j] = lector.nextLine();
            }

            System.out.println("");
        }

        return m;
    }

    public void mostrarMatriz(String a[][], int col, int fil, int num, 
            double tap) {
        m = a;

        for (int i = 0; i < col; i++) {
            System.out.println("");
            for (int j = 0; j < fil; j++) {
                System.out.print("\t" + (m[i][j]));
            }
        }

        if (num == 2) {
            System.out.println("");
            for (int i = 0; i < fil; i++) {
                System.out.print("\t"); // agrega tabulaciones
            }

            System.out.println("Valor total\t" + tap);
        }

        System.out.println("");
        System.out.println("");
    }
}
