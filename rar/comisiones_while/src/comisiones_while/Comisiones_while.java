package comisiones_while;

import java.util.Scanner;

public class Comisiones_while {

public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    
    long cedula;
    int tipo;
    double comision,ventas;
    
    System.out.println("Cédula del Vendedor: ");
    cedula=entrada.nextLong();
    
    while (cedula!=999)
        {
            System.out.println("Tipo(1=Puerta a Puesta, 2=Ejecutivo): ");
            tipo=entrada.nextInt();
            System.out.println("Valor Ventas: ");
            ventas=entrada.nextDouble();  

            if (tipo==1)
                comision=ventas*0.20;
            else
                comision=ventas*0.30;

            System.out.println("Comisión: "+comision);

            System.out.println("Cédula: ");
            cedula=entrada.nextLong();
        }
    }
 }
