package comisiones_set_get;

public class Vendedor {
    //Atributos privados ===> Encapsulamiento
    private long documento;
    private int tipo;
    private double ventas;
    //Constructores y Métodos 
    public Vendedor()
    {
    }
    public Vendedor(long documento, int tipo, double ventas) {
        this.documento = documento;
        this.tipo = tipo;
        this.ventas = ventas;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public long getDocumento() {
        return documento;
    }

    public int getTipo() {
        return tipo;
    }

    public double getVentas() {
        return ventas;
    }
    
    public double calcular_comision()
    {
        double comision;
        if(this.tipo==1)
        {
            comision=this.ventas*0.25;
        }
        else
        {
            comision=this.ventas*0.20;
        }
        return comision;
              
    }
}
