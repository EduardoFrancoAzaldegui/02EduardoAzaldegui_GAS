package main;

import java.util.Scanner;

public class main2 {
    
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        double l,a;
        System.out.print("Ingrese largo >> ");
        l=entrada.nextDouble();entrada.nextLine();
        System.out.print("Ingrese ancho >> ");
        a=entrada.nextDouble();entrada.nextLine();     
        
        System.out.print("AREA= "+areaRectangulo(l, a)+"\n");
        System.out.print("Perimetro= "+Perimetro(a, l));
    }
    
    public static double areaRectangulo(double largo,double ancho){
        double area=largo*ancho;
        return area;
    }
    public static double Perimetro(double largo,double ancho){
        double perimetro=(largo+ancho)*2;
        return perimetro;
    }
    
    
}
