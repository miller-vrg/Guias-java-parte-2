package coneccion;

import java.sql.*;

/**
 *
 * @author miller vargas mola
 * 
 */

public class Conector {

    private static String url = "jdbc:mariadb://localhost:3306/ejercicio1?";
    private static String user = "user=pruebas&";
    private static String password = "password=milla";
    
public static Connection getConexion() throws SQLException{
    
return DriverManager.getConnection(url+user+password);

}

}
