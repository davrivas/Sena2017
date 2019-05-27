package edu.ficha1365295.accesorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operacion {
    Scanner scanner = new Scanner(System.in);
    
    public List<Integer> llenarElementos() {
        List<Integer> accesorios = new ArrayList<Integer>();
        int repetir = 0, accesorio = 0, indice = 1;
        
        do {
            System.out.println(
                "Digite el valor del elemento " + indice + ":");
            accesorio = scanner.nextInt();
            scanner.nextLine();
            accesorios.add(accesorio);
            indice++;
            
            System.out.println("Para agregar otro valor digite 1, "
                    + "de lo contrario otro número.");
            repetir = scanner.nextInt();
        } while(repetir == 1);
        
        System.out.println("");
        
        return accesorios;
    }
    
    public void imprimirFor(List<Integer> accesorios) {
        System.out.println("Elementos impresos con ciclo for:");
        
        for (int i = 0; i < accesorios.size(); i++) {
            System.out.println("Elemento " + (i+1) + ": " + accesorios.get(i));
        }
        
        System.out.println("");
    }
    
    public void imprimirIterado(List<Integer> accesorios) {
        int indice = 1;
        System.out.println("Elementos impresos con iterado:");
        
        for (int a: accesorios) {
            System.out.println("Elemento " + indice + ": " + a);
            indice++;
        }
        
        System.out.println("");
    }
    
    public void cargarNumero(List<Integer> accesorios) {
        int i = 0;
        System.out.println("Digite la posición en la que quiere cargar "
                + "algún elemento de la lista:");
        i = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("");
        System.out.println("Posición " + (i) + ": " + accesorios.get(i-1));
    }
    
    public void imprimirParesImpares(List<Integer> accesorios) {
        ParesImpares pI = new ParesImpares();
        int imprimir = 0;
        
        do {
            System.out.println(
                "Digite 1 si quiere imprimir los impares de la lista\n" +
                "Digite 2 si quiere imprimir los pares de la lista"
            );
            imprimir = scanner.nextInt();
            scanner.nextLine();
            
            if (imprimir < 1 || imprimir > 2) {
                System.out.println("ERROR: Opción inválida.");
            }
        } while (imprimir < 1 || imprimir > 2);
        
        pI.paresImpares(accesorios, imprimir);
    }
}
