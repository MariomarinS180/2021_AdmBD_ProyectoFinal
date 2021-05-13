/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import sistemaempleados.ConexionSQLServer;

/**
 *
 * @author marin
 */
public class EmpleadosDAO {
    
     public boolean agregarUsuario(InicioDeSesion i){
        String sql = "INSERT INTO usuarios2 VALUES('"+i.getUsuario()+"', '"+i.getPassword()+"');";
        return new ConexionSQLServer().ejecutarInstruccion(sql); 
    }
    
}
