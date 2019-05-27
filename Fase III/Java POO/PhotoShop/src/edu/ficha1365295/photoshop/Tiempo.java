package edu.ficha1365295.photoshop;

public class Tiempo {
    public boolean[] setDias(boolean[] dias) {
        // Hago que todos los días sea falsos o vacíos
        for (boolean setDia: dias) {
            setDia = false;
        }
        
        return dias;
    }
    
    public static boolean revisarDias(boolean[] dias) {
        // Reviso si todos los días están ocupados
        for(boolean b: dias) if(!b) return false;
        return true;
    }
    
    public static boolean diasVacios(boolean[] dias) {
        // Reviso si todos los días están ocupados
        for(boolean b: dias) if(b) return true;
        return false;
    }
}
