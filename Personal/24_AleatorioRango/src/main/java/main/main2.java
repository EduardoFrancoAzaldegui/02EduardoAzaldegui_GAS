
package main;

import java.util.Random;


public class main2 {
    public static void main(String args[]){
        //10  20
        int numero;
        Random sorteo=new Random();
        
        char letra;
        for(int i=0;i<=100;i++){
        numero=sorteo.nextInt(90-65+1)+65;
        letra=(char)numero;
        System.out.print(letra+" ");
        }
    }
    
}
