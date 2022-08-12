/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parimparpositivonegativo;

import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class ParImparPositivoNegativo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num;
        String mensaje;
        numeroEntero objeto_num; //Importa

        System.out.print("Ingrese numero (ver si es par, positivo o primo): ");
        num = input.nextInt();
        objeto_num = new numeroEntero(num);
        mensaje = objeto_num.par_impar();
        System.out.println(mensaje);
        mensaje = objeto_num.positivo_negativo();
        System.out.println(mensaje);
        mensaje = objeto_num.primo();
        System.out.println(mensaje);
        input.close();
    }
    
}