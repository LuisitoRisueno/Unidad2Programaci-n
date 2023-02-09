package bucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//8. Pedir un número N, mostrar todos los número del 1 a N
	
		int i=1;
		int n=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número");
		n=teclado.nextInt();
		
		while (i<=n) {
			System.out.print(i+" ");
			i++; //He tenido que buscarlo en internet, si no, no había manera de saber que narices hacer 
		}
		

}
}


