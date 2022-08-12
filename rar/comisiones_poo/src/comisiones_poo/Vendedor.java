package comisiones_poo;

public class Vendedor {
    /* Atributos de la clase Vendedor */
    long documento;
    int tipo;
    double ventas;
    /* Métodos de la clase Vendedor */
    public Vendedor(long doc,int tipo,double ven)
    {
    this.documento=doc;
    this.tipo=tipo;
    this.ventas=ven;
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
