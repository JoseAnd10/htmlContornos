/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacioncontorno;
import java.util.*;

/**
 *
 * @author Gabriel
 */
public class OperacionContorno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora de Gabriel, Iago y José");
        System.out.println("Para sumar escriba 1, para restar escriba 2 y para multiplicar escriba 3");
        int seleccion;
        seleccion= scanner.nextInt();
        int continuar = 1;
        while(continuar == 1){
        switch(seleccion){
            case 1: suma();
            break;
            case 2: resta();
            break;
            case 3: multiplicacion();
            break;
            default: System.out.println("Seleccione correctamente");
            break;
        }
        System.out.println("Si desea ejecutar la calculadora nuevamente escriba 1");
        continuar=scanner.nextInt();
        }
    }
    
    public static void suma(){}
    public static void resta(){}
    public static void multiplicacion(){}
    public static void division(){}
}
