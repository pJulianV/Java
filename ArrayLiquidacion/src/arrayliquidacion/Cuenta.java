package arrayliquidacion;

public class Cuenta {

    private long nCuenta;
    private String fechaApertura;
    private int tipoCuenta;
    private double saldoCuenta;
    public Cuenta(){}
    // Funion donde al atributo se le asignan sus respectivas variables
    public Cuenta (long nCuenta, String fechaApertura, int tipoCuenta, double saldoCuenta){
        this.nCuenta = nCuenta;
        this.fechaApertura = fechaApertura;
        this.tipoCuenta = tipoCuenta;
        this.saldoCuenta = saldoCuenta;
    }
    // ! Los atributos son privados por eso debemos crear metodos constructores set-get
    //set
    // Metodos vacios (que no retornan), se le asigna al atributo priv. la variable correspondiente
    public void setnCuenta(long nCuenta) {
        this.nCuenta = nCuenta;
    }
    public void setfechaApertura(String fechaApertura){
        this.fechaApertura = fechaApertura;
    }
    public void settipo(int tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    public void setsaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    // Sin el get, si no retorna la variable, no se usa el atributo
    // el get debe retornar el mismo tipo del atributo
    public long getnCuenta(){
        return nCuenta;
    }

    public String getfechaApertura() {
        return fechaApertura;
    }
    public int gettipoCuenta(){
        return tipoCuenta;
    }
    
    public double getsaldoCuenta() {
        return saldoCuenta;
    }
    public double calcular_intereses(int tipoCuenta, double saldoCuenta){
        double interesMensual;
        if (tipoCuenta == 1) interesMensual = saldoCuenta * 0.015;
        else if (tipoCuenta == 2) interesMensual = saldoCuenta * 0.017;
        else interesMensual = saldoCuenta * 0.016;
        return interesMensual;
    }
}

// public class Cuenta {
//     private long nCuenta;
//     private String fechaApertura;
//     private int tipoCuenta;
//     private double saldoCuenta;

//     public Cuenta() {
//     }

//     public Cuenta(long nCuenta, String fechaApertura, int tipoCuenta, double saldoCuenta) {
//         this.nCuenta = nCuenta;
//         this.fechaApertura = fechaApertura;
//         this.tipoCuenta = tipoCuenta;
//         this.saldoCuenta = saldoCuenta;
//     }

//     public void setnCuenta(long nCuenta) {
//         this.nCuenta = nCuenta;
//     }

//     public void setfechaApertura(String fechaApertura) {
//         this.fechaApertura = fechaApertura;
//     }

//     public void settipo(int tipoCuenta) {
//         this.tipoCuenta = tipoCuenta;
//     }

//     public void setsaldoCuenta(double saldoCuenta) {
//         this.saldoCuenta = saldoCuenta;
//     }

//     public long getnCuenta() {
//         return nCuenta;
//     }

//     public String getfechaApertura() {
//         return fechaApertura;
//     }

//     public int gettipoCuenta() {
//         return tipoCuenta;
//     }

//     public double getsaldoCuenta() {
//         return saldoCuenta;
//     }

//     public double calcular_interes() {
//         double interesMensual;
//         if (tipoCuenta == 1)
//             interesMensual = saldoCuenta * 0.015;
//         else if (tipoCuenta == 2)
//             interesMensual = saldoCuenta * 0.017;
//         else
//             interesMensual = saldoCuenta * 0.016;
//         return Math.round(interesMensual * 100.0) / 100.0;
//     }
// }
