package main;

import java.util.Arrays;

public class main2 {
    public static void main(String args[]){
        int miArreglo[]=new int[12];
        int arr2[]=new int[12];
        
        int i,valor;
        valor=1;
        for (i=0;i<12;i++){
            miArreglo[i]=valor;
            arr2[i]=valor;
            valor++;
        }
        if(Arrays.equals(miArreglo,arr2)){
            System.out.print("Iguales");
        }else{
            System.out.print("Distintos");
        }
        

        
    }
    
}
