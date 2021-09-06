package main;

import java.util.Scanner;
import java.util.Random;

public class main2 {
    public static void main(String args[]){
    Scanner dato_ingresado=new Scanner(System.in);
    Random numero=new Random();
    boolean adivino=false;
    
    //Generando el numero Secreto
    int numeroSecreto=numero.nextInt(100)+1;
    final int MAX_INTENTOS=10;
    
    for(int i=1;i<=MAX_INTENTOS;i++){
        System.out.print("Intento "+i+">> ");
        int numero_ingresado= dato_ingresado.nextInt();
        dato_ingresado.nextLine();
        
        if(numero_ingresado==numeroSecreto){
            adivino=true;
            break;
        }
        else if(numero_ingresado>numeroSecreto){
            System.out.println("El numero a adivinar es menor");
        }
        else{
            System.out.println("El numero a adivinar es mayor");
        }
    }
    if (adivino){
        System.out.println("¡¡¡GANASTE!!!");
    }
    else{
        System.out.println("¡¡¡PERDISTE!!! El numero era "+numeroSecreto);
    }
    
    
    }
    
}
