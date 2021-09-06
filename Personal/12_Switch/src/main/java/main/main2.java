package main;

import java.util.Scanner;

public class main2 {
    public static void main(String args[]){
                Scanner consola=new Scanner(System.in);
        final double PI=3.14;
        
        System.out.print("Eliga una opcion \n1)Rectangulo\n2)Circuferencia\n3)Triangulo\n");
        int opcion=consola.nextInt();
        
        consola.nextLine();
     
        switch(opcion){
        
            case 1:
             
                System.out.print("Ingrese el largo : ");
                double largo=consola.nextDouble();
                System.out.print("Ingrese ancho: ");
                double ancho=consola.nextDouble();
                consola.nextLine();
             
                double perimetro= (largo+ancho)*2;
                double area=largo*ancho;
             
                System.out.println("Area= "+area+"\nPerimetro= "+perimetro);
                break;
         
            case 2:
                System.out.print("Ingrese el radio : ");
                double radio=consola.nextDouble();
                consola.nextLine();
             
                double perimetro2= radio*2*PI;
                double area2=radio*radio*3*PI;
             
                System.out.println("Area= "+area2+" \nPerimetro= "+perimetro2);
                break;
         
         
            case 3:
                System.out.print("Ingrese la altura : ");
                double altura=consola.nextDouble();
                System.out.print("Ingrese la base: ");
                double base=consola.nextDouble();
             
                consola.nextLine();
             
                double perimetro3=15 ;
                double area3=(base*altura)/2;
                System.out.println("Area= "+area3+" \nPerimetro= "+perimetro3);
                break;
        
        }
    }
}
