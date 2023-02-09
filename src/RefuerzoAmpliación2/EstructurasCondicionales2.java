package RefuerzoAmpliación2;

import java.util.Scanner;

public class EstructurasCondicionales2 {

	public static void main(String[] args) {
		// 1. Escriba un programa que lea un número 
		//entero y escriba un mensaje si el número es 
		//mayor que 100

		int numero=0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		numero=teclado.nextInt();
		
		if (numero>100) {
			System.out.println(numero+" es mayor que 100");
		}else {
			System.out.println(numero+" no es mayor que 100");
		}
		

		
	}

}
