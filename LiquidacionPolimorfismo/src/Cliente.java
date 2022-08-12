// 1
package LiquidacionPolimorfismo.src;
// * Para los clientes,

// se conoce el documento de identidad, de tipo long, nombre de
// tipo String, correo electrónico de tipo String, número de celular de tipo int
// y la
// dirección, de tipo String, que presenta para comunicaciones y extractos,
// ! no se definen métodos u operaciones para esta clase

public class Cliente {
    private long documentoIdentidad;
    private String nombre;
    private int numeroCelular;
    private String direccion;
    
    public Cliente(){
    }

    public Cliente(long documentoIdentidad, String nombre, int numeroCelular, String direccion) {
        this.documentoIdentidad = documentoIdentidad;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.direccion = direccion;
    }

    public void setDocumentoIdentidad(long documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
    public long getDocumentoIdentidad(){
        return documentoIdentidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
    public int getNumeroCelular(){
        return numeroCelular;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }
}
