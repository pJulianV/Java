package liquidación; // Esto no va en el coderuner
import java.util.Scanner;

public class Liquidación {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n; // No se si va hay
        long nCuenta;
        String fechaApertura;
        int tipoCuenta;
        double saldoCuenta, saldoTotal = 0;
        double interesMensual, interesTotal = 0;        
        System.out.print("");
        n = input.nextInt();
        Cuenta objeto_cuenta;
        for (int i = 0; i < n; i++){
            System.out.print("");
            nCuenta = input.nextLong();
            System.out.print("");
            fechaApertura = input.next();
            System.out.print("");
            tipoCuenta = input.nextInt();
            System.out.print("");
            saldoCuenta = input.nextDouble();
            objeto_cuenta = new Cuenta(nCuenta, fechaApertura, tipoCuenta, saldoCuenta);
            interesMensual = objeto_cuenta.calcular_intereses( tipoCuenta,  saldoCuenta);
            System.out.println(nCuenta);
            System.out.println(interesMensual);
            System.out.println(saldoCuenta + interesMensual);
            interesTotal += interesMensual;
            saldoTotal += saldoCuenta + interesMensual;
        }
        System.out.println(interesTotal);
        System.out.println(saldoTotal);
        input.close();
    }
}
// Situación problema: Liquidación intereses de cuentas de ahorro

// Reto_2_PB

// Para el reto No. 2, se solicita 
// *crear la clase Cuenta, con los atributos y métodos  correspondientes, 
// aplicando toda la concepción de la programación orientada a objetos 
// *y en especial el encapsulamiento.

// *Para la programación de la clase, información de la cuenta de ahorro es la misma 
// proporcionada en el reto No. 1:

// *·         Número de cuenta, de tipo long.

// *·         Fecha de apertura, de tipo String de longitud 10, con formato “aaaa/mm/dd”
//          (Año/Mes/Día)

// *·         Tipo de cuenta (1: AhorroDiario, 2: CuentaJoven, 3: Tradicional), de tipo 
//             int.

// *·         Saldo de la cuenta, de tipo double.

// Es importante, tener en cuenta en la programación de la clase, que el banco desea  
// realizar un 
// *implementar en la clase un método, de nombre calcular_interes,
// para calcular el valor del interés, con base en la siguiente tabla:
// __________________________________________________________
// |      Tipo de cuenta       |   (%) de interés mensual   |
// |      1:  AhorroDiario     |   1.5                      |
// |      2:  CuentaJoven      |   1.7                      |
// |      3:  Tradicional      |   1.6                      |
// __________________________________________________________ 

// Recomendaciones importantes:

// El orden de los atributos en la clase es tal y como se suministra en el enunciado 
// de la situación problema.
//* El método para implementar en la clase debe calcular y retornar el valor del interés
// El método de comprobación es a través de casos de prueba, ya definidos en plataforma,
// que validarán la eficacia del programa, 
// *los cuales realizan la instancia de la clase 
// *y la ejecución de su método para el cálculo del valor interés.