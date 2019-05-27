// Clase Matriz
package ejercicio09;
import java.util.Scanner;

public class Matriz {
    Scanner lector = new Scanner(System.in);
    
    public String inicialesMatriz(int j) {
        String valor = "";
        
        switch (j) {
            case 0:
                valor = "nombre";
                break;

            case 1:
                valor = "sexo";
                break;

            case 2:
                valor = "fecha de cumpleaños";
                break;

            case 3:
                valor = "estado civil";
                break;

            case 4:
                valor = "teléfono";
                break;
        }
        
        return valor;
    }
    
    public String[][] llenarMatriz(String a[][]) {
        String m[][] = new String[5][5];
        m = a;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Compañero " + (i+1) + ":");
            
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite " + inicialesMatriz(j) + ": ");
                a[i][j] = lector.nextLine();
            }
            
            System.out.println("");
        }
        
        return m;
    }
    
    public String[][] imprimirMatriz(String a[][]) {
        String m[][] = new String[5][5];
        m = a;
        
        System.out.println("");
        System.out.println("Matriz llena:");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Compañero " + (i+1)  + ":");
            
            for (int j = 0; j < 5; j++) {
                System.out.println("-" + inicialesMatriz(j) + ": " + a[i][j]);
            }
            
            System.out.println("");
        }
        
        return m;
    }
}
