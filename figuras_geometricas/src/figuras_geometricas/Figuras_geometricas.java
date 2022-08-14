package figuras_geometricas;

import java.util.Scanner;

public class Figuras_geometricas {

    public static void main(String[] args) {
       //Definir consola
       Scanner consola=new Scanner(System.in);
       double lado,base,altura,radio,area,perimetro;
       int opcion=0;
       //Definicion de variables objeto
       Cuadrado obj_cuad;
       Rectangulo obj_rect;
       Circulo obj_circ;
       do {
           System.out.println(" MENU DE OPCIONES");
           System.out.println();
           System.out.println(" 1. Figura Cuadrado");
           System.out.println(" 2. Figura Rectangulo");
           System.out.println(" 3. Figura Circulo");
           System.out.println(" 4. Salir");
           System.out.println("Ingrese su Opcion");
           opcion=consola.nextInt();
           switch(opcion){
               case 1:{
                   System.out.println("Lado: ");
                   lado=consola.nextDouble();
                   obj_cuad=new Cuadrado(lado);
                   area=obj_cuad.area();
                   perimetro=obj_cuad.perimetro();
                   System.out.println("Area Cuadrado: "+area);
                   System.out.println("Perimetro Cuadrado: "+perimetro);
                   break;
               }
               case 2:{
                   System.out.println("Base: ");
                   base=consola.nextDouble();
                   System.out.println("Altura: ");
                   altura=consola.nextDouble();
                   obj_rect=new Rectangulo(base,altura);
                   area=obj_rect.area();
                   perimetro=obj_rect.perimetro();
                   System.out.println("Area Rectangulo : "+area);
                   System.out.println("Perimetro Rectangulo : "+perimetro);
                   break;
           }
               case 3:{
                   System.out.println("Radio: ");
                   radio=consola.nextDouble();
                   obj_circ=new Circulo(radio);
                   area=obj_circ.area();
                   perimetro=obj_circ.perimetro();
                   System.out.println("Area Circulo : "+area);
                   System.out.println("Perimetro Circulo : "+perimetro);
                   break;
               }
               case 4: break;
           }
       } while (opcion!=4);
    }
}

