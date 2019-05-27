// Clase Factorial
package ejercicio02y03;

public class Factorial {
    public double factorial(double num) {
        double fact = 1;
        
        if (num > 0) {
            fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
        }
        
        return fact;
    }
}
