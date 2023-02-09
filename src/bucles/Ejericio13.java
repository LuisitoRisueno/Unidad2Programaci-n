package bucles;

import java.util.Scanner;

public class Ejericio13 {

	public static void main(String[] args) {
		//13. Pedir 10 sueldos. Mostrar su suma 
		// y cuantos hay mayores de 1000€

		int i=1;//bucle
		float sueldo=0;
		float suma=0;//sumar todos los sueldos
		int contador=0;
		Scanner teclado=new Scanner(System.in);
		
		while (i<=10) {
			System.out.println("Dame un sueldo");
			sueldo=teclado.nextFloat();
			suma=suma+sueldo;
			if(sueldo>1000) {
				contador++;
			}//if
			i++;
		}//while
		
		//imprimir resultados
	System.out.println("Suma de los sueldos: "+suma);
	System.out.println("Sueldos mayores de 1000: "+contador);
		
		
	}

}
