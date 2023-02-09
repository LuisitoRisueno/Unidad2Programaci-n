package RefuerzoAmpliación2;

import java.util.Scanner;

public class EstructuraCondicionales3 {

	public static void main(String[] args) {
		// 3. Escriba un programa en Java que pida un número 
		//al usuario e indique si es par o 
		//impar. En Javaaso de que sea par indicar si es o no
		//múltiplo de 3. 

		int numero=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		numero=teclado.nextInt();
		
		if (numero%2==0) {
			System.out.println(numero+" es par");
		}else {
			System.out.println(numero+" es impar");
			if (numero%3==0) {
				System.out.println(numero+" es múltiplo de 3");
			}else {
				System.out.println(numero+" no es múltiplo de 3");
			}
				
		}
		
	}

}
