package RefuerzoAmpliación;

import java.util.Scanner;

public class MediaDígitos {

	public static void main(String[] args) {
		// Calcular la media de los dígitos que contiene un número entero introducido por teclado
		// También nos piden mostrar el mayor resto
		
		int numero=0;
		int contador=0; //Contar las cifras del número
		int suma=0; //Para sumar las cifras, luego lo dividimos entre el número de las cifras y así hacemos la media
		int mayor=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame un número");
		numero=teclado.nextInt();

		//Para empezar a sacar los dígitos que forman un número, vamos a necesitar que el cociente sea igual que el número
		int cociente=numero;
		int resto=0;
		
		//Empezamos a sacar divisores
		while(cociente>=10) {
			resto=cociente%10;
			cociente=cociente/10;
			if(mayor<resto) {
				mayor=resto; //Si el resto es más grande que el "mayor", el resto pasa a ser el "mayor" 
			}
			
			contador++;
			suma+=resto;
			
		}//Aquí termina el while
		
		suma+=cociente; //Para sumar el último cociente
		contador++;//Para contar el último cociente y así contar bien las cifras que forman un número
		System.out.println("Los dígitos fueron: "+contador);

		System.out.println("La media es "+(suma/contador));
		
		System.out.println("El mayor es: "+mayor);
		
	
	}

}
