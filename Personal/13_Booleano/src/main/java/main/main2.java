package main;
/*
    AND= A&&B---> encuentro un False ya no hace el recorrido (Muy efectivo)(cirucuito corto)
    AND= A&B ---> primero verifica todo para ver si es verdad o falso (circuito largo)
    OR= A|B---> ciruito largo
    OR= A||B---->cirucuito corto
    XOR=A^B---->es verdadero cuando ambos son diferentes
    NOT=!a

*/

public class main2 {
    public static void main(String args[]){
        boolean a,b,c;
        a=true;
        b=true;
        c=false;
        if (c&&!c){
            System.out.println("es verdadera");
        }
        else{
            System.out.println("es falso");
        }
        
        
    }
    
    
}
