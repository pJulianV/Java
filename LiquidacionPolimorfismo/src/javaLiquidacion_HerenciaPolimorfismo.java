package LiquidacionPolimorfismo.src;

public class javaLiquidacion_HerenciaPolimorfismo {
    
}

public class Cliente {
    private long documentoIdentidad;
    private String nombre;
    private String correo;
    private int numeroCelular;
    private String direccion;

    public Cliente() {
    }

    public Cliente(long documentoIdentidad, String nombre, String correo, int numeroCelular, String direccion) {
        this.documentoIdentidad = documentoIdentidad;
        this.nombre = nombre;
        this.correo = correo;
        this.numeroCelular = numeroCelular;
        this.direccion = direccion;
    }

    public void setDocumentoIdentidad(long documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public long getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
}

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

    public Cuenta(long numeroCuenta, String fechaApertura, int tipoCuenta, double saldo, long documentoIdentidad,
            String nombre, String correo, int numeroCelular, String direccion) {
        super(documentoIdentidad, nombre, correo, numeroCelular, direccion);
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

    private long getNumeroCuenta() {
        return numeroCuenta;
    }

    private void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    private String getFechaApertura() {
        return fechaApertura;
    }

    private void setTipoCuenta(int tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    private int getTipoCuenta() {
        return tipoCuenta;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double getSaldo() {
        return saldo;
    }

    public double calcular_interes() {
        double interesMensual;
        if (tipoCuenta == 1)
            interesMensual = saldo * 1.5 / 100;
        else if (tipoCuenta == 2)
            interesMensual = saldo * 1.7 / 100;
        else
            interesMensual = saldo * 1.6 / 100;
        return interesMensual;
    }
}

public class CuentaCorriente extends Cliente {// Hereda de la clase cliente
    private long numeroCuenta;
    private String fechaApertura;
    private double saldo, porcentajeInteres, valorPermitido;

    public CuentaCorriente() {
    }

    public CuentaCorriente(long numeroCuenta, String fechaApertura, double saldo, double porcentajeInteres,
            double valorPermitido) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.porcentajeInteres = porcentajeInteres;
        this.valorPermitido = valorPermitido;
    }

    public CuentaCorriente(long numeroCuenta, String fechaApertura, double saldo, double porcentajeInteres,
            double valorPermitido, long documentoIdentidad, String nombre, String correo, int numeroCelular,
            String direccion) {
        super(documentoIdentidad, nombre, correo, numeroCelular, direccion);
        this.numeroCuenta = numeroCelular;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.porcentajeInteres = porcentajeInteres;
        this.valorPermitido = valorPermitido;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setPorcentajeInteres(double porcentajeInteres) {
        this.porcentajeInteres = porcentajeInteres;
    }

    public double getPorcentajeInteres() {
        return porcentajeInteres;
    }

    public void setValorPermitido(double valorPermitido) {
        this.valorPermitido = valorPermitido;
    }

    public double getValorPermitido() {
        return valorPermitido;
    }

    public double calcular_interes() {
        return this.getSaldo() * this.getPorcentajeInteres() / 100;
    }
}
