package interfaces;


public class Animal implements AccionesGeneral{
    private String raza;
    
    public void setRaza(String raza){
    this.raza=raza;
    }
    
    public String getRaza(){
    return raza;
    }
    
    public void cazar(){
    System.out.println("El Animal de raza: "+this.raza+" Está Cazando");
    }
    
    @Override
    public void desplazar(){
    System.out.println("El Animal de raza: "+this.raza+" Se está Desplazando");
    }
    
    
    @Override
    public void jugar(){
    System.out.println("El Animal de raza: "+this.raza+" Está Jugando");
    }
    
    @Override
    public void alimentar(){
    }
    
    @Override
    public void dormir(){
    }
}
