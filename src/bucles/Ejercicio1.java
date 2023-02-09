package bucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// 1. . Leer un número y mostrar su cuadrado, 
		// repetir el proceso hasta que se introduzca un número 
		// negativo.
		
		//Declarar variables/objetos
		int numero=0;
		Scanner teclado=new Scanner(System.in);
		
		while(numero>=0) {
			System.out.println("Dame un número");
			numero=teclado.nextInt();
			if(numero>0)
				System.out.println("El cuadrado de "+numero+" es "+numero*numero);
		}
		System.out.println("FIN");
	}
}

