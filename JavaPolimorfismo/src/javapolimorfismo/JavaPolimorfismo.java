/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaPolimorfismo.src.javapolimorfismo;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class JavaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado,base,altura,radio,area,perimetro;
        Rectangulo obj_rect;
        Circulo obj_cir;
        Cuadrado obj_cuad;
        System.out.println("Calcular el area o el perimetro de una figura");
        System.out.println("1: Rectangulo");
        System.out.println("2: Circulo");
        System.out.println("3: Cuadrado");
        int seleccion = entrada.nextInt();
        do{
            switch(seleccion) {
                case 1: 
                System.out.println("Base:");
                base = entrada.nextDouble();
                System.out.println("Altura");
                altura = entrada.nextDouble();
                obj_rect = new Rectangulo();
                perimetro = obj_rect.perimetro();
                area = obj_rect.area();
                System.out.println("Perimetro: "+perimetro);
                System.out.println("Area: "+ area);
                case 2:
                System.out.println("Radio:");
                radio = entrada.nextDouble();
                obj_cir = new Circulo();
                perimetro = obj_cir.perimetro();
                area = obj_cir.area();
                System.out.println("Perimetro: "+perimetro);
                System.out.println("Area: "+area);
                case 3:
                obj_cuad = new Cuadrado();
                System.out.println("Lado");
                lado = entrada.nextDouble();
                perimetro = obj_cuad.perimetro();
                area = obj_cuad.area();
                System.out.println("Perimetro: " + perimetro);
                System.out.println("Area: " + area);               
                case 4:
                break;
            }  
        }while(seleccion != 4);
        entrada.close();
    }
}