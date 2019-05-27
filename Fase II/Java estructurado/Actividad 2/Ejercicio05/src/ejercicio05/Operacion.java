// Clase Operacion
package ejercicio05;

public class Operacion {
    public int menor(int a, int b) {
        int men = 0;
        
        if (a < b) {
            men = a;
        } else {
            men = b;
        }
        
        return men;
    }
    
    public int mayor(int a, int b) {
        int may = 0;
        
        if (a > b) {
            may = a;
        } else {
            may = b;
        }
        
        return may;
    }
    
    public boolean poi(int men) {
        boolean pi = true;

        if (men % 2 == 0) {
            pi = false;
        } else {
            pi = true;
        }

        return pi;
    }
}
