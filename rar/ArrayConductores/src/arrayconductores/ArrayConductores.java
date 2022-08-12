/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayconductores;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArrayConductores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola = new Scanner(System.in);
        consola.useDelimiter("\n");
        long cedula;
        String nombre;
        int clase, N;
        double pasajes, encomiendas, comision, total;
        //Definicion de la variable objeto
        Conductores obj_conductor;
        ArrayList<Conductores> lista=new ArrayList();
        System.out.println("Ingrese cantidad de conductores :");
        N=consola.nextInt();
        for (int i=1; i<=N;i++){
            System.out.println("Cedula :");
            cedula=consola.nextLong();
            System.out.println("Nombre :");
            nombre=consola.next();
            consola.nextLine();
            System.out.println("Clase :");
            clase=consola.nextInt();
            System.out.println("Valor recaudado en Pasajes :");
            pasajes=consola.nextDouble();
            System.out.println("Valor recaudado en Encomiendas :");
            encomiendas=consola.nextDouble();
            //crear el objeto
            obj_conductor=new Conductores(cedula,nombre,clase,pasajes, encomiendas);
            lista.add(obj_conductor);
        }
        //Procesa el arreglo
        total=0;
        for(int i=0;i<lista.size();i++){
            comision=lista.get(i).liquidar_comision();
            total=total+comision;
            System.out.println("Nombre del conductor :"+lista.get(i).getNombre());
            System.out.println("Valor de la comision :"+comision);
        }
        System.out.println("Valor total de comisiones :"+total);
    }
    
}
