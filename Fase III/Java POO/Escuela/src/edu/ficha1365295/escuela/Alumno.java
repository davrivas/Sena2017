package edu.ficha1365295.escuela;

public class Alumno {
    private  String nombre;
    private  int edad;
    private int[] notas = new int[5];
    private String[] materias = new String[5];
    
    public Alumno(String nombre, int edad, int[] notas, String[] materias) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = notas;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int[] getNotas() {
        return notas;
    }

    public int getPromedio(int[] notas) {
        int promedio = 0, acumulado = 0;
        
        for (int nota: notas) {
            acumulado += nota;
        }
        
        promedio = acumulado / 5;

        return promedio;
    }

    public int getNotaAlta(int[] notas) {
        int notaAlta = Integer.MIN_VALUE; // Minimo valor de tipo int
        
        for (int nota: notas) {
            if (nota > notaAlta) {
                notaAlta = nota;
            }
        }
        
        return notaAlta;
    }

    public int getNotaBaja(int[] notas) {
        int notaBaja = Integer.MAX_VALUE; // Maximo valor de tipo int
        
        for (int nota: notas) {
            if (nota < notaBaja) {
                notaBaja = nota;
            }
        }
        
        return notaBaja;
    }

    public boolean getAprueba(int[] notas) {
        boolean aprueba = true; // Se asume que el alumno aprobó
        
        if (getPromedio(notas) < 4) {
            aprueba = false; // Si el promedio es menor que 4 no aprueba
        }
        
        return aprueba;
    }
}
