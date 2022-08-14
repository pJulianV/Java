
package par_impar_positivo_negativo;


public class Pares_impares_positivos_negativos {
    //Declarar Atributo
    int numero;
    //Métodos
    public Pares_impares_positivos_negativos(int numero)
    {
    this.numero=numero;    
    }
    public String par_impar()
    {
    String mensaje;
    if(this.numero%2==0)
    {
    mensaje="El número: "+this.numero+" es PAR";
    }
    else
    {
    mensaje="El número: "+this.numero+" es IMPAR";
    }
    return mensaje;
    }
    
    public String positivo_negativo()
    {
    String mensaje;
    if(this.numero>0)
    {
    mensaje="El número: "+this.numero+" es POSITIVO";
    }
    else if(this.numero<0)
    {
    mensaje="El número: "+this.numero+" es NEGATIVO";
    }
    else
    {
    mensaje="El número: "+this.numero+" es CERO";
    }
    return mensaje;
    }
}
