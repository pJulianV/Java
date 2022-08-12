/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getset;

// clase publica
public class vendedor {
    // atributos privados - solo estan disponibles en la clase
    private long documento;
    private int tipo;
    private double ventas;

    // metodos publicos - usarse en otros programas y clases
    public vendedor(){   
    }
    // Constructor
    public vendedor(long documento, int tipo, double ventas){
        this.documento = documento;
        this.tipo = tipo;
        this.ventas = ventas;
    }

    //Metodos constructores
        // -Set = asignarle a variables de clase variables externas (un nuevo objeto)
        // -Get = returnar documento
    // Esto se hace cuando los atributos son privados

    public void setDocumento(long documento){// Void = Vacio
        this.documento = documento;
    }
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    public void setVentas(double ventas){
        this.ventas = ventas;
    }

    public long getDocumento(){
        return documento;
    }

    public int getTipo(){
        return tipo;
    }
    public double getVentas(){
        return ventas;
    }
    public double calcularComision(){
        double comision;
        if (tipo==1) comision = ventas * 0.25; 
        else comision = ventas * 0.20;
        return comision;
    }
}
