package honorariodocente;

public class Docente {
    private long documento;
    private String nombre;
    private int categoria;
    private int horas;
    
    public Docente(){}
    public Docente(long documento, String nombre, int categoria, int horas){
        this.documento = documento;
        this.nombre = nombre;
        this.categoria = categoria;
        this.horas = horas;
    }
    public void setDocumento(long documento){
        this.documento = documento;
    }
    public long getDocumento(){
        return documento;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCategoria(int categoria){
        this.categoria = categoria;
    }
    public int getCategoria(){
        return categoria;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }
    public int getHoras(){
        return horas;
    }
    public double calcular_honorarios(){
        double honorarios = 0;
        switch (this.categoria){
            case 1: honorarios = this.horas * 25000; break;
            case 2: honorarios = this.horas * 35000; break;
            case 3: honorarios = this.horas * 45000; break;
        }
        return honorarios;
    }      
}
