package tiposempleados;

public class Vendedor extends Empleado{
    private String areaVenta;
    private String comision;
    
    public Vendedor (){
    }
    
    public Vendedor (String nombre, String apellido, String direccion, String 
            salario, String areaVenta, String comision){
        super(nombre, apellido, direccion ,salario);
        this.areaVenta = areaVenta;
        this.comision = comision;   
    }
    
    public String getAreaVenta() {
        return areaVenta;
    }
    public void setAreaVenta(String areaVenta){
        this.areaVenta = areaVenta;
    }
    
    public String getComision(){
        return comision;
    }
    public void setComision(String comision){
        this.comision = comision;
    }
    
    @Override
    public void imprimir(){
        System.out.println( areaVenta + " || " + comision );
    }
}
// Hola