/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import sistemaempleados.ConexionSQLServer;
import Modelo.Empleados; 

/**
 *
 * @author marin
 */
public class EmpleadosDAO {
    
     public boolean agregarUsuario(InicioDeSesion i){
        String sql = "INSERT INTO usuarios2 VALUES('"+i.getUsuario()+"', '"+i.getPassword()+"');";
        return new ConexionSQLServer().ejecutarInstruccion(sql); 
    }
    public boolean modificarEmpleado(Empleados e){
        String sql = "update employees set nombre='"+e.getNombre()+"', apellido='"+e.getApellido()+"', '"+e.getGenero()+"' where emp_no= "+e.getEmp_no()+""; 
        return new ConexionSQLServer().ejecutarInstruccion(sql); 
    }
    public boolean eliminarEmpleado(String codigoLibro) {
		String sql = "DELETE FROM employees WHERE emp_no = '"+codigoLibro+"'";
		return new ConexionSQLServer().ejecutarInstruccion(sql); 
	}
    
}
