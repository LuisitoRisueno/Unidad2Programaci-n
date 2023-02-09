package RefuerzoAmpliación2;

import java.util.Scanner;

public class EstructurasCondionales5 {

	public static void main(String[] args) {
		
		float entrada=7;
		int edad=0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dime la edad de la persona");
		edad=teclado.nextInt();
		
		if (edad>5 && edad<=60)
			System.out.println("El precio de la entrada es de "+entrada+"€");
		if (edad<5)
			System.out.println("El precio de la entrada es de "+(entrada*60)/100+"€");
		if (edad>60)
			System.out.println("El precio de la entrada es de "+(entrada*55)/100+"€");
		
		
		
	}
	
}
