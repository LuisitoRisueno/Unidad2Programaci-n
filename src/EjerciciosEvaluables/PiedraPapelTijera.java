package EjerciciosEvaluables;

import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		
		int opcion=0;
		int secreto=0;
		
		Scanner Teclado=new Scanner(System.in);
		
		do {
			System.out.println("Elije un número");
			System.out.println("****************");
			System.out.println("1. Piedra");
			System.out.println("2. Papel");
			System.out.println("3. Tijera");
			System.out.println("4. Salir");
			opcion=Teclado.nextInt();
			
			//Esto es para que secreto tenga un valor 
			//aleatorio entre 1 y 3 (en este caso)
			secreto=(int)(1+Math.random()*3);
			
			switch(secreto) {
			case 1: System.out.println("\t Piedra");
				break;
			case 2: System.out.println("\t Papel");
				break;
			case 3: System.out.println("\t Tijera");
				break;
			}
			
			//Juego
			switch(opcion) {
			//Piedra
			case 1: 
				if(secreto==1) {
					System.out.println("Empate");
				}
				if(secreto==2) {
					System.out.println("Gana Máquina");
				}
				if(secreto==3) {
					System.out.println("Gana Jugador");
				}
				break;
			//Papel
			case 2:
				if(secreto==1) {
					System.out.println("Gana Jugador");
				}
				if(secreto==2) {
					System.out.println("Empate");
				}
				if(secreto==3) {
					System.out.println("Gana Máquina");
				}
				break;
			//Tijera
			case 3:
				if(secreto==1) {
					System.out.println("Gana Máquina");
				}
				if(secreto==2) {
					System.out.println("Gana Jugador");
				}
				if(secreto==3) {
					System.out.println("Empate");
				}
				break;
			}
			
		}while(opcion==1 || opcion==2 || opcion==3);
			
		if (opcion==4)
			System.out.println("Saliste del programa");
		
		
	}

}
