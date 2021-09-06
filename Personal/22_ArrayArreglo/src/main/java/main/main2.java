package main;
import java.util.Scanner;

public class main2 {
    public static void main(String args[]){
        final int CANTIDAD_CARACTERES=10;
        char[] simbolos=new char[CANTIDAD_CARACTERES];
        
        Scanner consola=new Scanner(System.in);
        String frase,letraString;
        int contador=0;
        
        System.out.print("Ingresa la frase de "+CANTIDAD_CARACTERES+" caracteres: ");
        frase=consola.nextLine();
        System.out.print("Ingresa un caracter");
        letraString=consola.nextLine();
        
        char letraChar=letraString.charAt(0);
        simbolos=frase.toCharArray();
        
        for(int i=0;i<simbolos.length;i++){
            if(simbolos[i]==letraChar)
                contador++;
        }
        System.out.println("El caracter "+letraChar+" aparece "+contador+" veces,");
        
        for(char c:simbolos){
            System.out.print(c);
        }
    }
    
}
