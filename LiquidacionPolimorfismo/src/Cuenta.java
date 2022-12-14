package LiquidacionPolimorfismo.src;
// 3
// En la clase Cuenta, creada en el reto anterior, se debe mencionar que debe
// heredar de la clase Cliente.
public class Cuenta extends Cliente {
    private long numeroCuenta;
    private String fechaApertura;
    private int tipoCuenta;
    private double saldo;
    
    public Cuenta(long numeroCuenta, String fechaApertura, int tipoCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }
    
    public Cuenta(long numeroCuenta, String fechaApertura, int tipoCuenta , double saldo, long documentoIdentidad, String nombre,String correo, int numeroCelular, String direccion) {
        super(documentoIdentidad, nombre, correo,numeroCelular, direccion);
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }
    
    public Cuenta() {
    }
    private void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    private long getNumeroCuenta(){
        return numeroCuenta;
    }
    private void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    private String getFechaApertura () {
        return fechaApertura;
    }
    private void setTipoCuenta(int tipoCuenta){
        this.tipoCuenta = tipoCuenta;
    }
    private int getTipoCuenta(){
        return tipoCuenta;
    }
    private void setSaldo(double saldo){
        this.saldo = saldo;
    }
    private double getSaldo(){
        return saldo;
    }
    
    public double calcular_interes(){
        double interesMensual;
        if (tipoCuenta == 1)interesMensual = saldo * 1.5/100;
        else if(tipoCuenta == 2)interesMensual = saldo * 1.7/100;
        else interesMensual = saldo * 1.6/100;
        return interesMensual;
    }
}