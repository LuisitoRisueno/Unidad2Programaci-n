package buclescondiciones;

import java.util.Scanner;

public class SecuenciaParesMayor {

	public static void main(String[] args) {
		// Contar los números pares consecutivos y mostararlos por pantalla, se sale del bucle con un -1

	
		Scanner sc=new Scanner(System.in);
		int n=0;
		int contador=0;
		//int aux=0;
		int secuenciaMayor=0;//Mayor secuencia de pares
		
		
		while(n!=-1) {
		System.out.println("Dame un número");
		n=sc.nextInt();
		if(n%2==0) {
		contador++;
		}else {
		if(contador>secuenciaMayor) {
		secuenciaMayor=contador;
		}
		contador=0;
		}

		}
		
		if(secuenciaMayor>contador)
		System.out.println("El numero de pares consecutivos es "+secuenciaMayor);
		else
		System.out.println(contador);

	}

}






