package bucles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//4. . Pedir números hasta que se teclee uno negativo, 
		//y mostrar cuántos números se han 
		//introducido.
		
		int numero=0;
		int contador=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		numero=teclado.nextInt();
		while (numero>=0) {
			contador++;
			System.out.println("El número es positivo");
			numero=teclado.nextInt();
			if (numero<0) {
				System.out.println("Se introdujeron "+contador+" números positivos");
			}
				
		}

	}

}
