// Clase OrdenarVector
package ejercicio06;

public class OrdenarVector {
    public int[] imprimir(int a[]) {
        int v[] = new int[10];
        v = a;
        
        for (int i = 0; i < 10; i++) {
            System.out.print(v[i] + " ");
        }
        
        System.out.println("");
        
        return v;
    }
    
    public int[] burbuja(int a[]) {
        int t = 0;
        
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j+1]) {
                    t = a[j+1];
                    a[j+1] = a[j];
                    a[j] = t;
                }
            }
        }
        
        return a;
    }
}
