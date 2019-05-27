// Clase Vector
package ejercicio07;

import java.util.Scanner;

public class Vector {

    Scanner lector = new Scanner(System.in);

    public int[] llenarVector(int x, int a[]) {
        int v[] = new int[x];
        v = a;
        for (int i = 0; i < x; i++) {
            System.out.print("Digite valor " + (i+1) + ": ");
            a[i] = lector.nextInt();
        }

        return v;
    }

    public int[] burbuja(int a[], int opc) {
        int t = 0;

        if (opc == 1) {
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        t = a[j + 1];
                        a[j + 1] = a[j];
                        a[j] = t;
                    }
                }
            }
        } else {
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[j] < a[j + 1]) {
                        t = a[j + 1];
                        a[j + 1] = a[j];
                        a[j] = t;
                    }
                }
            }
        }

        return a;
    }
    
    public int[] imprimir(int a[]) {
        int v[] = new int[10];
        v = a;
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(v[i] + " ");
        }
        
        System.out.println("");
        
        return v;
    }
}
