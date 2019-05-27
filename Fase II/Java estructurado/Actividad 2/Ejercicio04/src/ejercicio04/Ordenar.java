//Clase Ordenar
package ejercicio04;

public class Ordenar {
    int temp = 0;
    public int[] ordenarNumeros(int a[], int orden) {
        int num[] = new int[3];
        num = a;
        
        if (orden == 1) {
            for (int j = 0; j <= 1; j++) {
                for (int i = 0; i <= 1; i++) {
                    if (num[i] > num[i+1]) {
                        temp = num[i+1];
                        num[i+1] = num[i];
                        num[i] = temp;
                    }
                }
            }
        } else {
            for (int j = 0; j <= 1; j++) {
                for (int i = 0; i <= 1; i++) {
                    if (num[i] < num[i+1]) {
                        temp = num[i+1];
                        num[i+1] = num[i];
                        num[i] = temp;
                    }
                }
            }
        }

        return num;
    }
}
