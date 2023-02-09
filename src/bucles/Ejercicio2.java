package bucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//2. Leer un número e indicar si es positivo o negativo. 
		//El proceso se repetirá hasta que se 
		//introduzca un 0
		
		int numero=1;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		while (numero!=0) {
			numero=teclado.nextInt();
			if (numero>0) {
				System.out.println("El número es positivo"); 
			}else {
				System.out.println("El número es negativo"); 
				
			}
		}
				

	}

}
