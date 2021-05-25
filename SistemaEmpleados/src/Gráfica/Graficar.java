/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gráfica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import sistemaempleados.ConexionSQLServer;

/**
 *
 * @author marin
 */
public class Graficar {
    Connection con = ConexionSQLServer.getConnection(); 
 
    
    public DefaultTableModel mostrarCantidadGeneros(){
        DefaultTableModel miModelo = null; 
        try {
            String columnas []= {"Genero", "Empleados"}; 
            String datos [] = new String[2]; 
            miModelo = new DefaultTableModel(null, columnas); 
            String sql = "select Genero, COUNT(*) as Empleados from employees group by genero";
            PreparedStatement pst = con.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery(); 
            while(rs.next()){
                datos[0] = rs.getString("Genero"); 
                datos[1] = rs.getString("Empleados"); 
                miModelo.addRow(datos);
            }
        } catch (Exception e) {
        e.printStackTrace();
        }   
        return miModelo; 
    }
     public DefaultTableModel mostrarCantidadTitulos(){
        DefaultTableModel miModelo = null; 
        try {
            String columnas []= {"Titulo", "Cantidad"}; 
            String datos [] = new String[2]; 
            miModelo = new DefaultTableModel(null, columnas); 
            String sql = "select titulo, COUNT(*) as Cantidad from titles group by titulo";
            PreparedStatement pst = con.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery(); 
            while(rs.next()){
                datos[0] = rs.getString("Titulo"); 
                datos[1] = rs.getString("Cantidad"); 
                miModelo.addRow(datos);
            }
        } catch (Exception e) {
        e.printStackTrace();
        }   
        return miModelo; 
    }
    
    
    
}
