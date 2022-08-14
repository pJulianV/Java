
package interfaces;

import java.util.Scanner;

public class Interfaces {

    
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        Humano obj_humano;
        Animal obj_animal;
        Hombre obj_hombre;
        
        obj_humano=new Humano();
        obj_humano.setDocumento("91226402");
        obj_humano.razonar();
        obj_humano.desplazar();
        obj_humano.alimentar();
        obj_humano.jugar();
        obj_humano.trabajar();
        System.out.println();
        
        obj_animal=new Animal();
        obj_animal.setRaza("Orangutan");
        obj_animal.cazar();
        obj_animal.desplazar();
        obj_animal.jugar();
        System.out.println();
        
        obj_hombre=new Hombre();
        obj_hombre.setDocumento("91226402");
        obj_hombre.setNombre("NESTOR ANAYA CHAVEZ");
        obj_hombre.razonar();
        obj_hombre.desplazar();
        obj_hombre.trabajar();
    }
    
}
