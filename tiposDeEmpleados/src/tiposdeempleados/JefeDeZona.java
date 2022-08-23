package tiposdeempleados;

public class JefeDeZona extends Empleado{
    private String despacho;
    private String secretario;
    private String listaVendedores;
    private String cocheEmpresa;

    public JefeDeZona(String despacho, String secretario, String listaVendedores, String cocheEmpresa) {
        this.despacho = despacho;
        this.secretario = secretario;
        this.listaVendedores = listaVendedores;
        this.cocheEmpresa = cocheEmpresa;
    }

    public JefeDeZona(String despacho, String secretario, String listaVendedores,
            String cocheEmpresa, String nombre, String apellido, String dni, 
            String direccion, String añosEmpresa, String telefono, double salario) {
        super(nombre, apellido, dni, direccion, añosEmpresa, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.listaVendedores = listaVendedores;
        this.cocheEmpresa = cocheEmpresa;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getSecretario() {
        return secretario;
    }

    public void setSecretario(String secretario) {
        this.secretario = secretario;
    }

    public String getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(String listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public String getCocheEmpresa() {
        return cocheEmpresa;
    }

    public void setCocheEmpresa(String cocheEmpresa) {
        this.cocheEmpresa = cocheEmpresa;
    }

    public double incrementarSalario(){
        return this.salario + this.salario * 0.2;
    } 
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Jefe de zona "+ despacho+ "||" + secretario+ "||" + 
                listaVendedores + "||" + cocheEmpresa);
    }
    
    public void cambiarSecretario(){
        System.out.println(nombre + " ha cambiado de secretario\n");
    }
    public void cambiarCoche(){
        System.out.println(nombre + " ha cambiado de coche\n");
    }
    public void DarDeAltaVendedor(){
        System.out.println(nombre + " ha dado de alta a un vendedor; Bien hecho\n");
    }
    public void DarDeBajaVendedor(){
        System.out.println(nombre + " ha dado de baja a un vendedor...\n");
    }
}
