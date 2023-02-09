package bucles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//5. Realizar un juego para adivinar un número. 
		//Para ello generar un número N aleatorio 
		//entre 1 y 20, y luego ir pidiendo números 
		//indicando “mayor” o “menor” según sea 
		//mayor o menor con respecto a N. 
		//El proceso termina cuando el usuario acierta

		
		int secreto=(int)(1+Math.random()+20);
		int intentos=7;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dime un número entre 1 y 20");
		int numero=teclado.nextInt();
			while (secreto!=numero && intentos!=0) {
			 intentos=intentos--;
				if (secreto<numero) {
					System.out.println("Menor");
					System.out.println("Dame otro número");
				}else {
					System.out.println("Mayor");
					System.out.println("Dame otro número");
				}
					numero=teclado.nextInt();
				
			}

		System.out.println("Has ganado");		
				
}
}
