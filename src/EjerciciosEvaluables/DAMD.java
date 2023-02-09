package EjerciciosEvaluables;

import java.util.Scanner;

public class DAMD {

	public static void main(String[] args) {
		// Dados 11 números introducidos por teclado 
		//muestra la media de los números que sean 
		//múltiplos de 3 y menores de 18. También indica qué 
		//número de esos múltiplos de 3 y 
		//menores de 18 es el mayor

		int numero=0;
		int suma=0;
		int contador=0;
		int mayor=0;
		
		Scanner teclado=new Scanner(System.in);
		
		for (int i=0; i<11; i++) {
			System.out.println("Dame un número");
			numero=teclado.nextInt();
			if (numero%3==0 && numero<18)
				suma+=numero;
				contador++;
				if (numero>mayor)
					mayor=numero;
		}
		
		System.out.println("La media es: "+(suma/contador));
		System.out.println("El mayor es: "+mayor);
		
	}

}
