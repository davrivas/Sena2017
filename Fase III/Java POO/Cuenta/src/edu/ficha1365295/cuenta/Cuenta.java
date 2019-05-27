package edu.ficha1365295.cuenta;

public class Cuenta {
    private long numeroCuenta;
    private long documento;
    private double saldo;
    private float interesAnual;
    private float interesDiario;
   
    public Cuenta(long numeroCuenta,long documento){
        this.numeroCuenta = numeroCuenta;
        this.documento = documento;
        saldo = 0;
        interesAnual = 5;
        interesDiario = interesAnual / 365;
    }
    public long getNumeroCuenta(){
        return numeroCuenta;
    }
    public long getDocumento(){
        return documento;
    }
    public double getSaldo(){
        return saldo;
    }
    public void actualizarSaldo(){
        saldo -= (saldo * interesDiario)  / 100;
    }
    public void consignar(double cantidad){
        saldo += cantidad;
    }
    public void retirarSaldo(double cantidad){
        saldo -= cantidad;
        System.out.println("Se han retirado " + cantidad + " pesos");
    }
    public void mostrarDatos(){
        System.out.println("La id de esta cuenta es " + numeroCuenta);
        System.out.println("El documento es " + documento);
        System.out.println("El saldo actual es " + saldo);
        System.out.println("El interes anual es "+ interesAnual);
    }
}
