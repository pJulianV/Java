
package arrayconductores;

public class Conductores {
    
    //Definicion de atributos
    private long cedula;
    private String nombre;
    private int clase;
    private double pasajes,encomiendas;
    
    //Constructores
    public Conductores(){
     }
    public Conductores(long cedula, String nombre, int clase, double pasajes, double encomiendas){
        this.nombre=nombre;
        this.cedula=cedula;
        this.clase=clase;
        this.pasajes=pasajes;
        this.encomiendas=encomiendas;
    }
    //Encapsulamiento
     public void setCedula(long cedula){
        this.cedula=cedula;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;        
    }
    public void setClase(int clase){
        this.clase=clase;
    }
    public void setPasajes(double pasajes){
        this.pasajes=pasajes;
    }
    public void setEncomiendas(double encomiendas){
        this.encomiendas=encomiendas;
    }
    //Encapsulamiento para enviar información
    public long getCedula(){
        return cedula;
    }
    public String getNombre(){
        return nombre;
    }
    public int getClase(){
        return clase;
    }
    public double getPasajes(){
        return pasajes;
    }
    public double getEncomiendas(){
        return encomiendas;
    }
    public double liquidar_comision() {
        double comision;
        if (this.clase==1){
            comision=this.pasajes*0.20;
        }
        else {
            comision=this.encomiendas*0.10;
        }
        return comision;
    }
    // Mas funciones  x o y 
}
