package sistemaempleados;

import java.sql.CallableStatement;
import java.sql.SQLException; 

public class Procedimientos {
    public static void InsertarUsuarios(String u, String p)throws SQLException{
        CallableStatement entrada  = ConexionSQLServer.getConnection().prepareCall("{Call RegistrarUsuarios(?,?)}"); 
        entrada.setString(1, u);
        entrada.setString(2, p);
        entrada.execute(); 
    }
}
