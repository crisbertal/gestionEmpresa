/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionempresa;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author crisber
 */
public class listarTrabajadoresEmpresa {
    
    public static void main(String[] args) {
        
    /*
    Crear 4 objetos departamentos cuyo nombre identificativo será: "Desarrollo", 
    "Sistemas", "Contabilidad", "Ventas". El resto de valores de los atributos 
    queda a elección del alumno.
    */
    
    Departamento desarrollo = new Departamento("Desarrollo", 
            "Departamento de desarrollo de aplicaciones");
    Departamento sistemas = new Departamento("Sistemas", 
            "Departamento de mantenimiento de los sistemas informáticos");
    Departamento contabilidad = new Departamento("Contabilidad", 
            "Departamento donde se lleva a cabo la contabilidad");
    Departamento ventas = new Departamento("Ventas", 
            "Departamento donde se gestionan las ventas");
    
    /*
    Crear 12 objetos empleados que tendrán los siguientes trabajos: 3 empleados 
    serán "Programadores" y trabajarán en el departamento de "Desarrollo", otros 
    3 empleados serán "Administradores" y trabajarán en el departamento de 
    "Sistemas", otros 3 serán contables y trabajarán en el departamento de 
    "Contabilidad" y los tres últimos serán "Comerciales" y trabajarán en el 
    departamento de "Ventas".
    */
    
    Empleado pd1 = new Empleado(1, 2500, "Antonio", "Navarro", "Programador", 
            "Desarrollo");
    Empleado pd2 = new Empleado(2, 1500, "Francisco", "Gomez", "Programador", 
            "Desarrollo");
    Empleado pd3 = new Empleado(3, 2000, "Cristobal", "Lopez", "Programador", 
            "Desarrollo");
    Empleado as1 = new Empleado(4, 1000, "Ana", "Villalba", "Administrador", 
            "Sistemas");
    Empleado as2 = new Empleado(5, 1200, "Rafael", "Sevilla", "Administrador", 
            "Sistemas");
    Empleado as3 = new Empleado(6, 1600, "Maria", "Martin", "Administrador", 
            "Sistemas");
    Empleado cc1 = new Empleado(7, 2100, "Pedro", "Ponce", "Contable", 
            "Contabilidad");
    Empleado cc2 = new Empleado(8, 2100, "Mateo", "Marco", "Contable", 
            "Contabilidad");
    Empleado cc3 = new Empleado(9, 2100, "Jesus", "Pacheco", "Contable", 
            "Contabilidad");
    Empleado cv1 = new Empleado(10, 1700, "Antonia", "Campos", "Comercial", 
            "Ventas");
    Empleado cv2 = new Empleado(11, 2500, "Laura", "Vera", "Comercial", 
            "Ventas");
    Empleado cv3 = new Empleado(12, 1700, "Daniel", "Adalid", "Comercial", 
            "Ventas");
    
    /*
    A continuación se creará un ArrayList denominado listaDepartamentos donde 
    se añadirán los 4 objetos departamentos creados y un ArrayLis denominado 
    listaEmpleados donde se añadirán los 12 objetos empleados creados.
    */
    
    ArrayList<Departamento> listarDepartamentos = new ArrayList<>();
    ArrayList<Empleado> listarEmpleados = new ArrayList<>();
    
    //Añadir los 4 objetos departamentos
    listarDepartamentos.add(ventas);
    listarDepartamentos.add(contabilidad);
    listarDepartamentos.add(desarrollo);
    listarDepartamentos.add(sistemas);
    
    //Añadir los 12 objetos empleados
    listarEmpleados.add(as1);
    listarEmpleados.add(as2);
    listarEmpleados.add(as3);
    listarEmpleados.add(cc1);
    listarEmpleados.add(cc2);
    listarEmpleados.add(cc3);
    listarEmpleados.add(cv1);
    listarEmpleados.add(cv2);
    listarEmpleados.add(cv3);
    listarEmpleados.add(pd1);
    listarEmpleados.add(pd2);
    listarEmpleados.add(pd3);
    
    /*
    Por último se listará la información almacenada en los ArrayList creados 
    con anterioridad mostrando en primer lugar la información del departamento 
    y a continuación la información de los empleados que trabajan en dicho 
    departamento.
    */
    
    for(Departamento departamento: listarDepartamentos) {
        System.out.println("---- Departamento: " + departamento.getNombre() 
                + " ----");
        System.out.println("");
        System.out.println("Información del departamento: " 
                + departamento.getDescripcion());
        System.out.println("");
        System.out.println("-- Empleados del departamento " 
                + departamento.getNombre() + " --");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        for(Empleado empleado: listarEmpleados) {
            if(empleado.getNombreDepartamento() == departamento.getNombre()) {
                
                System.out.println("ID: " + empleado.getIdEmpleado());
                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Apellidos: " + empleado.getApellidos());
                System.out.println("Departamento: " 
                        + empleado.getNombreDepartamento());
                System.out.println("Salario: " + empleado.getSalario());
                System.out.println("Trabajo: " + empleado.getTrabajo());
                System.out.println("");
            }
        }
    }    
 }
}
