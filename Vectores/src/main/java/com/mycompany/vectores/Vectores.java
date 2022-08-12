/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vectores;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Vectores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long cp = 0, ci = 0, sp = 0, si = 0; // cantidad de pares, cantidad de impares, suma de pares, suma de impares
        long numeros[]; // Lista

        int numero_input;
        System.out.println("Ingrese cantidad de numeros:");
        numero_input = input.nextInt();
        numeros = new long[numero_input]; // Establecer el largo de la lista

        for (int i = 0;i < numero_input;i++) {
            System.out.println(i+1 + " Ingrese numero: ");
            numeros[i]= input.nextInt();
        }
        for (int i=0; i < numero_input; i++) {
            if (numeros[i] % 2 == 0){
                cp = cp + 1;
                sp = sp + numeros[i];
            }
            else {
                ci = ci +1;
                si = si + numeros[i];
            }

        }
        System.out.println("Hay "+ cp + " pares y " + ci + " impares");
        System.out.println("La suma de pares es "+ sp+ " y de impares es " + si);
        input.close();
        for (int i = 0; i < numero_input; i++){
            System.out.println(numeros[i]);
        }
    }
}
