/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaempleados;
import Interfaces.Loggin;
import java.sql.*; 
import javax.swing.*;

public class ConexionSQLServer {
    private String r;
    static Connection con;
    private static PreparedStatement ps;
    private static ResultSet rs;
    private Statement stm; 
    
      public static Connection getConnection(){
        String url = "jdbc:sqlserver://localhost:1433;databaseName=employees";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion" + e.getMessage(),"Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        try {
            con = DriverManager.getConnection(url,"marin","jerez2021");
        } catch (SQLException e) {
        }
        return con;
    }
    
    
    public static void main(String[] args) {
        Loggin.main(args);
        
        /*
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
            String url = "jdbc:sqlserver://localhost:1433;databaseName=employees"; 
            Connection conexion  = DriverManager.getConnection(url, "marin", "jerez2021"); 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
    } 
*/
        
    }
}
