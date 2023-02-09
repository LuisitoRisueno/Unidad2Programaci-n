package bucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//3. Leer números hasta que se introduzca un 0. 
		//Para cada uno indicar si es par o impar.
		
		int numero=1;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		while (numero!=0) {
			numero=teclado.nextInt();
			if (numero%2==0) 
				System.out.println("Número par");
			else 
				System.out.println("Número impar");
		}
		
	}

}
