package RefuerzoAmpliación;

import java.util.Scanner;

public class Bucle10 {

	public static void main(String[] args) {
		// 10. Escriba un programa en Java que solicite 
		//números al usuario hasta que se hayan 
		//introducido 10 números o la suma de todos 
		//los números leídos sea mayor que 100. A 
		//continuación, mostrar un mensaje indicando 
		//qué condición se ha cumplido (es decir, si 
		//se han introducido 10 números o si su suma 
		//es mayor que 100).

		
		int numero=0;
		int i=0;
		int suma=0;
		
		Scanner teclado=new Scanner(System.in);
		
		while (i<10 && suma<=100) {
			System.out.println("Dame un número");
			numero=teclado.nextInt();
			suma+=numero;
			i++;
		}
		
		if (i==10)
			System.out.println("Se introdujeron 10 números: "+i);
		if (suma>100)
			System.out.println("La suma es mayor a 100: "+suma);
		
	}

}
