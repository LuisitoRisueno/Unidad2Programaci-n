package RefuerzoAmpliación;

import java.util.Scanner;

public class Bucle9 {

	public static void main(String[] args) {
		
		int numero=0;
		int suma=0;
		int contador=0;
		int mayor=0;
		int menor=1000000000;
		
		Scanner teclado=new Scanner(System.in);
		
	
		for (int i=0; i<10; i++) {
			System.out.println("Dame un número entero y positivo");
			numero=teclado.nextInt();
			suma+=numero;
			contador++;
			if (numero>mayor)
				mayor=numero;
			if (numero<menor)
				menor=numero;
		}
		
		
		System.out.println("Suma: "+suma);
		System.out.println("Media: "+(suma/contador));
		System.out.println("Mayor: "+mayor);
		System.out.println("Menor: "+menor);

	}

}
