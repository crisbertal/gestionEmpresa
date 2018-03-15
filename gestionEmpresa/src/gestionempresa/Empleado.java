/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionempresa;

/**
 *
 * @author crisber
 */
public class Empleado {
    
    //Declaracion de los atributos
    private int idEmpleado;
    private double salario;
    private String nombre, apellidos, trabajo, nombreDepartamento;
    
    //Declaración de los constructores
    public Empleado() {
        idEmpleado = 0;
        salario = 0;
        nombre = null;
        apellidos = null;
        trabajo = null;
        nombreDepartamento = null;
    }

    public Empleado(int idEmpleado, double salario, String nombre, 
            String apellidos, String trabajo, String nombreDepartamento) {
        this.idEmpleado = idEmpleado;
        this.salario = salario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.trabajo = trabajo;
        this.nombreDepartamento = nombreDepartamento;
    }
    
    //Métodos get y set
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    
}
