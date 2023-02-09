package bucles;

public class Ejercicio17 {

	public static void main(String[] args) {
		//17. Diseña una aplicación que muestre 
		//las tablas de multiplicar del 1 al 10

		int n=1;
		int i=1;

		while(n<=20) {
			
			System.out.println("Tabla de multiplicar de "+n);
			i=1;
			while(i<=10) {
				System.out.println(n+" x "+i+" = "+(n*i));
				i++;
			}
			n++;
		}
	}

}
