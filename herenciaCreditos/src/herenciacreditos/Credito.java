package herenciaCreditos.src.herenciacreditos;

public class Credito {
    private double monto;
    private double interes;
    private int plazo; 
    public Credito(){
    }
    public Credito (double monto, double interes, int plazo){
    this.monto = monto;
    this.interes = interes;
    this.plazo = plazo;
    }
    // * Set requiere parametros
    public void setMonto(double monto){
        this.monto = monto;
    }
    public double getMonto(){
        return monto;
    }
    public void setInteres( double interes ){
        this.interes = interes;
    }
    public double getInteres(){
        return interes;
    }
    public void setPlazo(int plazo){
        this.plazo = plazo;
    }
    public int getPlazo(){
        return plazo;
    }
}
