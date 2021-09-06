package main;

import java.util.Scanner;
import java.util.Random;

public class main2 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in); //Lectura de entrada
        Random numeros=new Random(); //generador de numeros aleatorios
        boolean adivino=false;
        
        //Genero un numero entre 1 y 100
        int numeroSecreto=numeros.nextInt(4)+1;
        int valorleido;
        
        for(int i=1;i<=10;i++){
            
        
        System.out.println("Ingre un valor: ");
        valorleido=entrada.nextInt();
        entrada.nextLine();
        
        if (valorleido==numeroSecreto){
            System.out.println("Adivinaste");
            adivino=true;
            break;
        }
        else{
            System.out.println("No Adivinaste");
        }
        }
        
        if (adivino){
            System.out.println("El numero era "+numeroSecreto);
        }
        else{
            System.out.println("Game Over");
        }
        
        
    }
    
}
