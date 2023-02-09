package EjerciciosEvaluables;

import java.util.Scanner;

public class DawD {

	public static void main(String[] args) {
		// Dados 11 números introducidos por teclado muestra 
		//la suma de los números que sean 
		//múltiplos de 3 y menores de 18. También indica qué 
		//número de esos múltiplos de 3 y 
		//menores de 18 es el menor

		int numero=0;
		int suma=0;
		int menor=18;
		
		Scanner teclado=new Scanner(System.in);
		
		for (int i=0; i<11; i++) {
			System.out.println("Dame un número");
			numero=teclado.nextInt();
			if (numero%3==0 && numero<18) {
				suma+=numero;
				if (numero<menor)
					menor=numero;
			}
				
		}
		
		System.out.println("La suma es: "+suma);
		System.out.println("El menor es: "+menor);
	}

}
