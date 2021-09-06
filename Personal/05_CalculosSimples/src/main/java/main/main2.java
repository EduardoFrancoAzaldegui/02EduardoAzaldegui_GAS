package main;

import java.util.Scanner;

public class main2 {
    
    public static void main(String args[]){
        Scanner consola=new Scanner(System.in);
        int largo,ancho;
        int area,perimetro;
        
        System.out.print("Ingrese el largo de un rectangulo: ");
        largo=consola.nextInt();
        consola.nextLine();
        
        System.out.print("Ingre el ancho del rectangulo: ");
        ancho=consola.nextInt();
        consola.nextLine();
        
        perimetro= largo*2 + ancho*2;
        area=largo*ancho;
        
        System.out.println("Area= "+ area);
        System.out.println("perimetro= "+perimetro);
         
        
    }
}
