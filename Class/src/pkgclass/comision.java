/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgclass;

import java.util.Scanner;

public class comision{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long documento; // long sirva para listas tambien y usa "codigos" para guardas informacion
        int tipo;
        double ventas, comision;

        vendedor objeto_vendedor;

        System.out.println("Documento: ");
        documento = input.nextLong();
        System.out.println("Tipo de vendedor: ");
        tipo = input.nextInt();
        System.out.println("Ventas mensuales: ");
        ventas = input.nextDouble();

        objeto_vendedor = new vendedor(documento,tipo, ventas);
        comision = objeto_vendedor.calcularComision(tipo, ventas);
        System.out.println("Comision:" +comision);
    }
    
}
