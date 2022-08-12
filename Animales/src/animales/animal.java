/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales;
/**
 *
 * @author USUARIO
 */
public class animal {
    private String nombre;
    private String especie;
    private int clasificacion;

    public animal(String nombre, String especie, int clasificacion) {
        this.nombre = nombre;
        this.especie = especie;
        this.clasificacion = clasificacion;
    }

    // Se debe crear métodos getAtributo y setAtributo para cada atributo. El método setAtributo
    // para asignar al this.atributo el parámetro que recibe el constructor y el método getAtributo
    // para retornar el atributo y poder obtener su valor.

    // Set invo
    public void setNombre(String nombre) {
        this.nombre = nombre ;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public void setClasificacion(int clasificacion){
        this.clasificacion = clasificacion;
    }

    public String getNombre(){
        // Guardar en una base de datos
        return nombre;
    }
    public String getEspecie(){
        return especie;
    }
    public String getClasificacion(){
        if (clasificacion == 1) return "Mamifero";
        else if (clasificacion == 2) return "Ave";
        else if (clasificacion == 3) return "Pez :>";
        else if (clasificacion == 4) return "Anfibio";
        else return "Reptil";
    }
    /**
     * @param args the command line arguments
     */
    public String sentarse(){
        double rnum;
        String desicion;
        rnum = Math.random();
        if (rnum % 2 == 0 ){
            desicion = "se sento :>";
        }
        else{
            desicion = "no quiere setarce";
        }
        return desicion;

    }
    
}
