
package figuras_geometricas;

public class Cuadrado {
    private double lado;

    public Cuadrado(){
    
    }
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double area(){
    double a;
    a=Math.pow(this.lado,2);
    return a;
    }
    public double perimetro(){
    double p;
    p=4*this.lado;
    return p;
    
    }
    
    
}
