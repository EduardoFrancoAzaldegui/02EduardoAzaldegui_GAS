package main;

import java.util.Scanner;

public class main2 {
    
    public static void main(String Args[]){
        String nombrePersona,nombrePersona2;
        int edadPersona,edadPersona2;
        
        
        Scanner entrada=new Scanner(System.in);
        
       
        System.out.print("Ingressa tu nombre: ");
        nombrePersona=entrada.nextLine();
        System.out.print("Ingrese tu edad: ");
        edadPersona= entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Hola ");
        System.out.print(nombrePersona);
        System.out.print(", Tienes ");
        System.out.print(edadPersona);
        System.out.println(" años");

        System.out.print("Ingressa tu nombre: ");
        nombrePersona2=entrada.nextLine();
        System.out.print("Ingrese tu edad: ");
        edadPersona2= entrada.nextInt();
        
        System.out.print("Hola ");
        System.out.print(nombrePersona2);
        System.out.print(", Tienes ");
        System.out.print(edadPersona2);
        System.out.print(" años");
        
        
    }
}
