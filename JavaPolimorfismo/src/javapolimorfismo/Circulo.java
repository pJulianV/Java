package JavaPolimorfismo.src.javapolimorfismo;

public class Circulo {
    private double radio;
    public Circulo(){
    }
    public Circulo(double radio){
        this.radio = radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getRadio(double radio){
        return radio;
    }
    public double area(){
        return Math.PI*Math.pow(this.radio,2);
    }
    public double perimetro(){
        return 2 * Math.PI*this.radio;
    }
}
