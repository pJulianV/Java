
package tiposempleados;

public class Empleado {
    private String nombre;
    private String apellido;
    private String direccion;
    private String salario;

    public Empleado(){}
    public Empleado(String nombre, String apellido, String direccion,
            String salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public void imprimir(){
        System.out.println(nombre + " || " + apellido + " || " + " || " + 
                direccion + " || " + salario);
    }
}
