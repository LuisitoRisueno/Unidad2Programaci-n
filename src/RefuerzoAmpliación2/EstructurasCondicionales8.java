package RefuerzoAmpliación2;

import java.util.Scanner;

public class EstructurasCondicionales8 {

	public static void main(String[] args) {
		// 8. Escriba un programa en Java que 
		//permita introducir 5 números enteros 
		//por teclado 
		//y muestre el menor de ellos. 

		int numero=0;
		int menor=0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		numero=teclado.nextInt();
		menor=numero;
		
		for (int i=0; i<4; i++) {
			System.out.println("Dame un número");
			numero=teclado.nextInt();
			if (numero<menor)
				menor=numero;
		}
		
		System.out.println("El número menor es: "+menor);
		
	}

}
