package RefuerzoAmpliación2;

import java.util.Scanner;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// 2. Escriba un programa en Java que 
		//pida dos números enteros al usuario, y determine si 
		//el primero es divisible entre el segundo. 

		
		int numero=0;
		int numero2=0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		numero=teclado.nextInt();
		System.out.println("Dame otro número");
		numero2=teclado.nextInt();
		
		if (numero%numero2==0) {
			System.out.println(numero+" es divisible entre "+numero2);
		}else {
			System.out.println(numero+" no es divisible entre "+numero2);
		}
		
		
	}

}
