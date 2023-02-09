package RefuerzoAmpliación;

import java.util.Scanner;

public class Bucle11 {

	public static void main(String[] args) {
		// 11. Escriba un programa en Java que solicite 
		//al usuario números positivos de tres o más 
		//cifras y compruebe si son pares. Si el número 
		//introducido es positivo pero de una o dos 
		//cifras, se solicitará un nuevo número. El programa 
		//finaliza cuando se introduce “0” o un 
		//número negativo.

		int numero=0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		numero=teclado.nextInt();
		
		while (numero>0) {
			if (numero>=100)
			System.out.println("Dame un número");
			numero=teclado.nextInt();
			if (numero<=99)
			System.out.println("Introduce otro número, tiene que ser positivo y de 3 o más cifras");
				
		}
		
		
		
		if (numero==0)
			System.out.println("Proceso terminado");
		
		if (numero<0)
			System.out.println("El número no puede ser negativo, proceso terminado");
		
		
	}

}
