/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionempresa;

/**
 *
 * @author JfGm
 */
public class Departamento {
    
    //Declaracion de los atributos
    private String nombre, descripcion;

    //Declaración de los constructores
    public Departamento(){
        nombre=null;
        descripcion=null;
    }
    
    public Departamento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    //Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    

    
    
    
    
}
