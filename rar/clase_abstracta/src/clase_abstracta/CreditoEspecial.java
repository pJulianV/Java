
package clase_abstracta;


public class CreditoEspecial extends Credito{

    public CreditoEspecial() {
    }

    public CreditoEspecial(double monto, double interes, int plazo) {
        super(monto, interes, plazo);
    }
    
@Override     
public double calcular_cuota(){
    double cuota;
    cuota=(this.getMonto()/this.getPlazo());
    return cuota;
    }
    
}
