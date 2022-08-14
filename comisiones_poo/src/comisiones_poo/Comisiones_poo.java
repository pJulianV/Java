package comisiones_poo;

import java.util.Scanner;

public class Comisiones_poo {

public static void main(String[] args) {
    // Definición de la consola
Scanner consola = new Scanner (System.in);
    // Definición de variables
    long documento;
    int tipo;
    double ventas,comision;
    // Definición de la Variable para manejar el Objeto
    Vendedor objeto_vendedor;
    // Entrada de Datos
   System.out.println("Documento: ");
   documento=consola.nextLong();
   System.out.println("Tipo (1=Puerta a Puerta, 2=Telemercadeo): ");
   tipo=consola.nextInt();
  System.out.println("Ventas del mes: ");
   ventas=consola.nextDouble();
   // Creación del Objeto
   objeto_vendedor= new Vendedor(documento,tipo,ventas);
   comision=objeto_vendedor.calcular_comision();
   System.out.println("Comisión: "+comision);
}
}
