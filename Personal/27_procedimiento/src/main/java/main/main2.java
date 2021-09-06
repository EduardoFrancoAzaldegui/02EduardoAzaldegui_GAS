package main;

import java.util.Scanner;


public class main2 {
    
    public static void imprimirAsteriscos(int cantidadAsteriscos){
        for(int i=1;i<=cantidadAsteriscos;i++){
            System.out.print("*");
        }
        System.out.println("\n");
    }
    
    public static void main(String args[]){
        int c;
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Ingre un valor entero: ");
        c=entrada.nextInt();entrada.nextLine();
        imprimirAsteriscos(c);
        
        System.out.print("Ingre un valor entero: ");
        c=entrada.nextInt();entrada.nextLine();
        System.out.print("Ingre un caracter: ");
        String miCaracter=entrada.nextLine();
        imprimirLinea(c, miCaracter);
        
    }
    
    public static void imprimirLinea(int cantidad,String caracter){
        for(int i=1;i<=cantidad;i++){
            System.out.print(caracter.charAt(0));
        }
    }
    
}
