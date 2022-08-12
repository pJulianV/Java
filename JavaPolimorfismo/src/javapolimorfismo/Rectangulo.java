package JavaPolimorfismo.src.javapolimorfismo;

public class Rectangulo {
    private double base;
    private double altura;
    public Rectangulo(){}
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getBase(double base){
        return base;
    }
    public double getAltura(double altura){
        return altura;
    }
        public double area(){
        return this.base * this.altura ;
    }
        public double perimetro(){
        return this.base * 2 + this.altura * 2;
    }
}