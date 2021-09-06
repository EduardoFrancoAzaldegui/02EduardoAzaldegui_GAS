package main;

import java.util.Scanner;

public class main2 {
    public static void main(String args[]){
        System.out.println("Cauntas veces quiere que se repita");
        Scanner repetir=new Scanner(System.in);
        int j=repetir.nextInt();
        repetir.nextLine();
        int i;     
        for (i=1;i<=j;i++){
            i=i+4;
            System.out.println("Hola");
        }
        
    }
    
}
