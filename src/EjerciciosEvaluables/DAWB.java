package EjerciciosEvaluables;

import java.util.Scanner;

public class DAWB {

	public static void main(String[] args) {
		// Dados 10 números introducidos por teclado 
		//muestra la media de los múltiplos de 5 que sean 
		//mayores que 10. También indica cuál de esos 
		//múltiplos de 5 y que son mayores que 10 es el mayor

		int suma=0;
		int numero=0;
		int mayor=0;
		int contador=0;
		
		Scanner Teclado=new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			System.out.println("Dame un número");
			numero=Teclado.nextInt();
			if (numero%5==0 && numero>10) 
				suma+=numero;
				contador++;
				if(numero>mayor) {
				mayor=numero;
			}
		}
		
		System.out.println("La media es: "+(suma/contador));
		System.out.println("El mayor es "+mayor);
		
	}

}
