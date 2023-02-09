package buclescondiciones;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// 22. Pedir 5 números e indicar si alguno es múltiplo de 3.
		
		//Declaración Variables/Objetos
		Scanner teclado=new Scanner(System.in);
		int numero=0;
		
		
		for (int i = 0; i<5; i++) {
			System.out.println("Dame un número");
			numero=teclado.nextInt();
			if(numero%3==0) {
				System.out.println(numero+" es múltiplo de 3");
			}else {
				System.out.println(numero+" no es múltiplo de 3");
			}
			
		}

	}

}
