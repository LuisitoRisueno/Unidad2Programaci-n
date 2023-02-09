package EjerciciosEvaluables;

import java.util.Scanner;

public class DAMC {

	public static void main(String[] args) {
		// Dados 8 números introducidos por teclado 
		//muestra la media de los impares y menores de 
		//20. También indica qué número de esos impares y 
		//menores de 20 es el mayor.

		
		int numero=0;
		int suma=0;
		int contador=0;
		int mayor=0;
		
		Scanner teclado=new Scanner(System.in);
		
		for (int i=0; i<8; i++) {
			System.out.println("Dame un número");
			numero=teclado.nextInt();
			if (numero%2!=0 && numero<20)
				suma+=numero;
				contador++;
				if (numero>mayor)
					mayor=numero;
		}
			
		System.out.println("La media es: "+(suma/contador));
		System.out.println("El mayor es: "+mayor);
		
		
	}

}
