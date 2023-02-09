package EjerciciosEvaluables;

import java.util.Scanner;

public class DAWC {

	public static void main(String[] args) {
		// Dados 12 números introducidos por teclado muestra 
		//cuántos hay que sean impares y 
		//menores de 20. También indica qué número de esos 
		//impares y menores de 20 es el menor. 
		
		int numero=0;
		int contador=0;
		int menor=20;
		
		Scanner Teclado=new Scanner(System.in);
		
		for (int i=0; i<12; i++) {
			System.out.println("Dame un número");
			numero=Teclado.nextInt();
			if (numero%2!=0 && numero<20) {
				contador++;
				if (numero<menor) 
					menor=numero;
		}
		
	}

		
		System.out.println("Número impares menores que 20: "+contador);
		System.out.println("El número menor es: "+menor);

	}
}
