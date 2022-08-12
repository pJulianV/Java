
package herenciaCreditos.src.herenciacreditos;
import java.util.Scanner;
public class HerenciaCreditos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double monto, valorInteres, cuota;
        int plazo, opcion = 0;
        CreditoPersonal objCredPersonal;
        CreditoEmpresarial objCredEmpresarial;
        CreditoEspecial objCredEspecial;
        do {

            System.out.println("Calcular cuota");
            System.out.println("1: Credito personal");
            System.out.println("2: Credito empresarial");
            System.out.println("3: Credito personal");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese Monto");
                    monto = entrada.nextDouble();
                    System.out.println("Ingrese Porcentaje Interes");
                    valorInteres = entrada.nextDouble();
                    System.out.println("Ingrese Plazo");
                    plazo = entrada.nextInt();
                    objCredPersonal = new CreditoPersonal(monto, valorInteres, plazo);
                    cuota = objCredPersonal.calcularCuota();
                    System.out.println("Cuota: " + cuota);
                    break;
                case 2:
                    System.out.println("Ingrese Monto");
                    monto = entrada.nextDouble();
                    System.out.println("Ingrese Porcentaje Interes");
                    valorInteres = entrada.nextDouble();
                    System.out.println("Ingrese Plazo");
                    plazo = entrada.nextInt();
                    objCredEmpresarial = new CreditoEmpresarial(monto, valorInteres, plazo);
                    cuota = objCredEmpresarial.calcularCuota();
                    System.out.println("Cuota:" + cuota);
                    break;
                case 3:
                    System.out.println("Ingrese Monto");
                    monto = entrada.nextDouble();
                    System.out.println("Ingrese Porcentaje Interes");
                    valorInteres = entrada.nextDouble();
                    System.out.println("Ingrese Plazo");
                    plazo = entrada.nextInt();
                    objCredEspecial = new CreditoEspecial(monto, valorInteres ,plazo);
                    cuota = objCredEspecial.calcularCuota();
                    System.out.println("Cuota: " + cuota);
                    break;
                case 4:
                    break;
            }
        } while (opcion != 4);
        entrada.close();
    }
}
