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
    public static void InsertarEmpleados(Date fecha_nacimiento, String nombre, String apellido, String genero1, String fecha_contratacion ) throws SQLException{
       CallableStatement e = ConexionSQLServer.getConnection().prepareCall("{Call RegistraEmpleados(?,?,?,?,?)}");
       e.setDate(1, fecha_nacimiento);
       e.setString(2, nombre);
       e.setString(3, apellido);
       e.setString(4, genero1);
       e.setString(5, fecha_contratacion);
       e.execute(); 
    }
    public static void InsertarSalario(int empleado, int salario, String partir_fecha, Date hasta_fecha)throws SQLException{
       CallableStatement e = ConexionSQLServer.getConnection().prepareCall("{Call RegistrarSalario(?,?,?,?)}");
       e.setInt(1, empleado);
       e.setInt(2, salario);
       e.setString(3, partir_fecha);
       e.setDate(4, hasta_fecha);
       e.execute();  
    }
    public static void InsertarTitulos(int empleado, String titulo, String partir_fecha, Date hasta_fecha  )throws SQLException{
       CallableStatement e = ConexionSQLServer.getConnection().prepareCall("{Call RegistrarTitulo2(?,?,?,?)}"); 
       e.setInt(1, empleado);
       e.setString(2, titulo);
       e.setString(3, partir_fecha);
       e.setDate(4, hasta_fecha);
       e.execute();  
    }
    public static void ModificarEmpleado(int emp, String nombre, String apellido, String genero1) throws SQLException{
      CallableStatement e = ConexionSQLServer.getConnection().prepareCall("{Call actualizarEmpleadoo(?,?,?.?)}");
      e.setInt(1, emp);
      e.setString(2, nombre);
      e.setString(3, apellido);
      e.setString(4, genero1);
      e.execute(); 
    }
}
