package RefuerzoAmpliación2;

import java.util.Scanner;

public class EstructurasCondicionales6 {

	public static void main(String[] args) {
		// 6. Escriba un programa que solicite al usuario 
		//tres números enteros de una cifra y 
		//muestre el mensaje "acceso permitido" si los 
		//números introducidos son “1”, “2” y “3” 

		int numero1=0;
		int numero2=0;
		int numero3=0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dime el primer número");
		numero1=teclado.nextInt();
		System.out.println("Dime el segundo número");
		numero2=teclado.nextInt();
		System.out.println("Dime el tercer número");
		numero3=teclado.nextInt();
		
		if (numero1==1 && numero2==2 && numero3==3) {
			System.out.println("Acceso permitido");
		}else {
			System.out.println("Acceso no concedido");
		}
			
	}

}
