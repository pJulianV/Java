package tiposempleados;

public class JefeDeZona extends Empleado{
    private String despacho;
    private String email;

    public JefeDeZona(String despacho, String email) {
        this.despacho = despacho;
        this.email = email;
    }

    public JefeDeZona(String despacho, String email, String nombre, String apellido, String direccion, String salario) {
        super(nombre, apellido, direccion, salario);
        this.despacho = despacho;
        this.email = email;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void imprimir(){
        System.out.println( despacho + " || " + email);
    }
}
