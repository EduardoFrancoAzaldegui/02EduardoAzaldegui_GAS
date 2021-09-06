package main;

import java.util.Scanner;

public class main2 {
    public static void main(String args[]){
        double ancho,altura;
        double area,perimetro;
        
        Scanner consola=new Scanner(System.in);
        System.out.print("Ingrese el ancho del rectangulo : ");
        ancho=consola.nextDouble();
        
        consola.nextLine();
        
        System.out.print("Ingrese la altura del rectangulo : ");
        altura=consola.nextDouble();
        
        area=(altura*ancho)/2;
        perimetro=(altura+ancho)*2;
        System.out.println("El Area es = "+area);
        System.out.println("El perimetro es = "+perimetro);
        
        
        
        
    }
    
}
