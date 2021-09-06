package main;

import java.util.Scanner;

public class main2 {
    public static void main(String args[]){
        Scanner consola=new Scanner(System.in);
        final double PI=3.14;
        
        System.out.print("Eliga una opcion \n1)Rectangulo\n2)Circuferencia\n");
        double opcion=consola.nextDouble();
        consola.nextLine();
        
         if(opcion==1){
             
             System.out.print("Ingrese el largo : ");
             double largo=consola.nextDouble();
             System.out.print("Ingrese ancho: ");
             double ancho=consola.nextDouble();
             consola.nextLine();
             
             double perimetro= (largo+ancho)*2;
             double area=largo*ancho;
             
             System.out.println("Area= "+area+"\nPerimetro= "+perimetro);
         }
         else if(opcion==2){
             System.out.print("Ingrese el radio : ");
             double radio=consola.nextDouble();
             consola.nextLine();
             
             double perimetro= radio*2*PI;
             double area=radio*radio*3*PI;
             
             System.out.println("Area= "+area+" \nPerimetro= "+perimetro);
         
         }
         else{
             System.out.println("Error");
         }
        
    }
    
}
