package main;

import java.util.Scanner;

public class main2 {
    public static void main(String args[]){
        Scanner consola=new Scanner(System.in);
        int cantPelotas,cantNiños;
        int pelotasPorNiño,pelotasSobrantes;
        
        System.out.print("Ingrese la cantidad de niños y de pelotas: ");
        cantNiños=consola.nextInt();
        cantPelotas=consola.nextInt();
        consola.nextLine();
        
        pelotasPorNiño=cantPelotas/cantNiños;
        pelotasSobrantes=cantPelotas%cantNiños;
        
        System.out.print("Pelotas por niños= "+pelotasPorNiño+" Sobrantes "+pelotasSobrantes);
        
    }
    
}
