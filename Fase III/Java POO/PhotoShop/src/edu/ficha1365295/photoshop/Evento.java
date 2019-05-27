package edu.ficha1365295.photoshop;

public class Evento {

    //guarda la informacion textual, 
    private int base = 100000;
    private int valorRegFotogradico;
    private int dia;
    private int horaInicio;
    private Institucion institucion;

  
    public int getBase() {
        return base;
    }


    public void setBase(int base) {
        this.base = base;
    }


    public int getValorRegFotogradico() {
        return valorRegFotogradico;
    }


    public void setValorRegFotogradico(int valorRegFotogradico) {
        this.valorRegFotogradico = valorRegFotogradico;
    }


    public int getDia() {
        return dia;
    }


    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int getHoraInicio() {
        return horaInicio;
    }
    
    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Institucion getInstitucion() {
        return institucion;
    }


    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

}
