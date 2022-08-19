
package jerarquiaempresa;

public class Empleado {
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;

    public Empleado(){}
    public Empleado(String nombre, String apellido, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    public String getDireccion() {
        return Direccion;
    }
}
