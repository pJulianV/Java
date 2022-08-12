package tarifa;

import java.util.Scanner;

public class Tarifa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    long documento;
    char estado;
    int estrato;
    float tb=0;
    
    System.out.println("Documento de Identidad: ");
    documento=entrada.nextLong();
    System.out.println("Estado(A=Activo, S=Suspendido): ");
    estado=entrada.next().charAt(0);
    System.out.println("Estrato (1,2,3,4,5): ");
    estrato=entrada.nextInt();
    
    if (estado=='S')
        tb=0;
    else
        switch (estrato)
        {
            case 1: tb=10000;break;
            case 2: tb=15000;break;
            case 3: tb=30000;break;
            case 4: tb=50000;break;
            case 5: tb=65000;break;
             
        }
    System.out.println("tarifa Básica: "+tb);
    
    
}
}
