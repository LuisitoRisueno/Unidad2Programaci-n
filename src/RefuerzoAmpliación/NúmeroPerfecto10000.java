package RefuerzoAmpliación;

public class NúmeroPerfecto10000 {

	public static void main(String[] args) {
		// Números perfectos entre 1 y 10000
		
		int suma=0;
	
		for (int j=1; j<=10000; j++) {
			suma=0; //la suma de los divisores de un número (primero 1, luego 2, luego 3...)
			//De esta manera no hacemos que se estén sumando TODOS los números TODO el rato
			for (int i=1; i<j; i++) { //Determina si j es un número perfecto
				if (j%i==0) {
					suma=suma+i; //i es un divisor
				}
			}
			
			if(suma==j) {
				System.out.println("El número "+j+" es perfecto");
			}
			
			//Entre 1 y 10000 solo hay 4 números perfectos 
			
		}
		
		
	}

	
}
