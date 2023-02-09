package bucles;

import java.util.Scanner;

public class Ejercicio8DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		int i=1;
		Scanner teclado=new Scanner(System.in);
	
		
		//Filtro para que el número sea mayor a 1
		do {
			System.out.println("Dame un número");
			numero=teclado.nextInt();
		}while(numero<=0);
		
		//Hacer que muestre por pantalla de 1 a n con Do While
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=numero);
	}

}
