package arrayliquidacion; // Esto no va en el coderuner

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLiquidacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n; // No se si va hay
        long nCuenta;
        String fechaApertura;
        int tipoCuenta;
        double saldoCuenta, saldoTotal = 0;
        double interesMensual, interesTotal = 0;
        System.out.print("");
        n = input.nextInt();
        Cuenta objeto_cuenta;
        ArrayList<Cuenta> listaCuentas = new ArrayList();
        for (int i = 0; i < n; i++) {
            System.out.print("");
            nCuenta = input.nextLong();
            System.out.print("");
            fechaApertura = input.next();
            System.out.print("");
            tipoCuenta = input.nextInt();
            System.out.print("");
            saldoCuenta = input.nextDouble();
            objeto_cuenta = new Cuenta(nCuenta, fechaApertura, tipoCuenta, saldoCuenta);
            System.out.println(nCuenta);
            listaCuentas.add(objeto_cuenta);
            interesMensual = listaCuentas.get(i).calcular_intereses(tipoCuenta, saldoCuenta);
            interesTotal += interesMensual;
            saldoTotal += saldoCuenta + interesMensual;
            System.out.println(interesMensual);
            System.out.println(saldoCuenta + interesMensual);
        }
        System.out.println(interesTotal);
        System.out.println(saldoTotal);
        input.close();
    }
}
