package RefuerzoAmpliación2;

import java.util.Scanner;

public class NúmeroAmigos {

	public static void main(String[] args) {
		
		//Los números amigos son cuando la suma de los divisores
		//de un número (n1) da como resultado n2
		//
		//Un ejemplo de números amigos son los números 220 y 284.
		//Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
		//La suma de los divisores propios de 220 da como resultado 284
		//Los divisores propios de 284 son 1, 2, 4, 71 y 142.
		//La suma de los divisores propios de 284 da como resultado 220.
		//Por lo tanto 220 y 284 son amigos.
	
		int suma=0;
		int n1=0; 
		int n2=0;
		
		
		Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce primer número: ");
        n1 = teclado.nextInt();
        System.out.println("Introduce segundo número: ");
        n2 = teclado.nextInt();
  
        
        //De esta manera se hace que el for no acabe hasta quedarse con el último divisor de n1 (al poner el sínbolo "<" y no el 
        // "<=", no se cuenta el propio n1 como divisor 
        
        for(int i = 1;i < n1;i++){  // for para sumar todos los divisores propios de n1                                   
             if(n1%i==0){
                suma=suma+i;
             }
        }
  
        // si la suma de los divisores de n1 es igual a n2
        if(suma==n2){
           suma=0;
           for(int i = 1;i < n2;i++){  // sumo los divisores propios de n2                                                
                if(n2%i==0){
                   suma=suma+i;
                }
            }
           //si la suma de los divisores de n2 es igual a n1
           if(suma==n1){
              System.out.println("Son Amigos");
           }else{
              System.out.println("No son amigos");
           }
        }        
        else{
             System.out.println("No son amigos");
        }
    }
}	
		
		
	
	


