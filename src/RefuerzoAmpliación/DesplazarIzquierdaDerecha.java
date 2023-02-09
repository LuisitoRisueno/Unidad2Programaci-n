package RefuerzoAmpliación;

import java.util.Scanner;

public class DesplazarIzquierdaDerecha {

	public static void main(String[] args) {
		// Desplazar todos los dígitos de un número de izquierda a derecha una posición
		//Ejemplo 123 --> 312
		
		Scanner teclado=new Scanner(System.in);
		int numero;
		System.out.println("Dame un número");
		numero=teclado.nextInt();
		int cociente=numero,resto=0;
		int ultimo=numero%10;//Cifra de la unidad
		int numero2=numero/10;//Numero sin las unidades
		int cifras=0;
		
		while(cociente>=10) {
		//resto=cociente%10;
		cociente=cociente/10;
		cifras++;
			
		}
		cifras++;
		System.out.println("El último es: "+ultimo);
		System.out.println("Hay "+cifras);
		int nuevo=(int) (ultimo*Math.pow(10, cifras-1));
		System.out.println(nuevo+numero2);
	}
}