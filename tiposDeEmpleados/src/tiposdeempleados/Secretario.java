package tiposdeempleados;

public class Secretario extends Empleado{
    private String despacho;
    private String numFax;
    // Resive +5 % en el salario Anual

    
    public Secretario(String despacho, String numFax) {
        this.despacho = despacho;
        this.numFax = numFax;
    }

    public Secretario(String despacho, String numFax, String nombre, String 
            apellido, String dni, String direccion, String añosEmpresa, String 
                    telefono, double salario) {
        super(nombre, apellido, dni, direccion, añosEmpresa, telefono, salario);
        this.despacho = despacho;
        this.numFax = numFax;
    }
    

    public String getDespacho(){
        return despacho;
    }
    public void setDespacho(String despacho){
        this.despacho = despacho;
    }

    public String getNumFax() {
        return numFax;
    }

    public void setNumFax(String numFax) {
        this.numFax = numFax;
    }
    
    public double incrementarSalario(){ 
        return salario + salario * 0.05;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Secretario: " + despacho + "||" + numFax);
    }
    
}
