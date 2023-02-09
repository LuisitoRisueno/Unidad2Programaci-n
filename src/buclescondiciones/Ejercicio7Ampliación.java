package buclescondiciones;

import java.util.Scanner;

public class Ejercicio7Ampliación {

	public static void main(String[] args) {
		// 7. Escriba un programa que pida al usuario su nombre y 
		//contraseña y le de tres 
		//oportunidades para introducir los datos correctos, 
		//que serán root y 1234. Si los datos 
		//introducidos son correctos se mostrará por pantalla 
		//“Bienvenido al sistema”. En caso 
		//contrario se mostrará un mensaje por 
		//pantalla indicando que se ha superado el número 
		//de intentos permitido.

		String contraseña;
		String usuario; 
		int intentos=3;
		Scanner teclado=new Scanner(System.in);
		
		
		do {
			System.out.println("Dime el usuario: ");
			usuario=teclado.next();
			System.out.println("Dime la contraseña: ");
			contraseña=teclado.next();
			intentos--;
		}while((!usuario.equals("root") || !contraseña.equals("1234")) && intentos>0);
	
		if(usuario.equals("root") && contraseña.equals("1234")) {
			System.out.println("Bienvenido al sistema");
		}else {
			System.out.println("Número de intentos superados");
		}
	
	
}
}
