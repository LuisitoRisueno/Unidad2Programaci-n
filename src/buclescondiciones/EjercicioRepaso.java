package buclescondiciones;

import java.util.Scanner;

public class EjercicioRepaso {

	public static void main(String[] args) {
		// Pedir números hasta que salga un 0 y mostrar por pantalla el número mayor y el número menor

		int numero=0;
		int mayor=0;
		int menor=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		numero=teclado.nextInt();
		
		menor=numero;
		mayor=numero;
		
		while(numero!=0) {
		
			if(mayor<numero) {
				mayor=numero;
			}
			if(menor>numero) {
				menor=numero;
			}
			
			System.out.println("Dame otro número");
			numero=teclado.nextInt();
		}//while
		
		System.out.println("Numero mayor: "+mayor);
		System.out.println("Número menor: "+menor);

}
}
