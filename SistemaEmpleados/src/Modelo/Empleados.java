/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
public class Empleados {
    private int emp_no; 
    private String nombre; 
    private String apellido; 
    private String genero; 
    public Empleados(){}
    public Empleados(int emp_no, String nombre, String apellido, String genero) {
        this.emp_no = emp_no;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
    }
    public int getEmp_no() {
        return emp_no;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getGenero() {
        return genero;
    }  
}