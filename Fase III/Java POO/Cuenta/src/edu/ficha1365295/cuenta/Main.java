package edu.ficha1365295.cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        int numeroCuenta = 100001;
        long documento;
        int opcion, repetir;
        do {
            System.out.println("Bienvenido al banco");
            do {
                System.out.println("Digite 1 para crear una cuenta");
                System.out.println("Digite 2 para consultar una cuenta");
                opcion = scanner.nextInt();
                scanner.nextLine();
                if (opcion < 1 || opcion > 2) {
                    System.out.println("¡Opción inválida!");
                }
            } while (opcion < 1 || opcion > 2);
            
            switch (opcion) {
                case 1:
                    System.out.println("Digite un número de documento");
                    documento = scanner.nextLong();
                    scanner.nextLine();
                    Cuenta cuenta = new Cuenta(numeroCuenta, documento);
                    banco.registrarCuenta(cuenta);
                    numeroCuenta++;
                    break;
                case 2:
                    int documentoTemporal;
                    System.out.println("Digite un número de documento");
                    documento = scanner.nextLong();
                    documentoTemporal = banco.BuscarCuenta(documento);
                    if (documentoTemporal == -1) {
                        System.out.println("No se ha encontrado la cuenta");
                    } else {
                        double cantidad;
                        int consultar, repetir1 = 0;
                        System.out.println("Consultar cuenta:\n");
                        do {
                            do {
                                System.out.println("Ingrese 1 para consignar dinero");
                                System.out.println("Ingrese 2 para actualizar su cuenta");
                                System.out.println("Ingrese 3 para ver los datos de su cuenta");
                                System.out.println("Ingrese 4 para retirar saldo");
                                consultar = scanner.nextInt();
                                scanner.nextLine();
                                if (consultar < 1 || consultar > 4) {
                                    System.out.println("¡Opción inválida!");
                                }
                            } while (consultar < 1 || consultar > 4);
                            switch (consultar) {
                                case 1:
                                    System.out.println("Ingrese la cantidad de dinero que quiere consignar");
                                    cantidad = scanner.nextDouble();
                                    banco.consignarSaldoCuenta(documentoTemporal, cantidad);
                                    break;
                                case 2:
                                    banco.actulizarSaldoCuenta(documentoTemporal);
                                    System.out.println("Cuenta actualizada");
                                    break;
                                case 3:
                                    System.out.println("Datos Cuenta");
                                    banco.mostrarDatosCuenta(documentoTemporal);
                                    break;
                                case 4:
                                    System.out.println("Ingrese la cantidad de dinero que quiere retirar");
                                    cantidad = scanner.nextDouble();
                                    banco.retirarSaldoCuenta(documentoTemporal, cantidad);
                            }
                            
                            System.out.println("Digite 1 para realizar otra acción de la cuenta\n"
                                    + "Digite otro número para ir al menú principal");
                            repetir1 = scanner.nextInt();
                            scanner.nextLine();
                        } while (repetir1 == 1);
                            
                    }
                    break;
            }
            System.out.println("Digite 1 para repetir el programa\n"
                    + "Digite otro número para terminar el programa");
            repetir = scanner.nextInt();
            scanner.nextLine();
        } while (repetir == 1);
    }
}
