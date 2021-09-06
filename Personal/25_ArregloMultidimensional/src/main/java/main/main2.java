
package main;

import java.util.Random;


public class main2 {
    public static void main(String args[]){
        char[][] tablasLetras=new char[5][3];
        Random sorteo = new Random();
        
        for (int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                tablasLetras[i][j]=(char)(sorteo.nextInt(90-65+1)+65);    
            }
        }
        
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                System.out.print(tablasLetras[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print(tablasLetras.length);
    }
    
}
