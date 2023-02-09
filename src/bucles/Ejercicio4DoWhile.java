package bucles;

import java.util.Scanner;

public class Ejercicio4DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=0;
		int contador=0;
		Scanner teclado=new Scanner(System.in);
		
	
	do {
			System.out.println("Dame un número");
			numero=teclado.nextInt();
			if(numero>=0) {
			contador++;
			}
	}while (numero>=0);
		System.out.println("Se introdujeron "+contador+" números positivos");
		
			}
				
		

	}


