package biblioteca;

public class Sql_mysql {
    public String sql;
    public String conexion;

    public Sql_mysql(String sql, String conexion) {
        this.sql = sql;
        this.conexion = conexion;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }
    public void realiza_actualizacion(){}
    
    public void realiza_consulta(){}
}
