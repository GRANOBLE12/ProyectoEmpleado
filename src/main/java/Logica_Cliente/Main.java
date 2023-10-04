/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ANDRES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//Declarar Variables
    String nombre = "";
    String codigo = "";
    String Id = "";
    int año_ingreso = 0;
    int cantidad =0;
    int opcion = 0;
    int bandera =0 ;
   
//Creación de Objetos
    Empleado objempleado = new Empleado();
    
//Fijar Información 
    Scanner scan = new Scanner(System.in);
    
//Almacenar Datos en Memoria
    ArrayList < Empleado> listaempleados = new ArrayList<>();
do {
    
//Impresión del Menú de Opciones
                                   System.out.println(""); //Para dar espacio
    System.out.println("Menú de Opciones:");
    System.out.println("1. Registrar empleado(s)");
    System.out.println("2. Editar empleado(s)");
    System.out.println("3. Consultar empleado(s) ");
    System.out.println("4. Mostrar empleado(s)");
    System.out.println("5. Eliminar empleado(s)");
    System.out.println("6. Salir del programa"); 
    
                                   System.out.println(""); //Para dar espacio
    System.out.print("Seleccione una opción: ");
    opcion = scan.nextInt(); //Obtener la Elección del Usuario
    
//Ciclo switch 
    switch (opcion) {
    case 1:   
        
//Registro Empleado(s) 
                                   System.out.println(""); //Para dar espacio
System.out.println("Digite la cantidad de empleados a registrar");
    cantidad = scan.nextInt();
    scan.nextLine();
    
//Ciclo para                 
    for (int i = 0; i < cantidad; i++) {
                                   System.out.println(""); //Para dar espacio
    System.out.println("Digite el nombre del empleado");
    nombre = scan.nextLine();
    System.out.println("Digite el código del empleado");
    codigo = scan.nextLine();
    System.out.println("Digite el año de ingreso del empleado");
    año_ingreso = scan.nextInt();
    
    scan.nextLine();
    objempleado = new Empleado(nombre, año_ingreso, codigo);
    listaempleados.add(objempleado);
}  
                                   System.out.println(""); //Para dar espacio
    System.out.println("El registro de empleado(s) ha sido exitoso");
break;

case 2: 
    //Editar Empleado(s)
scan.nextLine();
                                   System.out.println(""); //Para dar espacio
    System.out.println("Digite el ID del empleado a modificar");
    Id = scan.nextLine();
    for (int i = 0; i < listaempleados.size(); i++) {
        if(listaempleados.get(i).getCodigo().equals(Id))
{                                  System.out.println(""); //Para dar espacio
        System.out.println("Digite el nombre del empleado");
        nombre = scan.nextLine();
        System.out.println("Digite el código del empleado");
        codigo = scan.nextLine();
        System.out.println("Digite el año de ingreso del empleado");
        año_ingreso = scan.nextInt();
                           
        listaempleados.get(i).setNombre(nombre);
        listaempleados.get(i).setCodigo(codigo);
        listaempleados.get(i).setAño_ingreso(año_ingreso);
                                   System.out.println(""); //Para dar espacio
        System.out.println("El empleado "+ (i + 1) +" ha sido modificado");
        bandera = 1;
}   
    }
    if (bandera == 0) {
                                   System.out.println(""); //Para dar espacio    
        System.out.println("El ID del empleado es incorrecto o no esta registrado");
    
    }
 break;
 
case 3:
//Buscar Empleado(s)
scan.nextLine();
                                   System.out.println(""); //Para dar espacio
System.out.println("Digite el código del empleado a buscar");
    Id = scan.nextLine();
    for (int i = 0; i < listaempleados.size(); i++) {
        if(listaempleados.get(i).getCodigo().equals(Id))
        {
                                   System.out.println(""); //Para dar espacio
        System.out.println("Empleado" + "\t" + (i + 1));
        System.out.println("El nombre del empleado es:" + "\t" + listaempleados.get(i).getNombre());
        System.out.println("El código del empleado es:" + "\t" + listaempleados.get(i).getCodigo());
        System.out.println("El año de ingreso del empleado es:" + "\t" + listaempleados.get(i).getAño_ingreso());
        bandera = 1;
        break;
    }
}

if (bandera == 0) {
                                   System.out.println(""); //Para dar espacio
    System.out.println("El ID del empleado es incorrecto o no está registrado");   
}

break;

case 4:
//Listar Empleado(s) 
if (listaempleados.size() > 0) {
for (int i = 0; i < listaempleados.size(); i++) {
                                   System.out.println(""); //Para dar espacio
    System.out.println("Empleado" + "\t" + (i + 1));
    System.out.println("El nombre del empleado es:" + "\t" + listaempleados.get(i).getNombre());
    System.out.println("El código del empleado es:" + "\t" + listaempleados.get(i).getCodigo());
    System.out.println("El año de ingreso del empleado es:" + "\t" + listaempleados.get(i).getAño_ingreso());
}    
}else {
                                   System.out.println(""); //Para dar espacio
    System.out.println("No hay empleados registrados");    
}
break;

case 5:
//Eliminar Empleado(s)
scan.nextLine();
                                   System.out.println(""); //Para dar espacio
System.out.println("Digite el código del empleado a eliminar");
Id = scan.nextLine();

for (int i = 0; i < listaempleados.size(); i++) {
    if(listaempleados.get(i).getCodigo().equals(Id))
    {
                                   System.out.println(""); //Para dar espacio
    System.out.println("El Empleado "+ (i + 1) +" ha sido eliminado");
    bandera = 1;
    break;
    } 
}
if (bandera == 0) {
                                   System.out.println(""); //Para dar espacio
    System.out.println("El ID del empleado es incorrecto o no esta registrado");
}
break;

        case 6:
                                   System.out.println(""); //Para dar espacio
            System.out.println("Saliendo del programa");
            break;

            default:
                                   System.out.println(""); //Para dar espacio
            System.out.println("Opción no válida");
            }
        }while(opcion != 6);
    }
}