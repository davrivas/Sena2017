package edu.ficha1365295.centralTelefonica;

public class Franja3 extends Celular {
    private final static int VAL_MIN = 100;
    
    // Se implementa el mismo constructor de Celular
    public Franja3(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }
    
    @Override // Sobre escribir
    public double calcularCostoLlamada() {
        return duracion * VAL_MIN;
    }
}
