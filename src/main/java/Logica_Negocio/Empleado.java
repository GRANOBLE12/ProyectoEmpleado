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
    public int año_ingreso;
    public String codigo;
    
    //constructor no parametrizado
    public Empleado (){
        
    }
    //constructor paramnetrizado

    public Empleado(String nombre, int año_ingreso, String codigo) {
        this.nombre = nombre;
        this.año_ingreso = año_ingreso;
        this.codigo = codigo;
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
    //getters

    public String getNombre() {
        return nombre;
    }

    public int getAño_ingreso() {
        return año_ingreso;
    }

    public String getCodigo() {
        return codigo;
    }
    
}