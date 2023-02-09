package bucles;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// 11. Diseñar un programa que muestre el producto (la multiplicación) de los 10 primeros números impares
		
		int n=0;
		int producto=0;
		int u=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		n=teclado.nextInt();
		
		while (u<=15 || n%2==0) {
			n++;
			producto=producto*n;
			System.out.println("Dame un número");
			n=teclado.nextInt();
		}
		System.out.println("El producto es: ");
	}

}
