package edu.ficha1365295.adivinanza;

import java.util.Random;
import javax.swing.JOptionPane;

public class Accion {
    Random random = new Random();
    
    public String obtenerDatos(String txtFrame) {
        String dato = txtFrame;
        return dato;
    }
    
    public int generarNumero(int numero) {
        numero = random.nextInt(100) + 10;
        return numero;
    }
    
    public void mostrarMensaje(int mensaje) {
        switch (mensaje) {
            case 1: // Cuando no se escribieron los datos
                JOptionPane.showMessageDialog(
                    null,
                    "Escriba los datos",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
                break;
            
            case 2: // Cuando no escribió un número entre 10 y 100
                JOptionPane.showMessageDialog(
                    null,
                    "Debe digitar un número entre 10 y 100.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
                break;
            
            case 3: // Cuando el jugador ya no quiere jugar más
                JOptionPane.showMessageDialog(
                    null,
                    "Gracias por jugar.",
                    "",
                    JOptionPane.NO_OPTION
                );
                break;
        }
    }
    
    public void bienvenida(String nombre, String apellido) {
        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre + " " +
                apellido + ".", "Bienvenido", JOptionPane.DEFAULT_OPTION);
    }
    
    public String ingresarNumero(int indice) {
        String numero, digite = "Digite un número entre 10 y 100.\nLe queda";
        
        if (indice == 5) {
            numero = JOptionPane.showInputDialog(null, digite + " 1 intento.");
        } else {
            numero = JOptionPane.showInputDialog(null, digite + "n " + 
                    (6-indice) + " intentos.");
        }
        
        return numero;
    }
    
    public int convertirAInt(String numeroInt) {
        int numero = Integer.parseInt(numeroInt);
        return numero;
    }
    
    public void mostrarMensajeNumero(int respuesta, int numero) {
        if (respuesta == numero) {
            JOptionPane.showMessageDialog(null, "¡Es el número!",
                "Acertaste", JOptionPane.INFORMATION_MESSAGE);
        } else if (respuesta < numero) {
            JOptionPane.showMessageDialog(null, "Muy bajo.",
                "No es el número", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Muy alto.",
                "No es el número", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void mostrarGanar(boolean ganar, int intentos, String nombre, 
            String apellido, int numero) {
        if (ganar == true) { // Si ganó
                JOptionPane.showMessageDialog(
                    null,
                        
                    "Ha ganado en " +
                    intentos + " intento(s)\n"
                    + "Sus datos básicos son:\n"
                    + "Nombre: " + nombre + "\n"
                    + "Apellidos: " + apellido,
                    
                    "Victoria",
                    JOptionPane.INFORMATION_MESSAGE
                );
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Ha perdido.\n" +
                "El número era " + numero,
                "Derrota",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
    
    public int repetir(int repetir) {
        repetir = JOptionPane.showConfirmDialog(null, "¿Desea jugar de nuevo?",
                    "Repetir juego", repetir);
        return repetir;
    }
}
