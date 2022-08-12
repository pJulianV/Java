package JavaPolimorfismo.src.javapolimorfismo;

public class Cuadrado {
    private double lado;
    public Cuadrado (){
    }
    public Cuadrado (double lado){
        this.lado = lado;
    }
    public double getArea(){
        return lado;
    }
    public void setArea(double lado){
        this.lado = lado;
    }
    public double area(){
        return Math.pow(this.lado,2);
    }
    public double perimetro(){
        return 4 * this.lado;
    }
}