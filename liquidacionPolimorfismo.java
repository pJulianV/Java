
import java.util.Scanner;

public class Cliente {
    long numeroCuenta;
    String fechaApertura;
    double saldo;
    double porcentajeInteres;
    double valorPermitido;

    public Cliente() {
    }

    public Cliente(long numeroCuenta, String fechaApertura, double saldo, double porcentajeInteres,double valorPermitido) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.porcentajeInteres = porcentajeInteres;
        this.valorPermitido = valorPermitido;
    }
    public void setNumeroCuenta(long numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public void setFechaApertura(String fechaApertura){
        this.fechaApertura = fechaApertura;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setPorcentajeInteres(double porcentajeInteres){
        this.porcentajeInteres = porcentajeInteres;
    }
    public void setValorPermitido(double valorPermitido){
        this.valorPermitido = valorPermitido;
    }
    public long getNumeroCuenta(long numeroCuenta){
        return numeroCuenta;
    }
    public String getFechaApertura(String fechaApertura){
        return fechaApertura;
    }
    public double getSaldo(double saldo){
        return saldo;
    }
    public double getPorcentajeInteres(double porcentajeInteres){
        return porcentajeInteres;
    }
    public double getValorPermitido(double valorPermitido){
        return valorPermitido;
    }
}
public class Cuenta extends Cliente{
    public Cuenta(){}
    public Cuenta(long numeroCuenta, String fechaApertura, double saldo, double valorInteres , double valorPermitido){
        super(numeroCuenta, fechaApertura, saldo, valorInteres, valorPermitido);
    }
    public double calcular_interes{
        return  ;
    }
}
    
public class CuentaCorriente extends Cliente{// Hereda de la clase cliente
    public CuentaCorriente(){}
    public CuentaCorriente(long numeroCuenta, String fechaApertura, double saldo,double porcentajeInteres, double valorPermitido) {
        super(numeroCuenta, fechaApertura, saldo, porcentajeInteres, valorPermitido);
    }
    public double calcular_interes(){
        return saldo * porcentajeInteres + saldo;
    }
} 


// Bienvenido al primer Reto No. 3 del ciclo de Programaci??n B??sica.

// Situaci??n problema: Liquidaci??n intereses de cuentas de ahorro

// Reto_2_PB

// Para el reto No.3, se desea ampliar el contexto propuesto en el reto anterior, 
// incluyendo una estructura que implica 
// ! la incorporaci??n de una clase Cliente, con la 
// informaci??n de los clientes y 
// ! otra clase CuentaCorriente, que corresponde a otro 
// producto ofrecido en el portafolio del banco y con ello aplicar los conceptos de 
// herencia y polimorfismo en la programaci??n orientada a objetos.

// Para el reto No. 3, se conserva la clase Cuenta programada en el reto anterior, 
// con las siguientes caracter??sticas:

// * Para los clientes, 
// se conoce el documento de identidad, de tipo long, nombre de 
// tipo String, correo electr??nico de tipo String, n??mero de celular de tipo int y la 
// direcci??n, de tipo String, que presenta para comunicaciones y extractos, 
// ! no se definen  m??todos u operaciones para esta clase

//! En la clase Cuenta, creada en el reto anterior, se debe mencionar que debe heredar
//! de la clase Cliente.

// * Para la cuenta corriente, que debe heredar del Cliente, adem??s se conoce el n??mero
// de la cuenta de tipo long, fecha de apertura de tipo string y longitud 10 con
// formato aaaa/mm/dd, saldo de tipo double, 
// *
// porcentaje de inter??s que se aplica al
// ! saldo de la cuenta de cada mes, de tipo double y valor permitido de sobregiro de
// tipo double. Por tal motivo, se debe implementar el proceso de c??lculo de intereses
// mensuales, que se debe llamar igual que el m??todo que calcula el valor de inter??s
// de la clase Cuenta, es decir, calcular_interes.
// Recomendaciones importantes:

// El orden de los atributos en la clase es tal y como se suministra en el enunciado 
// de la situaci??n problema.
// Se debe implementar la anterior situaci??n problema utilizando los conceptos de 
// herencia y polimorfismo de la programaci??n orientada a objetos en lenguaje Java.
// El m??todo de comprobaci??n es a trav??s de casos de prueba, ya definidos en plataforma,
// que validar??n la eficacia del programa, los cuales realizan la instancia de la
// clase y la ejecuci??n de su m??todo para el c??lculo del valor inter??s.
