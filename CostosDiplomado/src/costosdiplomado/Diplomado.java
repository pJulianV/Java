package costosdiplomado;

public class Diplomado {
    private double matricula;
    private double docencia;
    private double plataforma;
    private double admon;
    private int grupos;
    
    public Diplomado(){}

    public Diplomado(double matricula, double docencia, double plataforma, 
            double admon, int grupos) {
        this.matricula = matricula;
        this.docencia = docencia;
        this.plataforma = plataforma;
        this.admon = admon;
        this.grupos = grupos;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public double getDocencia() {
        return docencia;
    }

    public void setDocencia(double docencia) {
        this.docencia = docencia;
    }

    public double getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(double plataforma) {
        this.plataforma = plataforma;
    }

    public double getAdmon() {
        return admon;
    }

    public void setAdmon(double admon) {
        this.admon = admon;
    }

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }
    
    public double calcular_ingreso(){
        double ingresos;
        ingresos = this.matricula * this.grupos * 8;
        return ingresos;
    }
    
    public double calcular_gastos(){
        double gastos;
        gastos = (this.docencia + this.plataforma + this.admon)*this.grupos;
        return gastos;
    }
}
