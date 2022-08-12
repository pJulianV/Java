package animales;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class mascota {
    Scanner entrada = new Scanner(System.in);
    // Metodo estatico vacio
    static void asignarMascota(){
    int classificacion, nMascotas;
    String nombre, especie;
    int arrMascotas;

    animal objeto_animal;

    System.out.println("¿Cuantas mascotas tienes?: ");
    nMascotas = entrada.nextInt(); 
    };
    public static void main(String[] args){
        int confirmarMascota;
        Scanner entrada = new Scanner(System.in);
        String nombre, especie;
        System.out.println("Starting");
        for (int i = 0; i < 100; i++) {
            System.out.println("");
        }
        System.out.println("¿Tienes mascotas? (1 => si, 2 => no)");
        confirmarMascota = entrada.nextInt();
        if (confirmarMascota == 1){
            System.out.println(" ( ._.) ? ");
        }else{
            asignarMascota();
        }
        
    entrada.close();
    }
}