package EjerciciosEvaluables;

import java.util.Scanner;

public class DAMA {

	public static void main(String[] args) {
		// Dados 10 números introducidos por teclado 
		//muestra la suma de los múltiplos de 3 que sean 
		//mayores que 6. También indica qué número de 
		//esos múltiplos de 3 que son mayores que 6 es 
		//el mayor

		int numero=0;
		int suma =0;
		int mayor=0;
		
		Scanner Teclado=new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			System.out.println("Dame un número");
			numero=Teclado.nextInt();
			if (numero%3==0 && numero>6) {
				suma=suma+numero;
				if (numero>mayor) {
					mayor=numero;
				}
			}
		}
		
		System.out.println("La suma es: "+suma);
		System.out.println("El mayor es: "+mayor);
		
		}
		
	}


