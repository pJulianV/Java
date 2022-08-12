/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendedores;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Vendedores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int cedula = 0;
        System.out.println("Escriba 999 para detener el programa!");
         {
            int tipo_vendedor;
            double ventas_mensuales;
            double comisiones;
            System.out.println("Ingrese Cedula: ");
            cedula = input.nextInt();
            System.out.println(((Object)cedula).getClass().getSimpleName());
            System.out.println("Ingrese tipo de vendedor (1:Puerta a puerta 2: Gerente de ventas");
            tipo_vendedor = input.nextInt();
            System.out.println("Ingrese Ventas Mensuales:");
            ventas_mensuales = input.nextInt();
            if (tipo_vendedor == 1)
                comisiones = ventas_mensuales * 0.20;
            else
                comisiones = ventas_mensuales * 0.30;
            System.out.println("Cedula: " + cedula + "\nComisiones: " + comisiones);
            
        }
    input.close();
    }
}