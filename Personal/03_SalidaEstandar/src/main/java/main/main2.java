/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

public class main2 {
    public static void main(String args[]){
        String nombre;
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.print("Ingrese tu nombre: ");
        nombre=entrada.nextLine();
        
        System.out.print("Hola "+nombre+" ¿Como Estas?");
        
    }
    
}
