package bucles;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class ActividadRepasoRefuerzoCondicionales {

	public static void main(String[] args) {
	
		int cargo=0;
		int dias=0;
		int estado=0;
		float sueldo=0;
		float dietas=0;
		float sbruto=0;
		float sneto=0;
		float irpf=0;
		float retencion=0;

		Scanner teclado=new Scanner(System.in);
		
		System.out.println("**********************************");
		System.out.println("Cálculo de la nómina");
		System.out.println("**********************************");
		System.out.println("1)Programador Junior");
		System.out.println("2)Programador senior");
		System.out.println("3)Jefe de proyecto");
		System.out.println("Intorduzca el cargo del empleado:");
		cargo=teclado.nextInt();
		System.out.println("¿Cuántos días ha estado fuera visitando clientes?");
		dias=teclado.nextInt();
		System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado):");
		estado=teclado.nextInt();
		
		switch(cargo) {
			case 1:
				sueldo=950;
				break;
			case 2:
				sueldo=1200;
				break;
			case 3:
				sueldo=1600;
				break;
			default:
				System.out.println("El valor debe ser 1, 2 o 3");
		
		}
		
		dietas=dias*30;
		
		System.out.println("-------------------------");
		System.out.println("Sueldo base "+sueldo+"€");
		System.out.println("Dietas "+dias+" viajes: "+dietas+"€");
		
		sbruto=sueldo+dietas;
		
		if (estado==1) {
			irpf=25;
			retencion=(sbruto*irpf)/100;
		}else {
			irpf=20;
			retencion=(sbruto*irpf)/100;
		}
		
		System.out.println("-------------------------");
		System.out.println("Sueldo bruto "+sbruto+"€");
		System.out.println("Retención IRPF "+irpf+"€"+": "+retencion+"€");
		
		sneto=sbruto-retencion;
		
		System.out.println("-------------------------");
		System.out.println("Sueldo bruto: "+sneto+"€");
		
		
		}
		
	}


