
package clase_abstracta;


public class CreditoEmpresarial extends Credito {
    private double valor_interes_total;

    public CreditoEmpresarial() {
    }

    public CreditoEmpresarial(double monto, double interes, int plazo) {
        super(monto, interes, plazo);
	    this.valor_interes_total=valor_interes_total;
    }

    public double getValor_interes_total() {
        return valor_interes_total;
    }

    public void setValor_interes_total(double valor_interes_total) {
        this.valor_interes_total = valor_interes_total;
    }
 
     @Override // Forzar al compilador a revisar que se este sobrescribiendo correctamente el metodo
	public double calcular_cuota(){
        double cuota;
        cuota=(this.getMonto()+this.valor_interes_total)/this.getPlazo();
        return cuota;
    }
       
}
