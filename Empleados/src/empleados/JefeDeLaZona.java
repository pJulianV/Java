/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author USUARIO
 */
public class JefeDeLaZona extends Empleado {
    public JefeDeLaZona(String secreTarioAcargo, String listaVende, String apellido, String direccion, String
    nombre, String telefono, String dni, int años, double salario) {
        super(apellido, direccion, nombre, telefono, dni, años, salario);
        this.secretarioAcargo = secreTarioAcargo;
        this.listaVende = listaVende;
    }

    private String secretarioAcargo, listaVende;
    public void imprimir() {
        super.imprimir();
        System.out.println(secretarioAcargo+" -- "+listaVende);
    }
    public void cambiarSecretario(){}
    public void cambiarCarro(){}
    public void darAlta(){}
    public void darBaja(){}

    public double incrementoSalario() {
        return salario*0.2+salario;
    }
    public String getSecretarioAcargo() {
        return secretarioAcargo;
    }
    public String getListaVende() {
        return listaVende;
    }
    public double getSalario() {
        return salario;
    }
    void salario(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated
    }
}
