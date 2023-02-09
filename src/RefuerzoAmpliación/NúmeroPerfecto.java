package RefuerzoAmpliación;

import java.util.Scanner;

public class NúmeroPerfecto {

	public static void main(String[] args) {
		// Para que un número sea perfecto tiene que ser la suma de sus divisores

		Scanner teclado=new Scanner(System.in);
		int numero=0;
		int suma=0;
		
		System.out.println("Dame un número");
		numero=teclado.nextInt();
		
		
		//Hacemos que si al dividir el número entre i el resto es 0 se sume
		//Si el resto es 0 es que es divisor 
		
		for (int i=1; i<numero; i++) {
			if(numero%i==0) {
				suma=suma+i;
			}
		}
			
		
		//Si la suma de los divisores da como resultado el número introducido, el número será perfecto
		if (suma==numero) 
			System.out.println("El número "+numero+" es perfecto");
			
		if (suma!=numero)
			System.out.println("El número "+numero+" no es perfecto");
		
	
	}

}

