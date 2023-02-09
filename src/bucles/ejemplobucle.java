package bucles;

public class ejemplobucle {

	public static void main(String[] args) {
	
		//Variable para iterar en el bucle (o así lo llama María)
		System.out.println();
		int i=0;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
		i=10;
		while(i>=0) {
			System.out.print(i+" ");
			i--;
		}
		
		//Pares del 0 al 100
		System.out.print("\n");
		i=0;
		while (i<=100) {
			System.out.print(i+" ");
			i=i+2;
		}
		
		//De 0 a 100 de 7 en 7
		System.out.println("\n0 al 100 de 7 en 7");
		i=0;
				while(i<=100) {
					System.out.print(i+" ");
					i=i+7;
				}
	}

}
