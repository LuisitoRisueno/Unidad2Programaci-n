package buclescondiciones;

import java.util.Scanner;

public class Ejercicio7Ampliación2 {

	public static void main(String[] args) {
		
		int numero=0;
		int c1=0, c2=0;
		int contador=0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		numero=teclado.nextInt();
		
		if(numero>9 && numero<=99) {
			System.out.println("El número es de dos cifras");
			c1=numero/10;
			c2=numero%10;
			System.out.println(c1+" y "+c2+" = "+(c1+c2));
			if(c1%2==0) 
				contador++;
			if(c2%2==0) 
				contador++;
			System.out.println("Número de pares: "+contador);
			
		}else {
			System.out.println("El número no tiene dos cifras");
		}
		

	}

}
