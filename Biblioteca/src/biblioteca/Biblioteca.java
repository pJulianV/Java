package biblioteca;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Scanner;
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String usuario, clave, url, driver, sql;
        
        Connection con= null;
        Statement stmt = null;
        ResultSet rs = null;
        
        usuario = "root";
        clave = "1234";
        url = "jdbc:mysql://localhost:3306/biblioteca_g91";
        driver = "com.mysql.cj.jdbc.Driver";
        
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en el Driver");
            System.exit(0);
        }
        try {
            con = DriverManager.getConnection(url, usuario, clave);
        } catch (SQLException ex){
            System.out.println("Error en la Conexion");
            System.exit(0);
        }
        try {
            stmt = con.createStatement();
        } catch (SQLException ex){
            System.out.println("Error en el Statement");
            System.exit(0);
        }
        sql = "Insert into tema values ('12', 'TEMA12' )";
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error en la sentencia SQL");
            System.exit(0);
        }
        try {
            stmt = con.createStatement();
        } catch (SQLException ex){
            System.out.println("Eror en el Statement");
            System.exit(0);
        }
        sql= "select * form tema";
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex){
            System.out.println("Error en la sentencia SQL");
            System.exit(0);            
        }
        try {
            while(rs.next()){
            System.out.println("Codigo tema: "+ rs.getString("codigo_tem"));
            System.out.println("Nombre tema: "+ rs.getString("nombre_tem"));
            }
        } catch(SQLException ex) {
            System.out.println("Error en la tabla Tema");
            System.exit(0);
        }
            
    }
    
}
