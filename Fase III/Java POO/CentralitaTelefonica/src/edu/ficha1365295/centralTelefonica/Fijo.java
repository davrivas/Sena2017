package edu.ficha1365295.centralTelefonica;

public class Fijo extends Llamada {
    private final static int VAL_MIN = 200; // Constante abstracta
    
    // Se implementa el mismo constructor de Llamada
    public Fijo(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    } 
            
    @Override // Sobre escribir  metodo 
    public double calcularCostoLlamada() {
        return duracion * VAL_MIN;
    }
}
