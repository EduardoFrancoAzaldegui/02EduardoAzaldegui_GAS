package main;

public class main2 {
    public static void main(String args[]){
        
        System.out.println("Cantidad de argumentos="+args.length);
        System.out.println("Lista de argumentos: ");
        
        for (String miVariable:args){
            System.out.println(miVariable+" ");
        }
        int[] miArreglo={10,9,8,7,6};
        for(int valor:miArreglo){
            System.out.println(valor);
        }
    }
}
