package tiposdeempleados;

public class Vendedor extends Empleado{
    private String cocheEmpresa;
    private String telefonoMovil;
    private String areaVenta;
    private String listaCliente;
    private String porcentaje;

    public Vendedor(String cocheEmpresa, String telefonoMovil, String areaVenta,
            String listaCliente, String porcentaje) {
        this.cocheEmpresa = cocheEmpresa;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
        this.listaCliente = listaCliente;
        this.porcentaje = porcentaje;
    }

    public Vendedor(String cocheEmpresa, String telefonoMovil, String areaVenta,
            String listaCliente, String porcentaje, String nombre, String apellido,
            String dni, String direccion, String añosEmpresa, String telefono, double salario) {
        super(nombre, apellido, dni, direccion, añosEmpresa, telefono, salario);
        this.cocheEmpresa = cocheEmpresa;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
        this.listaCliente = listaCliente;
        this.porcentaje = porcentaje;
    }

    public String getCocheEmpresa() {
        return cocheEmpresa;
    }

    public void setCocheEmpresa(String cocheEmpresa) {
        this.cocheEmpresa = cocheEmpresa;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getAreaVenta() {
        return areaVenta;
    }

    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    public String getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(String listaCliente) {
        this.listaCliente = listaCliente;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
    public double incrementarSalario(){
        return salario + salario * 0.1;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Vendedor "+ cocheEmpresa + " || " + telefonoMovil + " || " + areaVenta
             + " || " + listaCliente + " || " +  porcentaje);
    }
    
    public void darDeAltaCliente(){//Seria mejor tener un contador de clientes que le quedan y guardarlos en una base de datos
        System.out.println(this.nombre + " a dado de alta a un nuevo cliente; En hora buena.\n");
    }
    
    public void darDeBajaCliente(){
        System.out.println(this.nombre +" a dado de baja un cliente...\n");
    }
    
    public void cambiarCoche(){
        System.out.println(this.nombre + " cambio de coche.\n"); // Contador de cuantas veces a cambiado de coche
    }
    
}
