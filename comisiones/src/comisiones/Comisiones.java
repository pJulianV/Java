package comisiones;

import java.util.Scanner;
public class Comisiones {

    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    
    long cedula;
    int N, tipo;
    double comision,ventas;
    
    System.out.println("Cantidad de Vendedores: ");
    N=entrada.nextInt();
    
    for(int i=1;i<=N;i++)
        {
        System.out.println("Cédula: ");
        cedula=entrada.nextLong();
        System.out.println("Tipo(1=Puerta a Puesta, 2=Ejecutivo): ");
        tipo=entrada.nextInt();
        System.out.println("Valor Ventas: ");
        ventas=entrada.nextDouble();
        
        if (tipo==1)
            comision=ventas*0.20;
        else
            comision=ventas*0.30;
        
        System.out.println("Comisión: "+comision);
        }
    }
}

        