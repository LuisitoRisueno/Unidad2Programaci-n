package buclescondiciones;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// 18. Pedir 10 números. Mostrar la media 
		//de los números positivos, la media de los números 
		//negativos y la cantidad de ceros

		int numero = 0;
		float sumaPos = 0;
		float sumaNeg = 0;
		int contadorCeros = 0;
		int contadorPos = 0;
		int contadorNeg = 0;
		Scanner teclado=new Scanner(System.in);
		
		for(int i = 0; i<10; i++) {
			System.out.println("Dame un número");
			numero=teclado.nextInt();
			if(numero>0) {
				sumaPos=sumaPos+numero;
				contadorPos++;
			}else {
				if(numero<0) {
					sumaNeg=sumaNeg+numero;
					contadorNeg++;
				}else {
					contadorCeros++;
				}
			}
		}
	//Imprimis resultados
		if(contadorPos!=0) {
			System.out.println("La media de los positivos es: "+(sumaPos/contadorPos));
		}else {
			System.out.println("No se puede hacer la media de los positivos");
		}
		if(contadorNeg!=0) {
		System.out.println("La media de los negativos es: "+(sumaNeg/contadorNeg));
	}else {
		System.out.println("No se puede hacer la media de los negativos");
	}
		System.out.println("El número de ceros es: "+contadorCeros);

}}
