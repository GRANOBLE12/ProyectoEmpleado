/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int i;

    public static void main(String[] args) {
        // Declarar Variables
        String nombre = "";
        String codigo = "";
        String Id = "";
        int año_ingreso = 0;
        int cantidad = 0;
        int opcion = 0;
        int bandera = 0;
        int retorno = 0; 
        //variables nuevas
        String apellido ="";
        String correo = "";
        int retornoce=0;
        int retornover=0;
        int añoA=2023;

        // Creación de Objetos
        Empleado objempleado = new Empleado();

        // Fijar Información
        Scanner scan = new Scanner(System.in);

        // Reservar Datos en Memoria
        ArrayList<Empleado> listaempleados = new ArrayList<>();
        
        do {
            // Impresión del Menú de Opciones
            System.out.println(); // Para dar espacio
            System.out.println("Menú de Opciones:");
            System.out.println("1. Registrar empleado(s)");
            System.out.println("2. Editar empleado(s)");
            System.out.println("3. Buscar empleado(s) ");
            System.out.println("4. Mostrar empleado(s)");
            System.out.println("5. Eliminar empleado(s)");
            System.out.println("6. Calcular años promedio");
            System.out.println("7. Concatenar correos");
            System.out.println("8. Salir del programa");

            System.out.println(); // Para dar espacio
            System.out.print("Seleccione una opción: ");
            opcion = scan.nextInt(); // Obtener la Elección del Usuario

            switch (opcion) {
                case 1:
                    // Registro Empleado(s)
                    System.out.println(); // Para dar espacio
                    System.out.println("Digite la cantidad de empleados a registrar");
                    cantidad = scan.nextInt();
                    scan.nextLine();

                    // Ciclo para registrar empleados
                    if (cantidad > 0) {
                        for (int i = 0; i < cantidad; i++) {
                            System.out.println("Digite el nombre del empleado " + (i + 1));
                            nombre = scan.nextLine();

                            retorno = RetornarValor(nombre);
                            retornoce=RetornarCE(nombre);
                            while (retorno != 0 || retornoce!=0 || nombre.equals("")) {
                                System.out.println(); // Para dar espacio
                                System.out.println("Digite el nombre del empleado " + (i + 1));
                                nombre = scan.nextLine();
                                retorno = RetornarValor(nombre);
                                retornoce=RetornarCE(nombre);
                            }
                                System.out.println("Digite el código del empleado " + (i + 1));
                                codigo = scan.nextLine();
                                retornover=VerificarCodigo(listaempleados, codigo);
                            while (codigo.equals("")||retornover!=0) {
                                System.out.println("Digite nuevamente el código del empleado" +(i+1));
                                codigo = scan.nextLine();
                                retornover=VerificarCodigo(listaempleados, codigo);
                            }
                            
                           
                            System.out.println(); // Para dar espacio
                            System.out.println("Digite el año de ingreso del empleado " + (i + 1));
                            año_ingreso = scan.nextInt();
                            while (año_ingreso < 1919 || año_ingreso >= 2024) {
                                System.out.println(); // Para dar espacio
                                System.out.println("El año de ingreso no es válido");
                                System.out.println("Digite nuevamente el año de ingreso del empleado");
                                año_ingreso = scan.nextInt();
                            }

                            scan.nextLine();
                            objempleado = new Empleado(nombre, año_ingreso, codigo);
                            listaempleados.add(objempleado);
                        }
                        System.out.println(); // Para dar espacio
                        System.out.println("El registro de empleado(s) ha sido exitoso");
                    } else {
                        System.out.println(); // Para dar espacio
                        System.out.println("El número digitado no es válido");
                    }
                    break;

                case 2:
                    // Editar Empleado(s)
                    scan.nextLine();
                    System.out.println(); // Para dar espacio
                    System.out.println("Digite el ID del empleado a editar");
                    codigo = scan.nextLine();
                    for (int i = 0; i < listaempleados.size(); i++) {
                        if (listaempleados.get(i).getCodigo().equals(codigo)) {
                            System.out.println(); // Para dar espacio
                            System.out.println("Digite el nombre del empleado");
                            nombre = scan.nextLine();
                            System.out.println(); // Para dar espacio
                            System.out.println("Digite el código del empleado");
                            codigo = scan.nextLine();
                            System.out.println(); // Para dar espacio
                            System.out.println("Digite el año de ingreso del empleado");
                            año_ingreso = scan.nextInt();

                            listaempleados.get(i).setNombre(nombre);
                            listaempleados.get(i).setCodigo(codigo);
                            listaempleados.get(i).setAño_ingreso(año_ingreso);
                            System.out.println(); // Para dar espacio
                            System.out.println("El empleado " + (i + 1) + " ha sido editado");
                            bandera = 1;
                        }
                    }
                    if (bandera == 0) {
                        System.out.println(); // Para dar espacio
                        System.out.println("El ID del empleado es incorrecto o no está registrado");
                    }
                    break;

                case 3:
                    // Buscar Empleado(s)
                    scan.nextLine();
                    System.out.println(); // Para dar espacio
                    System.out.println("Digite el código del empleado a buscar");
                    Id = scan.nextLine();
                    for (int i = 0; i < listaempleados.size(); i++) {
                        if (listaempleados.get(i).getCodigo().equals(Id)) {
                            System.out.println(); // Para dar espacio
                            System.out.println("Empleado" + "\t" + (i + 1) + "\t" + "Ha sido buscado");
                            System.out.println("El nombre del empleado es:" + "\t" + listaempleados.get(i).getNombre());
                            System.out.println("El código del empleado es:" + "\t" + listaempleados.get(i).getCodigo());
                            System.out.println("El año de ingreso del empleado es:" + "\t" + listaempleados.get(i).getAño_ingreso());
                            bandera = 1;
                            break;
                        }
                    }
                    if (bandera == 0) {
                        System.out.println(); // Para dar espacio
                        System.out.println("El ID del empleado es incorrecto o no está registrado");
                    }
                    
                    break;

                case 4:
                    // Listar Empleado(s)
                    System.out.println(); // Para dar espacio
                    System.out.println("Listado de los Empleados Registrados:");
                    if (listaempleados.size() > 0) {
                        for (int i = 0; i < listaempleados.size(); i++) {
                            System.out.println(); // Para dar espacio
                            System.out.println("Empleado" + "\t" + (i + 1));
                            System.out.println("El nombre del empleado es:" + "\t" + listaempleados.get(i).getNombre());
                            System.out.println("El código del empleado es:" + "\t" + listaempleados.get(i).getCodigo());
                            System.out.println("El año de ingreso del empleado es:" + "\t" + listaempleados.get(i).getAño_ingreso());
                        }
                    } else {
                        System.out.println(); // Para dar espacio
                        System.out.println("No hay empleados registrados");
                    }
                    break;

                case 5:
                    // Eliminar Empleado(s)
                    scan.nextLine();
                    System.out.println(); // Para dar espacio
                    System.out.println("Digite el código del empleado a eliminar");
                    Id = scan.nextLine();

                    for (int i = 0; i < listaempleados.size(); i++) {
                        if (listaempleados.get(i).getCodigo().equals(Id)) {
                            System.out.println(); // Para dar espacio
                            listaempleados.remove(i);
                            System.out.println("El Empleado " + (i + 1) + " ha sido eliminado");
                            bandera = 1;
                            break;
                        }
                    }
                    if (bandera == 0) {
                        System.out.println(); // Para dar espacio
                        System.out.println("El ID del empleado es incorrecto o no está registrado");
                    }
                    break;
                case 6:
                    // calcular años promedio 
                    CalcularAñoP(listaempleados);
                    break;
                case 7:
                    //Concatenar correos
                case 8:
                    System.out.println(); // Para dar espacio
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println(); // Para dar espacio
                    System.out.println("Opción no válida");
            }
        } while (opcion != 8);
    }
    public static int RetornarValor(String nombre) {
        int letra = 0;
        int numero = 0;

        for (int i = 0; i < nombre.length(); i++) {
            boolean bandera = Character.isDigit(nombre.charAt(i));
            if (bandera) {
                numero++;
            } else {
                letra++;
            }
        }
        return numero;
    }
    public static int RetornarCE(String nombre)
    {
        int ce=0;

        for (int j = 0; j < nombre.length(); j++) {
             boolean flag = Character.isLetter(nombre.charAt(j));
             if(!flag) {
                //System.out.println("'"+ nombre.charAt(j)+"' is a number");
                if(nombre.charAt(j)=='@')
                {
                    ce++;
                }
                 if(nombre.charAt(j)=='~')
                {
                    ce++;
                }
                 if(nombre.charAt(j)=='/')
                {
                    ce++;
                }
                 if(nombre.charAt(j)==';')
                {
                    ce++;
                }
                 if(nombre.charAt(j)==':')
                {
                    ce++;
                }
                 if(nombre.charAt(j)=='"')
                {
                    ce++;
                }
                 if(nombre.charAt(j)=='!')
                {
                    ce++;
                }
                  if(nombre.charAt(j)==' ')
                {
                    ce++;
                }
            }   
        } 
        return ce;
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
        System.out.println("El tpotal de los años de los empleados en la empresa es:"+promedio);
    }

}
