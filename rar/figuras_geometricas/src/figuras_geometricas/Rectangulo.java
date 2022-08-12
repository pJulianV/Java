package figuras_geometricas;

public class Rectangulo {
    
    private double base;
    private double altura;
    
    public Rectangulo(){
    }
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
       public double area(){
           double a;
           a=this.base*this.altura;
           return a;
    }
       public double perimetro(){
           double p;
           p=2*this.base*this.altura;
           return p;
}
}