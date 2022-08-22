package tiposempleados;


public class Secretario extends Empleado{
    private String despacho;
    private String telefono;

    public Secretario(String despacho, String telefono) {
        this.despacho = despacho;
        this.telefono = telefono;
    }

    public Secretario(String despacho, String telefono, String nombre, String apellido, String direccion, String salario) {
        super(nombre, apellido, direccion, salario);
        this.despacho = despacho;
        this.telefono = telefono;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public void imprimir(){
        System.out.println(despacho + " || " + telefono);
    }
}
