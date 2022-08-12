/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facturaciontelefonica;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class FacturacionTelefonica {
    static float valor_a_pagar(int estrato, long impulsosMensuales) {
        float tarifaBasica, va;
        switch(estrato){
            case 1: tarifaBasica = 10000;
            case 2: tarifaBasica = 15000;
            case 3: tarifaBasica = 20000;
            case 4: tarifaBasica = 25000;
            case 5: tarifaBasica = 50000; 
        }
        va = tarifaBasica + impulsosMensuales * 100;
        return va;
    }
    static int val_estrato(int estrato) {
        Scanner input = new Scanner(System.in);
        while (estrato < 1 || estrato > 5){
            System.out.print("Estrato");
            estrato = input.nextInt();
        }
        input.close();
        return estrato;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);   
        float vt = 0;
        int n;
        System.out.print("Numero de abonados: ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int  codigo, estrato;
            long impulsosMensuales;
            double va;
            System.out.println("Codigo:");
            codigo = input.nextInt();
            System.out.println("Estrato:");
            estrato = input.nextInt();
            if (estrato < 1 || estrato > 5){
                estrato = val_estrato(estrato);
            }
            System.out.println("Impulsos mensuales:");
            impulsosMensuales = input.nextLong();
            va = valor_a_pagar(estrato, impulsosMensuales);
            vt += va;
            System.out.print("Valor a pagar: "+va);
        }
        System.out.print("Valor total a pagar de todos: "+ vt);
        input.close();
    }
    
}