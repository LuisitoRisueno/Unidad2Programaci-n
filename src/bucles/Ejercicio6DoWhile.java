package bucles;

import java.util.Scanner;

public class Ejercicio6DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero=0;
		int suma=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		numero=teclado.nextInt();
		suma+=numero; //Lo mismo que hacer suma=suma+numero
		
		do {
			System.out.println("Dame un número");
			numero=teclado.nextInt();
			if (numero!=0) {
				
			
			suma=suma+numero; //se suma la suma anterior al número que añadimos
			}
		}while (numero!=0);
		
	System.out.println("El resultado es "+suma);
	}

}
