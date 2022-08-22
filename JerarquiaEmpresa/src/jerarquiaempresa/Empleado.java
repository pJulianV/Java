
package jerarquiaempresa;

public abstract class Empleado {
    String nombre; // El nombre no es privado porque lo queremos modificar
    private String apellido;
    private String dni;
    private String direccion;
    private String añosEmpresa;
    private String telefono;
    double salario; // El salario no es privado porque lo queremos modificar
    

    public Empleado(){}
    public Empleado(String nombre, String apellido, String dni, String direccion,
            String añosEmpresa, String telefono, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.añosEmpresa = añosEmpresa;
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
    
    public String getAñosEmpresa() {
        return añosEmpresa;
    }

    public void setAñosEmpresa(String añosEmpresa) {
        this.añosEmpresa = añosEmpresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimir(){
        System.out.println(this.nombre + " || " + this.apellido + " || " + this.dni + " || " + 
                this.direccion + " || " + this.añosEmpresa + " || " + this.telefono + " || " + 
                this.salario);
    }
}
