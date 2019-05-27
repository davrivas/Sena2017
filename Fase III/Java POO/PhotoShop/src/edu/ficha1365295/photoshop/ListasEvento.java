package edu.ficha1365295.photoshop;

import java.util.ArrayList;


public class ListasEvento {
    static public void datosEventos(ArrayList<Event> events, int i) {
        System.out.println("--");
        System.out.println("Evento:" + (i + 1));
        System.out.println("Nombre institucion:" + events.get(i).getInstitucion().getNombre());
        System.out.println("Tipo de institucion:" + events.get(i).getInstitucion().getTipoInstitucion());
        System.out.println("Dirección de la institucion:" + events.get(i).getInstitucion().getDireccion());
        System.out.println("Fecha:" + events.get(i).getDia() + " de diciembre");
        System.out.println("Hora:" + events.get(i).getHoraInicio());
        System.out.println("Valor total a pagar: " + valorApagar(events.get(i).getValorRegFotogradico(), events.get(i).getInstitucion().getTipoInstitucion()));
    }

    static public void ListarEventos(ArrayList<Event> events) {
        for (int i = 0; i < events.size(); i++) {
            datosEventos(events, i);
        }
    }

    static public void ListarEventosPorTipo(ArrayList<Event> events, String tipo) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getInstitucion().getTipoInstitucion().equalsIgnoreCase(tipo)) {
                datosEventos(events, i);
            } else {
                datosEventos(events, i);
            }
        }
    }

    static public void ListarEventosPorDia(ArrayList<Event> events, int dia) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getDia() == dia) {
                datosEventos(events, i);
            }
        }
    }

    static public double valorApagar(int valor, String tipo) {
        double descuento = 1;
        if (tipo.equalsIgnoreCase("colegio")) {
            descuento = 0.10;
        }
        if (tipo.equalsIgnoreCase("universidad")) {
            descuento = 0.20;
        }
        return ((valor) - ((valor) * (descuento)));
    }
    
}
