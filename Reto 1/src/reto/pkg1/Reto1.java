package reto.pkg1;

import java.util.Scanner;

public class Reto1 {
    // TODO Funcion int, string Validator
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nCuentas;
        long numeroCuenta;
        char fechaApertura;
        int tipoCuenta;
        double saldoCuenta;
        double interesMensual;
        double totalIntereses = 0, totalSaldos = 0;
        System.out.print("");
        nCuentas = input.nextInt();
        for (int i = 0; i < nCuentas; i++) {
            System.out.print("");
            numeroCuenta = input.nextInt();
            System.out.print("");
            fechaApertura = input.next().charAt(10); // aaaa/mm/dd
            System.out.print("");
            tipoCuenta = input.nextInt();
            System.out.print("");
            saldoCuenta = input.nextInt();
            if (tipoCuenta > saldoCuenta) {
                double temp = tipoCuenta;
                tipoCuenta = (int) saldoCuenta;
                saldoCuenta = temp;
            }
            if (tipoCuenta == 1) interesMensual = saldoCuenta * 0.015;
            else if (tipoCuenta == 2) interesMensual = saldoCuenta * 0.016;
            else interesMensual = saldoCuenta * 0.017;
            
            // switch (tipoCuenta) {
            //     case 1:
            //         interesMensual = saldoCuenta * 0.015;
            //     case 2:
            //         interesMensual = saldoCuenta * 0.017;
            //     case 3:
            //         interesMensual = saldoCuenta * 0.016;
            // }
            totalIntereses += interesMensual;
            totalSaldos += saldoCuenta + interesMensual;
            System.out.println(numeroCuenta);
            System.out.println(Math.round(interesMensual * 100.0) / 100.0);
            System.out.println(saldoCuenta + interesMensual);
        }
        System.out.println(Math.round(totalIntereses * 100.0) / 100.0);
        System.out.println(Math.round(totalSaldos * 100.0) / 100.0);
        input.close();
    }
}