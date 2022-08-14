package LiquidacionPolimorfismo.src;

import java.util.Scanner;

public class liquidacionPolimorfismo {
    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);
        int tipoCuenta;
        long numeroCuenta;
        String fechaApertura;
        double saldo,interes;
        System.out.println("Tipo cuenta 1:Cuenta, 2 Cuenta Corriente:");
        tipoCuenta = consola.nextInt();
        switch(tipoCuenta){
            case 1:
            int tipoCuentaInteres;
            Cuenta objCuenta;
            System.out.println("Ingrese numero de cuenta:");
            numeroCuenta = consola.nextLong();
            System.out.println("Ingrese la fecha de apertura:");
            fechaApertura = consola.nextLine();
            System.out.println("Ingrese saldo:");
            saldo = consola.nextDouble();
            System.out.println("Ingrese tipo cuenta (1: 1.5% , 2: 1.7% , 3: 1.6%):");
            tipoCuentaInteres = consola.nextInt();
            objCuenta = new Cuenta(numeroCuenta, fechaApertura, tipoCuentaInteres, saldo);
            interes = objCuenta.calcular_interes();
            
            case 2:
            double  porcentajeInteres, valorPermitido;
            CuentaCorriente objCuentaCorriente;
            System.out.println("Ingrese numero de cuenta:");
            numeroCuenta = consola.nextLong();
            System.out.println("Ingrese la fecha de apertura:");
            fechaApertura = consola.nextLine();
            System.out.println("Ingrese saldo:");
            saldo = consola.nextDouble();
            System.out.println("Ingrese porcentaje de interes:");
            porcentajeInteres = consola.nextDouble();
            System.out.println("Ingrese valor permitido:");
            valorPermitido = consola.nextDouble();
            objCuentaCorriente = new CuentaCorriente(numeroCuenta, fechaApertura, saldo, porcentajeInteres,
                    valorPermitido);
            interes = objCuentaCorriente.calcular_interes();
            System.out.println("Valor Interes:" + interes);
        }
        consola.close();
    }
}
// Bienvenido al primer Reto No. 3 del ciclo de Programación Básica.

// Situación problema: Liquidación intereses de cuentas de ahorro

// Reto_2_PB

// Para el reto No.3, se desea ampliar el contexto propuesto en el reto
// anterior,
// incluyendo una estructura que implica
// ! la incorporación de una clase Cliente, con la
// información de los clientes y
// ! otra clase CuentaCorriente, que corresponde a otro
// producto ofrecido en el portafolio del banco y con ello aplicar los conceptos
// de
// herencia y polimorfismo en la programación orientada a objetos.

// Para el reto No. 3, se conserva la clase Cuenta programada en el reto
// anterior,
// con las siguientes características:

// * Para los clientes,
// se conoce el documento de identidad, de tipo long, nombre de
// tipo String, correo electrónico de tipo String, número de celular de tipo int
// y la
// dirección, de tipo String, que presenta para comunicaciones y extractos,
// ! no se definen métodos u operaciones para esta clase

// ! En la clase Cuenta, creada en el reto anterior, se debe mencionar que debe
// heredar
// ! de la clase Cliente.

// * Para la cuenta corriente, que debe heredar del Cliente, además se conoce el
// número
// de la cuenta de tipo long, fecha de apertura de tipo string y longitud 10 con
// formato aaaa/mm/dd, saldo de tipo double,
// *
// porcentaje de interés que se aplica al
// ! saldo de la cuenta de cada mes, de tipo double y valor permitido de
// sobregiro de
// tipo double. Por tal motivo, se debe implementar el proceso de cálculo de
// intereses
// mensuales, que se debe llamar igual que el método que calcula el valor de
// interés
// de la clase Cuenta, es decir, calcular_interes.
// Recomendaciones importantes:

// El orden de los atributos en la clase es tal y como se suministra en el
// enunciado
// de la situación problema.
// Se debe implementar la anterior situación problema utilizando los conceptos
// de
// herencia y polimorfismo de la programación orientada a objetos en lenguaje
// Java.
// El método de comprobación es a través de casos de prueba, ya definidos en
// plataforma,
// que validarán la eficacia del programa, los cuales realizan la instancia de
// la
// clase y la ejecución de su método para el cálculo del valor interés.
