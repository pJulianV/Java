/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comisiones;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Estratos {
    public static void Facturacion(){

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n_vededores;
        int total_tarifa = 0;
        System.err.println("Enter a number of vendors: ");
        n_vededores = input.nextInt();
        for (int i = 0; i < n_vededores; i++) {
            long documento = 0;
            char estado;
            int estrato;
            float tb = 0;
            while (documento != 999) {
                System.err.println("Enter the document: ");
                documento = input.nextInt();
                System.err.println("Ingrese el estado: ");
                estado = input.next().charAt(0);
                System.err.println("Ingrese estrato: ");
                estrato = input.nextInt();
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
                total_tarifa += tb;
                System.out.println(documento);
                System.out.println("Tarifa: " + tb);
            }
            System.out.println("Tarifa Total de los " + n_vededores + ": " + total_tarifa);
        }
        input.close();
    }

}

// package comisiones;
// import java.util.Scanner;
// /**
//  *
//  * @author USUARIO
//  */
// public class Comisiones {
//     static void document_validator(String label, long documento) {
//         while (true){
//             try {
//                 System.err.println("Enter the document: ");
//                 documento = input.nextInt();
//                 if (documento == 999)
//                 }
//             Finally
                
//     }

//     /**
//      * @param args the command line arguments
//      */
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int n_vendors;
//         int total_tarifa = 0;
//         System.err.println("Enter a number of vendors: ");
//         n_vendors = input.nextInt();
//         for (int i = 0; i < n_vendors; i++) {
//             long documento = 0;
//             char estado;
//             int estrato;
//             float tb = 0;
            
//             documento = input.nextInt();
//             System.err.println("Ingrese el estado: ");
//             estado = input.next().charAt(0);
//             System.err.println("Ingrese estrato: ");
//             estrato = input.nextInt();
//             if (estado == 'S')
//                 tb = 0;
//             else
//                 switch (estrato) {
//                     case 1:
//                         tb = 10000;
//                         break;
//                     case 2:
//                         tb = 15000;
//                         break;
//                     case 3:
//                         tb = 30000;
//                         break;
//                     case 4:
//                         tb = 50000;
//                         break;
//                     case 5:
//                         tb = 65000;
//                         break;
//                 }
//                 total_tarifa += tb;
//                 System.out.println(documento);
//                 System.out.println("Tarifa: " + tb);
//             }
//         System.out.println("Tarifa Total de los "+ n_vendors + ": "+total_tarifa);
//         }
//         input.close();
//     }
    
// }
