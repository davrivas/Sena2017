package edu.ficha1365295.centralTelefonica;

public abstract class Llamada implements LlamadaI{
    private String origen;
    private String destino;
    protected int duracion;
    
    public Llamada(String origen, String destino, int duracion) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
    }
        
    @Override
    public String getOrigen(){
        return origen;
    }
    
    @Override
    public String getDestino(){
        return destino;
    }

    @Override
    public int getDuracion() {
        return duracion;
    }
    
}
