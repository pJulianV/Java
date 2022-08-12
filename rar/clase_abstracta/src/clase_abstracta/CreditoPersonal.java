
package clase_abstracta;

public class CreditoPersonal extends Credito{

    public CreditoPersonal() {
    }
    public CreditoPersonal(double monto, double interes, int plazo){
     super (monto, interes,plazo);
    }
    
@Override
    public double calcular_cuota(){
    double cuota;
    cuota=(this.getMonto()+this.getMonto()*(this.getInteres()/100))/this.getPlazo();
    return cuota;
    }
}