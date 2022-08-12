package LiquidacionPolimorfismo.src;
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

public class CuentaCorriente extends Cliente {// Hereda de la clase cliente
    private long numeroCuenta;
    private String fechaApertura;
    private double saldo, porcentajeInteres, valorPermitido;

    // Metodo vacio en caso que lo le asignemos parametros
    public CuentaCorriente() {
    }
    // Metodo con solo los atributos de CuentaCorriente 
    public CuentaCorriente(long numeroCuenta, String fechaApertura, double saldo, double porcentajeInteres,
            double valorPermitido) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.porcentajeInteres = porcentajeInteres;
        this.valorPermitido = valorPermitido;
    }
    
    // Metodo que funciona cuando se asignan atributos de la clase cliente y atributos
    // propios de la clase Cuenta Corriente
    public CuentaCorriente(long numeroCuenta, String fechaApertura, double saldo, double porcentajeInteres,double valorPermitido,
            long documentoIdentidad, String nombre, int numeroCelular, String direccion){
        super(documentoIdentidad, nombre, numeroCelular, direccion);
        this.numeroCuenta = numeroCelular;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo; 
        this.porcentajeInteres = porcentajeInteres;
        this.valorPermitido = valorPermitido;
    }
    
    public void setNumeroCuenta(long numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public long getNumeroCuenta(){
        return numeroCuenta;
    }
    public void setFechaApertura(String fechaApertura){
        this.fechaApertura = fechaApertura;
    }
    public String getFechaApertura(){
        return fechaApertura;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setPorcentajeInteres(double porcentajeInteres) {
        this.porcentajeInteres = porcentajeInteres;
    }
    public double getPorcentajeInteres() {
        return porcentajeInteres;
    }
    public void setValorPermitido(double valorPermitido){
        this.valorPermitido = valorPermitido;
    }
    public double getValorPermitido(){
        return valorPermitido;
    }
    public double calcular_interes() {
        return this.getSaldo() * this.getPorcentajeInteres();
    }
}
