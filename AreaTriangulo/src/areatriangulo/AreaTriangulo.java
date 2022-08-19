package areatriangulo;

import java.io.*;
import javax.swing.*;

public class AreaTriangulo {
    
    public static void main(String[] args) {
        int base, altura;
        double area;
        String nombre;
        nombre = String.parseString(JOptionPane.showInputDialog(null, "Ingres su nombre"));
        JOptionPane.showMessageDialog(null, "Hola "+ nombre);
        base = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base del triangulo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese altura del triangulo"));
        area = base * altura / 2;
        JOptionPane.showMessageDialog(null, "El area del triangulo es " + area);
    }
    
}
