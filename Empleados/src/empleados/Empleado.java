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
public abstract class Empleado { /* con mayusculo porfa la clase por buenas practicas */
    private String apellido;
    private String direccion;
    private String nombre;
    private String telefono;
    private String dni;
    private int años ;
    double salario ;
    
    public Empleado(String apellido, String direccion, String nombre, 
            String telefono, String dni, int años, double salario) {
        this.apellido = apellido;
        this.direccion = direccion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.dni = dni;
        this.años = años;
        this.salario = salario;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDni() {
        return dni;
    }
    public int getAños() {
        return años;
    }
    public double getSalario() {
        return salario;
    }
    public void imprimir() {
        System.out.println(nombre+" || "+apellido+" || "+direccion+" || "+
                telefono+" || "+dni+" || " +años+ "||"+salario);
    }
}

