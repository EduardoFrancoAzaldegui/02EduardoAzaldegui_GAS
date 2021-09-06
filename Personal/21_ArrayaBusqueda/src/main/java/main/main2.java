package main;

import java.util.Random;
import java.util.Scanner;

class main2 {
    
    public static void main(String args[]){
        Scanner consola=new Scanner(System.in);
        Random generadorAleatorio=new Random();
        int[] numeros=new int[10],posiciones=new int[10];
        int tope=-1,numeroBuscado;
        
        for (int i=0;i<10;i++){
            numeros[i]=generadorAleatorio.nextInt(10)+1;
        }
        System.out.print("Numero buscado >> ");
        numeroBuscado=consola.nextInt(); consola.nextLine();
        
        for(int i=0;i<10;i++){
            if (numeros[i]==numeroBuscado){
            tope++;
            posiciones[tope]=i;        
            }
        }
        
        System.out.print("Arreglo original:");
        
        for(int x:numeros){
            System.out.print(" "+x);
        }
        System.out.println("\nNumero buscado: "+numeroBuscado);
        System.out.print("Posiciones: ");
        
        for(int i=0;i<=tope;i++){
            System.out.print(" "+posiciones[i]);
        }
        
    }
}
