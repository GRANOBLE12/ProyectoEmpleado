/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

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
   public static void CalcularAñoP(ArrayList<Empleado> listaempleados){
        int año_actual=2023;
        int acomuladorA=0;
        float promedio=0;
        int totalempleados=listaempleados.size();
        for (int i = 0; i < listaempleados.size(); i++) {
            int resta=año_actual-listaempleados.get(i).getAño_ingreso();
            acomuladorA+=resta;
        }
        promedio=acomuladorA/totalempleados;
        System.out.println("El total de los años de los empleados en la empresa es:"+promedio);
    }  
  public static int VerificarCodigo(ArrayList<Empleado> listaempleados, String codigo)
    {
        int bandera=0;
        for (int i = 0; i < listaempleados.size(); i++) {
           
            if(listaempleados.get(i).getCodigo().equals(codigo))
            {
                bandera=1;
            }
            else
            {
                bandera=0;
            }
        }
        return  bandera;
    }
  public static int RetornarCo(String Correo)
    {
        int cc=0;

        for (int k = 0; k < Correo.length(); k++) {
             boolean flag = Character.isLetter(Correo.charAt(k));
             if(!flag) {
                
                if(Correo.charAt(k)==' ')
                {
                    cc++;
                }}}
        return cc;
    }
  public static String ConcatenarCorreos(ArrayList<Empleado> listaempleados)
    {
        String concatenar="";
       
        for (int i = 0; i < listaempleados.size(); i++) {
            concatenar+=listaempleados.get(i).getCorreo()+"\n";
        }
         
        return concatenar;
    }
    public static int RetornarCantidad(String cantidad) {
        int letra = 0;
        int numero = 0;
        for (int i = 0; i < cantidad.length(); i++) {
            boolean bandera = Character.isDigit(cantidad.charAt(i));
            if (bandera) {
                letra++;
            } else {
                numero++;
            }
        }
        return letra;
    }
}