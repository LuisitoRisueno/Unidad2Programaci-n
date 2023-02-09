package buclescondiciones;

import java.util.Scanner;

public class EjercicioA {

	public static void main(String[] args) {
	
	int primero=0;
	int contPares=0;
	int sumaImpares=0;
	int numero=0;
	
	Scanner teclado=new Scanner(System.in);
	
	System.out.println("Dame un número");
	primero=teclado.nextInt();
	
	if(primero!=2) {
		while(numero!=2) {
		if(numero%2==0) {
			contPares++;
			System.out.println("Dame otro número");
			numero=teclado.nextInt();
		}else {
			if(numero<10)
			sumaImpares+=numero;
			System.out.println("Dame otro número");
			numero=teclado.nextInt();
		}
		}
	}else {
		System.out.println("El primero número no puede ser un 2");
	}
	

	System.out.println("El número de pares introducidos fueron: "+(contPares=contPares+1));
	System.out.println("La suma de los impares menos de 10 es: "+sumaImpares);
		
	}

}
