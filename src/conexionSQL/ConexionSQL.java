/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class ConexionSQL {
    Connection conectar = null;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bd_sistemas?verifyServerCertificate=false&useSSL=true", "root","291282");
            System.out.println("conexion exitosa a la BD");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        
        return conectar;
    }
}
