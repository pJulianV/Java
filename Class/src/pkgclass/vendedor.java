package pkgclass;

public class vendedor {
    long documento;
    int tipo;
    double ventas;
    public vendedor(long documento, int tipo, double ventas){
        this.documento = documento;
        this. tipo = tipo;
        this. ventas = ventas;
        
    }
    public double calcularComision(int tipo, double ventas){
        double comision;
        if (this.tipo == 1){
            comision = this.ventas * 0.25;
        }else{
            comision = this.ventas * 0.20;
        }
        return comision;
    }
    
}
