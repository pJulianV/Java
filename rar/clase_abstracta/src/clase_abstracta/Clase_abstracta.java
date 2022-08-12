package clase_abstracta;
import java.util.Scanner;
public class Clase_abstracta {

public static void main(String[] args) {
        //Definicion de la consola
        Scanner consola=new Scanner(System.in);
        //definicion
        double monto,interes,valor_interes,cuota;
        int plazo, opcion=0;
        //deficniin o declaracion de los objetos
        CreditoPersonal obj_credper;
        CreditoEmpresarial obj_credemp;
        CreditoEspecial obj_credesp;
       
        do{
            System.out.println("MENU CREDITOS");
            System.out.println("1.Credito personal");
            System.out.println("2.Credito empresarial");
            System.out.println("3.Credito Especial");
            System.out.println("4.Salir");
            System.out.println("Ingrese opcion");
            opcion=consola.nextInt();
            switch(opcion){
                case 1:{
                    System.out.println("Monto");
                    monto=consola.nextDouble();
                    System.out.println("% Interes");
                    interes=consola.nextDouble();
                    System.out.println("Plazo");
                    plazo=consola.nextInt();
                    //Creacion del objeto personal
                    obj_credper=new CreditoPersonal(monto,interes,plazo);
                    cuota=obj_credper.calcular_cuota();
                    System.out.println("valor cuota credito personal: "+cuota);
                    break;
                }
                case 2:{
                    System.out.println("Monto");
                    monto=consola.nextDouble();
                    System.out.println("valor Interes");
                    valor_interes=consola.nextDouble();
                    System.out.println("Plazo");
                    plazo=consola.nextInt();
                    //Creacion del objeto credito empresarial
                    obj_credemp=new CreditoEmpresarial(valor_interes,monto,plazo);
                    cuota=obj_credemp.calcular_cuota();
                    System.out.println("valor cuota credito empresarial: "+cuota);
                    break;
                }
                 case 3:{
                    System.out.println("Monto");
                    monto=consola.nextDouble();
                    System.out.println("Plazo");
                    plazo=consola.nextInt();
                    //Creacion del objeto credito especial
                    obj_credesp= new CreditoEspecial(monto,0,plazo);
                    cuota=obj_credesp.calcular_cuota();
                    System.out.println("valor cuota credito especial: "+cuota);
                    break;
           
                }
                 case 4:break;
            }
           
        } while(opcion!=4);
           
    }
}
