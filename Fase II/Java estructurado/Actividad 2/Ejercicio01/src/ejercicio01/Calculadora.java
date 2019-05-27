//Clase Calculadora
package ejercicio01;
import java.util.Scanner;

public class Calculadora {
    Scanner lector = new Scanner(System.in);
    double a = 0, b = 0, res = 0; // dejarlas por si acaso
    
    public void suma() {
        System.out.println("Bienvenido a la suma");
        
        System.out.print("Digite valor 1: ");
        a = lector.nextInt();
        System.out.print("Digite valor 2: ");
        b = lector.nextInt();
        res = a+b;
        
        System.out.println("La suma da " + res);
    }
    
    public double resta() {
        System.out.println("Bienvenido a la resta");
        
        System.out.print("Digite valor 1: ");
        a = lector.nextInt();
        System.out.print("Digite valor 2: ");
        b = lector.nextInt();
        res = a-b;
        
        return res;
    }
    
    public void division(double a, double b) {
        if (b==0) {
            System.out.println("ERROR: división sobre 0");
        } else {
            res = a/b;
            System.out.println("La división da " + res);
        }
    }
    
    public double potencia(double a, double b) {
        res = Math.pow(a, b);
        return res;
    }
    
    public void porcentaje(double a, double b) {
        res = (a*b)/100;
        System.out.println("El porcentaje es " + res);
    }
}
