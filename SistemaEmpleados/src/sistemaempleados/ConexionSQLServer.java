/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaempleados;
import Interfaces.Loggin;
import java.sql.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class ConexionSQLServer {
    private String r;
    static Connection con;
    private static PreparedStatement ps;
    private static ResultSet rs;
    private Statement stm; 
    
      public static Connection getConnection(){
        String url = "jdbc:sqlserver://localhost:1433;databaseName=empleados";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion" + e.getMessage(),"Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        try {
            con = DriverManager.getConnection(url,"mario","jereztec2021");
        } catch (SQLException e) {
        }
        return con;
    }
       public boolean ejecutarInstruccion2(String sql){
        boolean res = false;
        try {
            stm = con.createStatement(); 
            stm.execute(sql); 
            res = true;  
        } catch (Exception ex) {
           Logger.getLogger(ConexionSQLServer.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (Exception ex) {
             Logger.getLogger(ConexionSQLServer.class.getName()).log(Level.SEVERE, null, ex);    
            }
        }
        return res; 
    }
       
      public boolean ejecutarInstruccion(String sql){
        boolean res = false;
        try {
            stm = con.createStatement(); 
            stm.execute(sql); 
            res = true;  
        } catch (Exception ex) {
           //Logger.getLogger(ConexionSQLServer.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (Exception ex) {
             //Logger.getLogger(ConexionSQLServer.class.getName()).log(Level.SEVERE, null, ex);    
            }
        }
        return res; 
    }
      
     public static ResultSet Consulta(String consulta){
        Connection con = getConnection();
        Statement declara;
        try{
            declara=con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
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
