
package interfaces;

public class Hombre extends Humano{
    private String nombre;

        public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public void razonar(){
    System.out.println("El Humano con Nombre: "+this.nombre+" Está Razonando");
    }
    
    @Override
    public void desplazar(){
    System.out.println("El Humano con Nombre: "+this.nombre+" Se está Desplazando");
    }
    
    @Override
    public void trabajar(){
    System.out.println("El Humano con Nombre: "+this.nombre+" Está Trabajando");
    }
}
