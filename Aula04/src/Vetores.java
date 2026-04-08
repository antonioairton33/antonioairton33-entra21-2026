import java.util.Scanner;

import javax.swing.JOptionPane;

public class Vetores {
	
	public static void main(String[] args) {
		
		/*
		String[] carros = {"Volvo", "Fiat", "Pegout"};
		System.out.println(carros[2]);
		carros [0] = "carrinhoBom";
		
		System.out.println(carros[0]);
		
		System.out.println(carros.length);
		
		System.out.println();
		
		String[] carros2 = new String[10];
		
		System.out.println("");
		
		//for indexado
		for (int x = 0; x < carros.length; x++) {
			System.out.println(x + "-> " + carros[x]);
		}
		
		System.out.println("");
		
		//while indexado
		int x = 0;
		while(x < carros.length) {
			System.out.println(x + "-> " + carros[x]);
			x++;
		}
		
		System.out.println("");
		
		//não indexado - iterativo
		for(String c : carros) {
			System.out.println(c);
			
		}	
		*/
		//exercicio1
		
		//desafioDobro();
		//desafioImpar();
		
		//int retorno = somar(10,20);
		//System.out.println(retorno);
		
		//retorno = somar(1000, 300);
		//System.out.println(retorno);
		
		double precoPizza = 150.00;
		int numeroPessoas = 10;
		
		System.out.println(dividir(precoPizza, numeroPessoas));
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
	
	static void listarArray(int[] dados) {
		for (int n : dados) {
			System.out.println(n);
		}
	}
	
	static int somar(int n1, int n2) {
		return n1 + n2;
	}
	
	static double dividir(double numero, int divisor) {
		if(divisor == 0) {
			JOptionPane.showMessageDialog(null, "Não pode divir por zero");
		}
		
		return numero / divisor;
	}
	

}


