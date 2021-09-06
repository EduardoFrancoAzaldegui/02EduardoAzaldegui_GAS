package main;

import java.util.Scanner;

public class main2 {
    public static void main(String args[]){
        Scanner console=new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad");
        edad=console.nextInt();
        console.nextLine();
        if(edad<40){
            System.out.print("Eres joven");
        }
        else if(edad>40) {
            System.out.print("eres viejo");
        }
        else{
            System.out.print("tienes 40 :v");
        
        }
        
        
    }
}
