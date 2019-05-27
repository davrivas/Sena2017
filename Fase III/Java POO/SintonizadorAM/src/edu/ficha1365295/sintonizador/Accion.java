package edu.ficha1365295.sintonizador;

public class Accion {
    public int setFrecuencia(int frecuencia) {
        if (frecuencia < 540) { // Si el valor de frecuencia es menor que 540
            frecuencia = 1600; // Frecuencia pasa al otro extremo
        } else if (frecuencia > 1600) { // Si el valor de frecuencia es mayor que 540
            frecuencia = 540; // Frecuencia pasa al otro extremo
        }
        
        return frecuencia; // Se retorna el valor de la variable frecuencia
    }
}
