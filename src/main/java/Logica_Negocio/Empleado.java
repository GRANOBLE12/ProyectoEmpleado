/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author ANDRES
 */
public class Empleado {
    
    //Atributos
    public String nombre;
    public String codigo;
    public int año_ingreso;
    public String apellido;
    public String correo;
    

    //Constructor no Parametrizado
    public Empleado (){  
    }
    
    //Constructor Paramnetrizado
    public Empleado(String nombre, int año_ingreso, String codigo) {
        this.nombre = nombre;
        this.año_ingreso = año_ingreso;
        this.codigo = codigo;
       
    }

    public Empleado(String nombre, String codigo, int año_ingreso, String apellido, String correo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.año_ingreso = año_ingreso;
        this.apellido = apellido;
        this.correo = correo;
    }
   
    
    //Setters
    
  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAño_ingreso(int año_ingreso) {
        this.año_ingreso = año_ingreso;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
   //getter

    public String getNombre() {
        return nombre;
    }

    public int getAño_ingreso() {
        return año_ingreso;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }
    
}