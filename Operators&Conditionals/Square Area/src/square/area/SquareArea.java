/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square.area;

import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class SquareArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int lado;
    System.out.print("Ingrese lado: ");
    lado = entrada.nextInt();
    System.out.print(lado * lado);
    entrada.close();
    }
    
}
