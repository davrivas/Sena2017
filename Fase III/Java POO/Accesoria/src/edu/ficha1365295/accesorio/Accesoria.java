package edu.ficha1365295.accesorio;

import java.util.ArrayList;
import java.util.List;

public class Accesoria {
    public static void main(String[] args) {
        Operacion op = new Operacion();
        List<Integer> accesorios = new ArrayList<Integer>();
        
        accesorios = op.llenarElementos();
        System.out.println("");
        op.imprimirFor(accesorios);
        System.out.println("");
        op.imprimirIterado(accesorios);
        System.out.println("");
        op.cargarNumero(accesorios);
        System.out.println("");
        op.imprimirParesImpares(accesorios);
    }
}
