package RefuerzoAmpliación;

import java.util.Scanner;

public class NúmerosAfortunados {

	public static void main(String[] args) {
		// Números de la bunea suerte: 3, 7, 8 y 9
		// Mala suerte: 0, 1, 2, 4, 5 y 6
		// El número afortunado contiene más números de la buena suerte que de la mala suerte
		
		int numero=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame un núemero");
		numero=teclado.nextInt();
		int cociente=numero;
		int afortunados=0;
		int noafortunados=0;
		int resto=0;
		
		//Para dividir el número en los dígitos que lo compone, por ejemplo: 123 --> 1   2   3
		while(cociente>=10) {
			resto=cociente%10;
			cociente=cociente/10;
			
			if ((resto==3) || (resto==7) || (resto==8) || (resto==9)) {
				afortunados++;
			}else {
				noafortunados++;
			}	
		}
		
		//Último cociente, para que no se salte el último dígito del número
		if ((cociente==3) || (cociente==7) || (cociente==8) || (cociente==9)) {
			afortunados++;
		}else {
			noafortunados++;
		}
		
		System.out.println("Números afortunados: "+afortunados);
		System.out.println("Números no afortunados: "+noafortunados);
		
		
		if (afortunados>noafortunados)
			System.out.println("El número "+numero+" es afortunado");
		else
			System.out.println("El número "+numero+" no es afortunado");
		

	}

}
