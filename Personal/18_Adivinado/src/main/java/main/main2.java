package main;

import java.util.Scanner;

public class main2 {
    public static void main(String args[]){
        int inicial,finales,cantidad,contador,temporal;
        int recorredor;
        temporal=0;
        recorredor=1;
        String usuario;
        Scanner consola=new Scanner(System.in);
        cantidad=0;
        
        System.out.print("Ingrese limite inicial : ");
        inicial=consola.nextInt();
        
        System.out.print("Ingrese limite final : ");
        finales=consola.nextInt();
        consola.nextLine();
        
        contador=finales-inicial;
        
        while(true){
            if (contador-inicial>1){
                contador=contador/2;
                cantidad+=1;
            }
            else{
                cantidad+=2;
                break;
            }
        }
        System.out.println("la cantidad de intentos es: "+cantidad);
        
        
        while(recorredor<=cantidad){
            
            contador=(finales-inicial)/2+inicial;
            System.out.print(recorredor+">El numero es ...."+contador+": ");
            usuario=consola.nextLine();
            
            if(usuario.equals(">")){
                inicial=contador+1;
                
            }
            else if(usuario.equals("<")){
                finales=contador-1;
                         
            }
            
            else if(usuario.equals("=")){
                System.out.println("Gane xd");
                break;
            }  
            recorredor+=1;
        }
        
              
    }
}
