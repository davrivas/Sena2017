package edu.ficha1365295.institucion;

public class Alumno {
    private String nombres;
    private String apellidos;
    private String[] asignaturas = new String[3];
    private int[] notas = new int[3];
    private int grado;
    
    public Alumno(String nombres, String apellidos, String[] asignaturas, int[] notas, int grado) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.asignaturas = asignaturas;
        this.notas = notas;
        this.grado = grado;
    }
    
    public String getNombres() {
        return nombres;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public int[] getNotas() {
        return notas;
    }
    
    public int getGrado() {
        return grado;
    }
    
    public double getPromedio(int[] notas) {
        double promedio = 0;
        int acumulado = 0;
        
        for (int nota: notas) {
            acumulado += nota;
        }
        
        promedio = acumulado / 3;
        
        return promedio;
    }
    
    public double getDescuento(int[] notas) {
        double descuento = 0, promedio = getPromedio(notas);
        
        switch (getGrado()) {
            case 1: // Pregrado
                if (promedio >= 4.5) {
                    descuento = 0.25;
                } else if (promedio >= 4.0 && promedio < 4.5) {
                    descuento = 0.1;
                } else if (promedio >= 3.5 && promedio < 4) {
                    descuento = 0; // No tendrá descuento
                } else if (promedio >= 2.5 && promedio < 3.5) {
                    descuento = 0; // No tendrá descuento
                }
                break;
            case 2: // Posgrado
                if (promedio >= 4.5) {
                    descuento = 0.2;
                } else if (promedio < 4.5) {
                    descuento = 0; // No tendrá descuento
                }
                break;
        }

        return descuento;
    }
    
    public int getCreditos(int[] notas) {
        int creditos = 0;
        double promedio = getPromedio(notas);
        
            switch (getGrado()) {
                case 1: // Pregrado
                    if (promedio >= 4.5) {
                        creditos = 28;
                    } else if (promedio >= 4.0 && promedio < 4.5) {
                        creditos = 25;
                    } else if (promedio >= 3.5 && promedio < 4) {
                        creditos = 20;
                    } else if (promedio >= 2.5 && promedio < 3.5) {
                       creditos = 15;
                    }
                    break;
                case 2: // Posgrado
                    if (promedio >= 4.5) {
                         creditos = 20;
                    } else if (promedio < 4.5) {
                        creditos = 10;
                    }
                    break;
            }
        
        return creditos;
    }
    
    public double getValorMatricula(int[] notas) {
        double valorMatricula = 0;
        int valorPorCredito = 0;
        
        switch (getGrado()) {
            case 1: // Pregrado
                valorPorCredito = 40000;
                break;
            case 2: // Posgrado
                valorPorCredito = 200000;
                break;
        }
        
        valorMatricula = valorPorCredito * getCreditos(notas);
        valorMatricula = valorMatricula - (valorMatricula * getDescuento(notas));
        
        return valorMatricula;
    }
}
