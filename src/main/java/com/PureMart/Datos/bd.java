
package com.PureMart.Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jorge-LP
 */
public class bd {

    public bd() {
    }

    public Connection obtieneConexionMysql() {
        Connection c = null;
        String usu = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/puremart";
        
        try {
            //Registrar el Driver de Conexion
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            c = DriverManager.getConnection(url,usu,clave);
        } catch (SQLException ex) {
            System.out.println("Error en conexion mysql "+ ex);
        }
                
        return c;

    }

}
