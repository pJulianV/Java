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
public class CreditoEspecial extends Credito{

    public CreditoEspecial(){
    }
    public CreditoEspecial( double monto, double interes, int plazo){
        super(monto, interes, plazo);
    }
    public double calcularCuota (){
        double cuota;
        cuota = this.getMonto()/this.getPlazo();
        return cuota;
    }
}