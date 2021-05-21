package sistemaempleados;

import java.sql.CallableStatement;
import java.sql.SQLException; 
import java.sql.Date; 

public class Procedimientos {
    
    public static void InsertarUsuarios(String u, String p)throws SQLException{
        CallableStatement entrada  = ConexionSQLServer.getConnection().prepareCall("{Call RegistrarUsuarios(?,?)}"); 
        entrada.setString(1, u);
        entrada.setString(2, p);
        entrada.execute(); 
    }
    
    public static void InsertarEmpleados(String fecha_nacimiento, String nombre, String apellido, String genero, String fecha_contratacion ) throws SQLException{
       CallableStatement e = ConexionSQLServer.getConnection().prepareCall("{Call RegistraEmpleados (?,?,?,?,?)}");
       e.setString(1, fecha_nacimiento);
       e.setString(2, nombre);
       e.setString(3, apellido);
       e.setString(4, genero);
       e.setString(5, fecha_contratacion);
       e.execute(); 
    }
}
