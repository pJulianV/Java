
package jerarquiaempresa;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    private String salario;
    private String añosEmpresa;

    public Empleado(){}
    public Empleado(String nombre, String apellido, String dni, String direccion,
            String telefono, String salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getAñosEmpresa() {
        return añosEmpresa;
    }

    public void setAñosEmpresa(String añosEmpresa) {
        this.añosEmpresa = añosEmpresa;
    }
    public void imprimir(){
        System.out.println(nombre + " || " + apellido + " || " + dni + " || " + 
                direccion + " || " + telefono + " || " + salario);
    }
}
