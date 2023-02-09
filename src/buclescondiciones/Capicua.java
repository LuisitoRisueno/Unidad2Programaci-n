package buclescondiciones;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		
	/*	Scanner teclado=new Scanner(System.in);
		String numero;
		System.out.println("dame un núemero");
		numero=teclado.next();
		String reves="";
		for(int i=numero.length()-1; i>=0; i--) {
			reves+=numero.charAt(i);
		}
		System.out.println(reves);
		if(reves.equals(numero)) {
			System.out.println("Es capicúa");
		}else {
			System.out.println("No es capicúa");
		} */
	
		Scanner teclado=new Scanner(System.in);
		int numero=0;
		System.out.println("Dame un número");
		numero=teclado.nextInt();
		int cociente=numero, resto=0;
		int nuevo=0;
		
		while(cociente>=10) {
			resto=cociente%10;
			cociente=cociente/10;
			System.out.println("Cociente "+cociente);
			System.out.println("Resto "+resto);
			nuevo=nuevo*10+resto;
		}

		nuevo=nuevo*10+cociente;
		System.out.println(nuevo);
		
	}

}
