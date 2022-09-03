/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author USUARIO
 */
public class Conexion_mysql {
    private String usuario;
    private String clave;
    private String url;
    private String driver;

    
    public Conexion_mysql(String usuario, String clave, String url, String driver) {
        this.usuario = usuario;
        this.clave = clave;
        this.url = url;
        this.driver = driver;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    public void abrir_bd(){}
    
    
}
