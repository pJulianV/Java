package parimparpositivonegativo;

public class numeroEntero{
    // Asignar atributos
    int num;


    // Metodos
    
    // constructor, darle una variable a un atributo
    public numeroEntero(int num){
        this.num = num;
    }

    public String par_impar(){
        String mensaje;
        if (this.num % 2 == 0) mensaje = this.num + " es Par";
        else mensaje= this.num + " inpar";
        return mensaje;
    }
    public String positivo_negativo(){
        String mensaje;
        if (num < 0) mensaje= this.num +" Negativo";
        else if (num > 0) mensaje= this.num +" Positivo";
        else mensaje = this.num +" Cero";
        return mensaje;
    }
    public String primo(){
        int cMultiplos = 0;
        for(int i = 1; i < this.num; i++){
            if (this.num % i == 0){
                // System.out.println(this. num +"%"+ i +" = 0");
                cMultiplos += 1;
            }else{
                continue;
            }
        }
        if (cMultiplos >2) return this.num +" no es primo";
        else return this.num + " es primo";
    }
}