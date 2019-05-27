package edu.ficha1365295.accesorio;

import java.util.List;

public class ParesImpares {
    public void paresImpares(List<Integer> accesorios, int imprimir) {
        switch (imprimir) {
            case 1:
                for (int i = 0; i < accesorios.size(); i++) {
                    if (accesorios.get(i) % 2 != 0) {
                        System.out.println(
                            "Elemento " + (i+1) + ": " + accesorios.get(i)
                        );
                    }
                }
                break;
            case 2:
                for (int i = 0; i < accesorios.size(); i++) {
                    if (accesorios.get(i) % 2 == 0) {
                        System.out.println(
                            "Elemento " + (i+1) + ": " + accesorios.get(i)
                        );
                    }
                }
                break;
        }
            
    }
}
