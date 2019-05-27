package edu.ficha1365295.cuenta;

import java.util.ArrayList;

public class Banco {
    ArrayList<Cuenta> banco;

    public Banco() {
        banco = new ArrayList<>();
    }

    public void registrarCuenta(Cuenta cuenta) {
        banco.add(cuenta);
    }

    public int BuscarCuenta(long numeroCuenta) {
        int aux = - 1;
        for (int i = 0; i < banco.size(); i++) {
            if (banco.get(i).getDocumento() == numeroCuenta) {
                aux = i;
                break;
            }
        }
        return aux;
    }

    public void actulizarSaldoCuenta(int documentoTemporal) {
        banco.get(documentoTemporal).actualizarSaldo();
        System.out.println("Accion exitosa");
    }

    public void consignarSaldoCuenta(int documentoTemporal, double cantidad) {
        banco.get(documentoTemporal).consignar(cantidad);
        System.out.println("Accion exitosa");
    }

    public void retirarSaldoCuenta(int documentoTemporal, double cantidad) {
        banco.get(documentoTemporal).retirarSaldo(cantidad);
        System.out.println("Accion exitosa");
    }

    public void mostrarDatosCuenta(int documentoTemporal) {
        banco.get(documentoTemporal).mostrarDatos();
        System.out.println("Accion exitosa");
    }
}
