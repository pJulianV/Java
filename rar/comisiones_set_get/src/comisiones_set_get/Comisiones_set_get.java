package comisiones_set_get;

import java.util.Scanner;

public class Comisiones_set_get {

    public static void main(String[] args) {

        //Defición de la consola
        Scanner consola = new Scanner(System.in);
        //Definición de Variables
        int tipo, N;
        long documento;
        double ventas,comision,vtc;
        //Definición del Objeto
        Vendedor obj_objeto;
        System.out.println("Cantidad de Vendedores: ");
        N=consola.nextInt();
        vtc=0;
        for(int i=1;i<=N;i++)
        {
            System.out.println("Documento: ");
            documento=consola.nextLong();
            System.out.println("Tipo (1=Puerta a Puerta, 2=Telemercadeo): ");
            tipo=consola.nextInt();
            System.out.println("Ventas: ");
            ventas=consola.nextDouble();
        //Creación del objeto
        obj_objeto=new Vendedor(documento,tipo,ventas);
        comision=obj_objeto.calcular_comision();
        vtc=vtc+comision;
        System.out.println("Documento: "+obj_objeto.getDocumento());
        System.out.println("Comisión: "+comision);
        }
        System.out.println("Valor Total de las Comisiones: "+vtc);
    }

}
