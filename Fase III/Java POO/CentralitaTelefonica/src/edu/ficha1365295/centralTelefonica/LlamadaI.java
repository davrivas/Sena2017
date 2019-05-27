package edu.ficha1365295.centralTelefonica;

public interface LlamadaI {
    double calcularCostoLlamada(); // metodo abstracto
    String getOrigen();
    String getDestino();
    int getDuracion();
}
