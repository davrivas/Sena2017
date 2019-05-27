package edu.ficha1365295.centralTelefonica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu, repetir;
        Central central = new Central();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la Central");
        
        do {
            System.out.println("Que Operacion desea realizar");
            System.out.println("Digite 1 para Registra llamadas \n"
                    + "Digite 2 para obtener numero de llamadas \n"
                    + "Digite 3 para obtener total costo de llamadas \n"
                    + "Digite 4 para mostrar los detalles de todas las llamadas");
            menu = scanner.nextInt();
            scanner.nextLine();
            switch (menu) {
                case 1:
                    int tipo, duracion;
                    String origen, destino;
                    
                    System.out.println("Digite el origen");
                    origen = scanner.nextLine();
                    
                    System.out.println("Digite el destino");
                    destino = scanner.nextLine();
                    
                    System.out.println("Digite la duracion");
                    duracion = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Digite el tipo de llamada\n"
                            + "1- Fijo \n"
                            + "2- Celular Franja 1\n"
                            + "3- Celular Franja 2\n"
                            + "4- Celular Franja 3");
                    tipo = scanner.nextInt();
                    scanner.nextLine();
                    central.registrarLlamada(origen, destino, duracion, tipo);
                    break;
                case 2:
                    System.out.println("El número de llamadas es: " + central.getNumeroLlamadas());
                    break;
                case 3:
                    System.out.println("El total de todas las llamadas es: " + central.getTotalLlamadas());
                    break;
                case 4:
                    System.out.println("Detalles de todas las llamadas");
                    central.mostrarDetalles();
                    break;
                default:
                    System.out.println("Digite un numero valido");
                    throw new AssertionError();
            }
            System.out.println("Digite 1 para repetir el programa, "
                    + "de lo contrario otro número.");
            repetir=scanner.nextInt();
            scanner.nextLine();
        } while (repetir==1);
    }
}
