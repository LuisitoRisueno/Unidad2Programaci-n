package bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// 10. Pedir 15 números y mostrar la suma de todos ellos

		int n=0;
		int p=0;
		int suma=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		p=teclado.nextInt();
		
		while (n<=15) {
			n++;
			System.out.println("Dame otro número");
			p=teclado.nextInt();
			suma=suma+p;
		}
		suma=suma-1;
		System.out.println("La suma de los 15 números es "+suma);
	}

}
