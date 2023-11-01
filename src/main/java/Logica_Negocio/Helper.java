/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author 1059356842
 */
public class Helper {
  
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
                   if(nombre.charAt(j)=='º')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='-')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='¬')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='|')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='?')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='¿')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='&')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='%')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='$')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='.')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='#')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='_')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='*')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='<')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='>')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='€')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='Ç')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='+')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='(')
                {
                    ce++;
                }
                  if(nombre.charAt(j)==')')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='»')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='¥')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='«')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='¶')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='[')
                {
                    ce++;
                }
                  if(nombre.charAt(j)==']')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='{')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='}')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='÷')
                {
                    ce++;
                }
                  if(nombre.charAt(j)=='=')
                {
                    ce++;
                }
                    if(nombre.charAt(j)==',')
                {
                    ce++;
                }
            }   
        } 
        return ce;
    }
}