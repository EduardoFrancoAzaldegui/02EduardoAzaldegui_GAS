package main;

import java.util.Random;
import java.util.Scanner;


public class main2 {
    public static void main(String args[]){
        int vida,i,j;
        int B,R;
        boolean gano=false;
        
        char numero_aleatorio;
        char[] numero_computadora=new char[4];
        vida=10;
        
        Scanner consola=new Scanner(System.in);
        Random aleatorio=new Random();
        
        
        System.out.println("MasterMind V1.0");
        System.out.println("Dispones de 10 intentos para adivinar el codigo.\n\n");
        
        //creando Cadena a Adivinar
        
        for (i=0;i<=3;i++){
            numero_aleatorio=(char)(aleatorio.nextInt(72-65+1)+65);
            j=0;
            while(j<i){
                if(numero_computadora[j]==numero_aleatorio){
                    numero_aleatorio=(char)(aleatorio.nextInt(72-65+1)+65);
                    j=0;
                }else{
                    j++;
                }
            }
            System.out.print(" "+numero_aleatorio);
            numero_computadora[i]=numero_aleatorio;
        }
        
        
        while(vida>0){
            
            B=0;
            R=0;
            System.out.println("\n");
            System.out.print("Codigo "+(10-(vida-1))+" de 10 >> ");
            
            String usuario=consola.nextLine();
            char usuario_char;
            
            
            //Comprobando datos ingresado con el de la maquina
            
            if(usuario.length()==4){
                
                for (i=0;i<=3;i++){
                    usuario_char=usuario.charAt(i);
                    for (j=0;j<=3;j++){
                        if (numero_computadora[j]==usuario_char){
                            if (i==j){
                                B+=1;
                            }else{
                                R+=1;
                            }
                        }
                    }

                    if(B==4){
                        gano=true;
                        break;
                    }
                }
                vida-=1;
                System.out.println(" ");
                System.out.print("B="+B+" R="+R);
            }else{
                System.out.print("Ingrese Caracteres Validos de longitud 4");
            }
            
        if(gano){
            break;
        }
        
            
        }
        if(gano){
            System.out.print("\nEXCELENTE!!! Ganastes.");
        }else{
            System.out.print("\nPERDISTE!!! El codigo era ");
            System.out.print(numero_computadora);
        }
        
    }
    
}
