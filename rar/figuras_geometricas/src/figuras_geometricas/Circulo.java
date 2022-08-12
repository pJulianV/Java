package figuras_geometricas;

public class Circulo {
  private double radio;
public Circulo(){
}  
public Circulo(double radio) {
    this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double area(){
        double a;
        a=Math.PI*Math.pow(this.radio, 2);
        return a;
    }
public double perimetro(){
        double p;
        p=2*Math.PI*this.radio;
        return p;
}
}
