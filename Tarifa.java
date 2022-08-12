/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarifa;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Tarifa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long documento;
        char estado;
        int estrato;
        float tb = 0;
        System.err.println("Documento de identidad: ");
        documento = entrada.nextLong();
        System.err.println("Estado: (A=Activo, S = Suspendido) ");
        estado = entrada.next().charAt(0);
        System.err.println("Estrato(1,2,3,4,5): ");
        estrato = entrada.nextInt();
        entrada.close();
        if (estado == 'S')
            tb = 0;
        else
            switch (estrato) {
                case 1:
                    tb = 10000;
                    break;
                case 2:
                    tb = 15000;
                    break;
                case 3:
                    tb = 30000;
                    break;
                case 4:
                    tb = 50000;
                    break;
                case 5:
                    tb = 65000;
                    break;
            }
        System.out.println(documento);
        System.out.println("Tarifa Basica: " + tb);

    }

}
