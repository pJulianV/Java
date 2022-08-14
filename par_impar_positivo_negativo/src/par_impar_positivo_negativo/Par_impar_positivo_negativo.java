package par_impar_positivo_negativo;

import java.util.Scanner;

public class Par_impar_positivo_negativo {

    public static void main(String[] args) {
        // Definición de la consola
        Scanner consola = new Scanner (System.in);
        // Definición de variables
        int numero;
        String mensaje;
        // Definición de la variable para el objeto
        Pares_impares_positivos_negativos objeto_numero;
        // Entrada de datos
        System.out.println("Número: ");
        numero=consola.nextInt();
        // Creación del Onbeto (Instanciar)
        objeto_numero=new Pares_impares_positivos_negativos(numero);
        mensaje=objeto_numero.par_impar();
        System.out.println(mensaje);
        mensaje=objeto_numero.positivo_negativo();
        System.out.println(mensaje);
    }
    
}
