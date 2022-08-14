
package interfaces;


public class Humano implements AccionesGeneral,AccionesHumano{
    private String documento;
    
    public void setDocumento(String documento){
    this.documento=documento;
    }
    
    public String getDocumento(){
    return documento;
    }
    
    public void razonar(){
    System.out.println("El Humano con documento: "+this.documento+" Está Razonando");
    }
    
    @Override
    public void desplazar(){
    System.out.println("El Humano con documento: "+this.documento+" Se está Desplazando");
    }
    
    
    @Override
    public void jugar(){
    System.out.println("El Humano con documento: "+this.documento+" Está Jugando");
    }
    
    @Override
    public void alimentar(){
    System.out.println("El Humano con documento: "+this.documento+" Se esta Alimentando");
    }
    
    @Override
    public void dormir(){
    }
    
    @Override
    public void trabajar(){
    System.out.println("El Humano con documento: "+this.documento+" Está Trabajando");
    }
    
    @Override
    public void estudiar(){
    }
}




