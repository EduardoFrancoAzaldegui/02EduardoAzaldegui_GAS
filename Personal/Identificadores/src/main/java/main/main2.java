package main;

import java.util.Scanner;

public class main2 {
    static double area,perimetro,largo,ancho;
    static Scanner entrada=new Scanner(System.in);
    
    public static void main(String[] args){
        
        System.out.print("Ingrese largo >> ");
        largo=entrada.nextDouble();entrada.nextLine();
        System.out.print("Ingrese ancho >> ");
        ancho=entrada.nextDouble();entrada.nextLine();     
        
        System.out.print("AREA= "+areaRectangulo(largo, ancho)+"\n");
        System.out.print("Perimetro= "+Perimetro(ancho, largo));
    }
    
    public static double areaRectangulo(double largo,double ancho){
        main2.area=34;  //primera forma de acceder a la global
        double area=largo*ancho;
        return area;
    }
    public static double Perimetro(double largo,double ancho){
        perimetro=5;        //segunda forma de acceder a la global
        double perimetro=(largo+ancho)*2;
        
        return perimetro;
    }
    
    
}
