package javaherenciapolimorfismo;

import java.util.Scanner;


public class JavaHerenciaPolimorfismo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int tipoCuenta;
        long numeroCuenta;
        String fechaApertura;
        double saldo, interes;
        System.out.println("Tipo cuenta 1:Cuenta, 2 Cuenta Corriente:");
        tipoCuenta = consola.nextInt();
        switch (tipoCuenta) {
            case 1:
                int tipoCuentaInteres;
                Cuenta objCuenta;
                System.out.println("Ingrese numero de cuenta:");
                numeroCuenta = consola.nextLong();
                System.out.println("Ingrese la fecha de apertura:");
                fechaApertura = consola.next();
                System.out.println("Ingrese saldo:");
                saldo = consola.nextDouble();
                System.out.println("Ingrese tipo cuenta (1: 1.5% , 2: 1.7% , 3: 1.6%):");
                tipoCuentaInteres = consola.nextInt();
                objCuenta = new Cuenta(numeroCuenta, fechaApertura, tipoCuentaInteres, saldo);
                interes = objCuenta.calcular_interes();

            case 2:
                double porcentajeInteres, valorPermitido;
                CuentaCorriente objCuentaCorriente;
                System.out.println("Ingrese numero de cuenta:");
                numeroCuenta = consola.nextLong();
                System.out.println("Ingrese la fecha de apertura:");
                fechaApertura = consola.next();
                System.out.println("Ingrese saldo:");
                saldo = consola.nextDouble();
                System.out.println("Ingrese porcentaje de interes:");
                porcentajeInteres = consola.nextDouble();
                System.out.println("Ingrese valor permitido:");
                valorPermitido = consola.nextDouble();
                objCuentaCorriente = new CuentaCorriente(numeroCuenta, fechaApertura, saldo, porcentajeInteres,
                        valorPermitido);
                interes = objCuentaCorriente.calcular_interes();
                System.out.println("Valor Interes:" + interes);
        }
        consola.close();
    }
}
