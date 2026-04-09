import java.util.Scanner;

public class ExercicioVetores {

	public static void main(String[] args) {
		
		
		//desafioDobro();
		//desafioImpar();
		//valoresInvertido();
		//marioNumero();
		//ordemCrescente();
		acimaMediaa();
		
	}

	
	static void desafioDobro() {
		int[] numeros = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for (int y = 0 ; y < numeros.length ; y++ ) {
			System.out.printf("Informe o número %d: ", y+1);
			numeros[y] = sc.nextInt();
		}
		
		System.out.println("");
		
		
		/*for (int y = 0 ; y < numeros.length ; y++ ) {
			System.out.printf("Número %d: = %d\n1", y+1, numeros[y] * 2);
		}
		*/
		
		/*for (int n : numeros) {
			System.out.println(n+n);
		}*/
		
		sc.close();
	}
	
	
	static void desafioImpar() {
		int [] numeros = new int [10];	
		int [] par = new int [10];	
		int [] impar = new int [10];	
		
		int parCont = 0, imparCont = 0;
				
		Scanner pedido = new Scanner(System.in);
		for (int x = 0 ; x < numeros.length ; x++) {
			System.out.printf("Informe o número %d: ", x+1);
			numeros[x] = pedido.nextInt();
			
			if (numeros[x] % 2 == 0) {
				par[parCont] = numeros[x];
				parCont++;
			} else {
				impar[imparCont] = numeros[x];
				imparCont++;
			}
		}
		
		System.out.printf("NÚMEROS PARES: \n");
		for (int x = 0 ; x < parCont ; x++) {
			System.out.println(par[x]);
		}
		
		System.out.printf("NÚMEROS PARES: \n");
		for (int x = 0 ; x < imparCont ; x++) {
			System.out.println(impar[x]);
		}
		pedido.close();
	}
	
	static void valoresInvertido() {
		int [] numeros = new int [10];
		
		Scanner pedido = new Scanner(System.in);
		
		for (int x = 0 ; x < numeros.length ; x++) {
			System.out.printf("Informe o número %d: ", x+1);
			numeros[x] = pedido.nextInt();
		}
		//System.out.println(numeros[1]);
		System.out.printf("Números Invertidos: \n");
		for (int y = 9 ; y >= 0 ; y--) {
				System.out.println(numeros[y]);
				pedido.close();
		}
	}
	
	static void marioNumero() {
		int [] numeros = new int [5];
		int numeroMaior = 0;
		
		Scanner pedido = new Scanner(System.in);
		
		for (int x = 0 ; x < numeros.length ; x++) {
			System.out.printf("Informe o número %d: ", x+1);
			numeros[x] = pedido.nextInt();
		}
		
		for (int y = 0 ; y < numeros.length ; y++) {
			
			if (numeroMaior < numeros[y]) {
				numeroMaior = numeros[y];
				
			}
		}
		System.out.printf("O número maior é: %d", numeroMaior);
		pedido.close();
	}
	
	static void ordemCrescente() {
		int [] numeros = new int [8];
		
		Scanner pedido = new Scanner(System.in);
		
		for (int x = 0 ; x < numeros.length ; x++) {
			System.out.printf("Informe o número %d: ", x+1);
			numeros[x] = pedido.nextInt();
		}
		
		for (int y = 0 ; y < numeros.length ; y ++) {
			int menor = y;
			
			for (int z = y + 1 ; z < numeros.length ; z++) {
				if (numeros[z] < numeros[menor]) {
					menor = z;
				}
			}
			
			int temp = numeros[y];
			numeros[y] = numeros[menor];
			numeros[menor] = temp;
		}
		
		for (int n : numeros) {
			System.out.println(n);
		}
		pedido.close();
	}
	
	static void acimaMediaa(){
		int [] numeros = new int [10];
		double media = 0;
		
		Scanner pedido = new Scanner(System.in);
		
		for (int x = 0 ; x < numeros.length ; x++) {
			System.out.printf("Informe o número %d: ", x+1);
			numeros[x] = pedido.nextInt();
			
			media = numeros[x] + media;
		}
		
		media = media / 10;
		System.out.println("media: " + media);
		System.out.println("");
		for (int x = 0 ; x < numeros.length ; x++) {
			if (numeros[x] > media) {
				System.out.println(numeros[x]);
			}
		
		}
		pedido.close();
	}	
}
