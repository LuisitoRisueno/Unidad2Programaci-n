package EjerciciosEvaluables;

import java.util.Scanner;

public class DAWA {

	public static void main(String[] args) {
		// Dados 12 números introducidos por teclado 
		//muestra la suma de los múltiplos de 5 que sean 
		//mayores que 10. También indica la media de de esos 
		//múltiplos de 5 que son mayores que 10.

		int numero=0;
		float suma=0;
		int contador=0;
		
		
		Scanner Teclado=new Scanner(System.in);
		
		for (int i=0; i<12; i++) {
			System.out.println("Dame un número");
			numero=Teclado.nextInt();
			if(numero%5==0 && numero>10) {
				suma=suma+numero;
				contador++;
			}
		}
		
		System.out.println("La suma es: "+suma);
		System.out.println("La media es: "+(suma/contador));
		
	}

}
