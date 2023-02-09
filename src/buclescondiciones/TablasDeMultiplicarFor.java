package buclescondiciones;

public class TablasDeMultiplicarFor {

	public static void main(String[] args) {
		// 23. Mostrar las tablas de multiplicar del 1 al 10 con For

		for(int i=1; i<=10; i++) {
			System.out.println("Tabla de multiplicar de "+i);
			for(int j=1; j<=10; j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		}
		
		}
		
	}


