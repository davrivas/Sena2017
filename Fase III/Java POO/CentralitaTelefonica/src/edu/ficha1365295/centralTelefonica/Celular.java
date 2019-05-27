package edu.ficha1365295.centralTelefonica;

public abstract class Celular extends Llamada {
    // Se implementa el mismo constructor de Llamada
    public Celular(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    } 
}
