package RefuerzoAmpliación2;

import java.util.Scanner;

public class EstructurasCondionales4 {

	public static void main(String[] args) {
		// 4. Escriba un programa en Java que pida 
		//dos números enteros al usuario, y determine 
		//cuál es mayor, el primero o el segundo. 
		//Modifíquelo para considerar también la 
		//posibilidad de que sean iguales.

		int numero1=0;
		int numero2=0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		numero1=teclado.nextInt();
		System.out.println("Dame otro número");
		numero2=teclado.nextInt();
		
		if (numero1>numero2)
			System.out.println(numero1+ " es el mayor");
		if (numero2>numero1)
			System.out.println(numero2+" es el mayor");
		if (numero1==numero2)
			System.out.println("Son iguales");
	}

}
