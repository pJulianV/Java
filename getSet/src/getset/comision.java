package getset;
import java.util.Scanner;
public class comision {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n;
        long documento ;
        int tipo;
        double ventas, comision, vtc;
        vendedor objeto_vendedor;
    

        System.out.print("Ingrese cantidad de vendedores a ingresar: ");
        n = input.nextInt();
        vtc = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese documento: ");
            documento = input.nextLong();
            System.out.print("Ingrese tipo vendedor(1 = Puerta a puerta,2 = Telemercadeo): ");
            tipo = input.nextInt();
            System.out.print("Ingrese ventas mensuales: ");
            ventas = input.nextDouble();
            objeto_vendedor = new vendedor(documento, tipo, ventas);
            comision = objeto_vendedor.calcularComision();
            vtc += comision;
            System.out.println(documento +": Comision: " + comision);            
        }
        System.out.print("Valor total Comision: " + vtc);
        input.close();
    }
}