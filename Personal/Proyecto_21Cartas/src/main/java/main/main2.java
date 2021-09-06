package main;

import java.util.Random;
import java.util.Scanner;

public class main2 {
    public static void main(String args[]){
        
        final short MAX_TARJETAS_GRUPO=7;
        final short MAX_GRUPOS= 3;
        final short MAX_TARJETAS= MAX_TARJETAS_GRUPO*MAX_GRUPOS;
        final short MIN_TARJETA_VALOR= 'A';
        final short MAX_TARJETA_VALOR= (char)(MAX_TARJETAS+(int)('A')-1);
        
        Random aleatorio=new Random();
        Scanner consola=new Scanner(System.in);
        
        String posible_repuesta_concatenada;
        int numero_usuario_consola,grupo_elegido_inicialmente;
        
        
        grupo_elegido_inicialmente=0;
        numero_usuario_consola=0;
        
        posible_repuesta_concatenada="";
        
        char[] indice_repuesta=new char[3];
        char[]  posibles_respuestas=new char[3];
        char[] grupo1= new char[MAX_TARJETAS_GRUPO],
               grupo2= new char[MAX_TARJETAS_GRUPO],
               grupo3= new char[MAX_TARJETAS_GRUPO];
        char[] deck= new char[MAX_TARJETAS];
        
        
        System.out.println("Haremos 3 secuencias. Empecemos...");
        System.out.println("Secuencias 1 :");
        System.out.println("");
        
        //Colocando valores en la variable DECK
        
        for(int i=0;i<=(MAX_TARJETAS-1);i++){
            char numero=(char)(aleatorio.nextInt(85-65+1)+65);
            
            //verificando que no se repitan
            while(numero_usuario_consola==0){
                for(char j:deck){
                    if(j==numero){
                        numero_usuario_consola=0;
                        numero=(char)(aleatorio.nextInt(85-65+1)+65);
                        break;
                    }else{
                        numero_usuario_consola=1; 
                    }       
                }
            }
            
            
            deck[i]=numero;
            numero_usuario_consola=0;
            
            
            //distribuyendo datos a sus respectivos grupos
            if(i<=6){
                grupo1[i]=numero; 
            }else if(i<=13){
                grupo2[i-7]=numero;
            }else if(i<=20){
                grupo3[i-14]=numero;
            }
             
            
        }
        
        
        //comenzando el conteo de vida
        for(int i=1;i<=3;i++){
            
            //imprimiendo en orden cada grupo
            if(i==1){
                for(int j=0;j<=6;j++){
                    System.out.println("\t"+grupo1[j]+" "+grupo2[j]+" "+grupo3[j]);
                }
            }
                
            System.out.println("");
            System.out.print("En que grupo esta tu tarjeta [1,2,3]: ");
            numero_usuario_consola=consola.nextInt();consola.nextLine();
            System.out.println("Secuencias "+i+ ":");
            
            
            //Imprimiendo el nuevo orden
            if(i==1){
                System.out.println("\n");
                for (int j=0;j<=20;j++){
                    if (j%3==0&&j!=0){
                        System.out.println();
                    }
                    System.out.print(" "+deck[j]+"");
                }
                grupo_elegido_inicialmente=numero_usuario_consola;
            }
            
            
            //comprobando que letras coincide del grupo elegidos con la columna elegida en la segunda vida
            if (i==2){
                for (int j=0;j<deck.length;j++){
                    if(j%3==(numero_usuario_consola-1)){
                        for (int k=0;k<=6;k++){
                            if(deck[(k +(7*(grupo_elegido_inicialmente-1)))]==deck[j]){
                                posible_repuesta_concatenada+=deck[j];
                            }
                        }  
                    } 
                }
                
                //almacenando las tres o dos posibles repuestas
                if(grupo_elegido_inicialmente==numero_usuario_consola){
                    
                    posibles_respuestas[0]=posible_repuesta_concatenada.charAt(0);
                    posibles_respuestas[1]=posible_repuesta_concatenada.charAt(1);
                    posibles_respuestas[2]=posible_repuesta_concatenada.charAt(2);
                    
                    for(int j=0;j<=6;j++){
                        
                        
                        if(j==6){
                            System.out.println("\t"+grupo3[j]+" "+grupo1[j]+" "+grupo2[j]);
                        }
                        if(j!=3){
                            System.out.println("\t"+grupo1[j]+" "+grupo2[j]+" "+grupo3[j]);
                        }
                    }
                    

                    
                }else{
                    posibles_respuestas[0]=posible_repuesta_concatenada.charAt(0);
                    posibles_respuestas[1]=posible_repuesta_concatenada.charAt(1);   
                }
                
                
                //reorganizando grupo
                
                
                }
            }
            
            
            
            if(i==3){
                
            }
                
                                                                                                          
            }
            
        }   
    }

