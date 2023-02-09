package bucles;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		//19. Realizar un programa que nos pida 
		//un número n, y nos diga cuantos números hay 
		//entre 1 y n que son primos

	int numero=0;
	int i=1;
	int cont=0;
	Scanner teclado=new Scanner(System.in);
	
	
	System.out.println("Dame un número");
	numero=teclado.nextInt();
	while(i<=numero) {
		if(numero%i==0) {
			cont++;
		}
		i++;
	}
	if (cont==2) {
		System.out.println("El número "+numero+" es primo");
	}else {
		System.out.println("El número "+numero+" es compuesto");
	}
	
	}

}
