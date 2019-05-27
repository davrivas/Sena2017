package edu.ficha1365295.centralTelefonica;

import java.util.ArrayList;
import java.util.List;

public class Central {
    private List<LlamadaI> llamadas;
    
    public Central() {
        llamadas = new ArrayList<>(); // Se instancia la lista
        
    }
    
    public void registrarLlamada(String origen, String destino, int duracion, int tipo) {
        LlamadaI llamada = null; // Se declara el objeto
        String tipoLlamada = "";
        
        switch (tipo) {
            case 1:
                // Se instancia
                llamada = new Fijo(origen, destino, duracion);
                tipoLlamada = "fijo";
                break;

            case 2:
                llamada = new Franja1(origen, destino, duracion);
                tipoLlamada = "celular franja 1";
                break;

            case 3:
                llamada = new Franja2(origen, destino, duracion);
                tipoLlamada = "celular franja 2";
                break;

            case 4:
                llamada = new Franja3(origen, destino, duracion);
                tipoLlamada = "celular franja 3";
                break;
            
            default:
                System.out.println("Digite un numero valido");
                break;
        }

        if (tipo >= 1 || tipo <= 4) {
            llamadas.add(llamada);
            System.out.println("La llamada fue registrada.");
            System.out.println("El origen fue: " + origen);
            System.out.println("El destino fue: " + destino);
            System.out.println("La duración fue: " + duracion);
            System.out.println("El costo fue: $" + llamada.calcularCostoLlamada());
            System.out.println("El tipo de llamada fue: " + tipoLlamada);
        }
    }
    public int getNumeroLlamadas(){
        return llamadas.size();
    }
    public double getTotalLlamadas(){
        double totalLlamadas = 0;
        
        for (int i = 0; i < llamadas.size(); i++) {
            totalLlamadas += llamadas.get(i).calcularCostoLlamada();
        }
        return totalLlamadas;
    }
    public void mostrarDetalles() {
        for (int i = 0; i < llamadas.size(); i++) {
            System.out.println("Llamada "+ (i+1) + ":");
            System.out.println("Duracion: " + llamadas.get(i).getDuracion() +"\n"
                    + "Origen: "+ llamadas.get(i).getOrigen() + "\n"
                    + "Destino: " + llamadas.get(i).getDestino() + "\n"
                    + "Costo: " + llamadas.get(i).calcularCostoLlamada());
            System.out.println("");
        }
    }
    
}
