package universidadulp.acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author johan
 */
public class Conexion {
    
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root"; 
    private final String PASSWORD = "";
    private final String DATABASE = "universidadulp";
    private final String DRIVER = "org.mariadb.jdbc.Driver";
    
    protected void conectarBase() throws Exception {  
        try {
            Class.forName(DRIVER);  
            String url = "jdbc:mariadb://localhost/" + DATABASE ;
            conexion = DriverManager.getConnection(url, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al conectar a la base de datos");
            System.out.println(e.getMessage());
            throw  e;
        }
    }
 

    protected ResultSet consultarBase(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            return resultado;
        } catch (Exception e) {
            System.out.println("Error al consultar la Base de Datos");
            throw e;
        }
    }
    
    protected void modificarBase(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Error al ejecutar modificacion");
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    protected void desconectarBase() throws Exception {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al desconectar Base");
            throw e;
        }
    }
}
