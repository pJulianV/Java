/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaCreditos.src.herenciacreditos;

/**
 *
 * @author USUARIO
 */
public class CreditoEmpresarial extends Credito{
    private double valorInteres;
    
    public CreditoEmpresarial() {
    }
    
    public CreditoEmpresarial(double monto, double interes,int plazo ){
        super(monto, interes, plazo);
    }
    public CreditoEmpresarial(double valorInteres, double monto, double interes, int plazo){
        super(monto, interes, plazo);
        this.valorInteres = valorInteres;
    }
    public void setValorInteres(double valorInteres){
        this.valorInteres = valorInteres;
    }
    public double getValorInteres(){
        return valorInteres;
    }
    public double calcularCuota(){
        double cuota;
        cuota = (this.getMonto() + this.valorInteres)/this.getPlazo();
        return cuota;
    }
}
