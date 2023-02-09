package bucles;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// 12. Pedir 10 números. Mostrar la media de los números 
		//positivos, la media de los números 
		//negativos y la cantidad de ceros.
		
		float n=0;
		
		float positivo=0;
		float sumapositivo=0;
		float negativo=0;
		float sumanegativo=0;
		int contadorp=0;
		int contadorn=0;
		
		int ceros=0;
		float cociente=0;
		float resto;
		
		
		Scanner teclado=new Scanner(System.in);
		
		
		
		for (int i=0; i<10; i++) {
			System.out.println("Dame un número");
			n=teclado.nextInt();
			cociente=n;
			if (n>=0) {
				positivo=n;
				sumapositivo+=positivo;
				contadorp++;
			}
			
			if (n<0) {
				negativo=n;
				sumanegativo+=negativo;
				contadorn++;
			}
			
			while(cociente!=0) {
				resto=cociente%10;
				cociente=cociente/10;
				if (resto==0)
					ceros++;
			}
			
			
			
		}
		
		
		
		System.out.println("La media de los positivos es: "+(sumapositivo/contadorp));
		System.out.println("La media de los negativos es: "+(sumanegativo/contadorn));
		System.out.println("La cantidad de ceros es: "+ceros);
			
	}

}


