package bucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// 6. Pedir números hasta que se teclee un 0 y entonces sumar todos los números
		
		int numero=0;
		int suma=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		numero=teclado.nextInt();
		suma+=numero; //Lo mismo que hacer suma=suma+numero
		
		while (numero!=0) {
			System.out.println("Dame un número");
			numero=teclado.nextInt();
			suma=suma+numero; //se suma la suma anterior al número que añadimos
		}
		
		System.out.println("El resultado es "+suma);

	}

}
