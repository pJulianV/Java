
package clase_abstracta;

public abstract class Credito {
    private double monto;
    private double interes;
    private int plazo;

    public Credito(){
    }
    
    public Credito(double monto, double interes, int plazo) {
        this.monto = monto;
        this.interes = interes;
        this.plazo = plazo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
	//Declaracion del metodo abstracto
	public abstract double calcular_cuota();
    
 }
