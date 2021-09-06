package main;

import java.util.Random;

public class main2 {
    public static void main(String args[]){
        Random sorteador=new Random();
        int numero,i,j,contador;
        int[] arregloSinRepetir=new int[10];
        contador=0;
        for(i=0;i<10;i++){
            numero=sorteador.nextInt(10);
            
            j=0;
            while(j<i){
                contador++;
                if(arregloSinRepetir[j]==numero){
                    j=0;
                    numero=sorteador.nextInt(10);
                }else{
                    j++;
                }
            }
            arregloSinRepetir[i]=numero;
        }
        for(int x:arregloSinRepetir){
            System.out.print(" "+x);
        }
        System.out.print("\nIteraciones: "+contador);
    }
    
    
}
