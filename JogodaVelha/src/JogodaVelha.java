import java.util.Scanner;

public class JogodaVelha {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		char[] tabuleiro = new char[9];
		
		//char bolinha = 'O';
		//char xis = 'X';
		char jogador = 'X';
		
		int linha, coluna;
	
			
		
		for(int x = 0 ; x < 9 ; x++) {
			tabuleiro[x] = ' ';
		}
		
		/*
		System.out.printf("  		      |     |     \n");
		System.out.printf("		   %c  |  %c  |  %c	  \n", xis, xis, xis);
		System.out.printf("		------|-----|-----\n");
		
		System.out.printf("		   %c  |	 %c  |  %c \n", xis, xis, xis);
		System.out.printf("		------|-----|-----\n");
		System.out.printf("		   %c  |  %c  |  %c   \n", xis, xis, xis);
		System.out.println("                      |     |\n");
		*/
		
		tabuleiroMostra(tabuleiro);
		
		for(int x = 0 ; x < 9 ; x++) {
			System.out.println("Informe a linha para jogar: ");
			linha = pedido.nextInt();
			
			System.out.println("Informe a coluna para jogar: ");
			coluna = pedido.nextInt();
			
			//System.out.println("Informe o jogador (X OU O): ");
			
			
			
			if(linha == 1) {
				if (coluna == 1) {
					tabuleiro[0] = jogador;
					tabuleiroMostra(tabuleiro);
				} else if (coluna == 2) {
					tabuleiro[1] = jogador; 
					tabuleiroMostra(tabuleiro);
				} else if (coluna == 3) {
					tabuleiro[2] = jogador; 
					tabuleiroMostra(tabuleiro);
				}
				
			} else if (linha == 2) {
				if (coluna == 1) {
					tabuleiro[3] = jogador;
					tabuleiroMostra(tabuleiro);
				} else if (coluna == 2) {
					tabuleiro[4] = jogador; 
					tabuleiroMostra(tabuleiro);
				} else if (coluna == 3) {
					tabuleiro[5] = jogador; 
					tabuleiroMostra(tabuleiro);
				}
				
			} else if (linha == 3) {
				if (coluna == 1) {
					tabuleiro[6] = jogador; 
					tabuleiroMostra(tabuleiro);
				} else if (coluna == 2) {
					tabuleiro[7] = jogador; 
					tabuleiroMostra(tabuleiro);
				} else if (coluna == 3) {
					tabuleiro[8] = jogador; 
					tabuleiroMostra(tabuleiro);
				}
			}
		
		/*		
  		      |      |     
		      |      |	   
		------|------|-----
		      |	     |     
		------|------|-----
			  |      |             
		      |      |        
		*/
	

		}
		pedido.close();
		
	}
	
	static void tabuleiroMostra (char[] tabuleiro) {
		System.out.printf("  		      |     |     \n");
		System.out.printf("		   %c  |  %c  |  %c	  \n", tabuleiro[0], tabuleiro[1] ,  tabuleiro[2]);
		System.out.printf("		------|-----|-----\n");
		
		System.out.printf("		   %c  |	 %c  |  %c \n",  tabuleiro[3],  tabuleiro[4],  tabuleiro[5]);
		System.out.printf("		------|-----|-----\n");
		System.out.printf("		   %c  |  %c  |  %c   \n",  tabuleiro[6],  tabuleiro[7],  tabuleiro[8]);
		System.out.println("                      |     |\n");
	}
	
	static void verificaVitoria() {
		
	}
	
	
}	
		