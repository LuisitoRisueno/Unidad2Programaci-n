package bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// 7. Pedir números hasta que se introduzca uno negativo y calcular la media
		
		int numero=0;
		int contador=0;
		int suma=0;
		float media=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		numero=teclado.nextInt();
		suma=suma+numero;
		
		while (numero>=0) {
			contador++;
			suma+=numero;
			System.out.println("Dame un número");
			numero=teclado.nextInt();
		}
		media=suma/contador;
		System.out.println("La media es: "+media);

	}

}
