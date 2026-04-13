import java.util.Scanner;

public class JogodaVelha {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		char[] tabuleiro = new char[9];
		
		//char bolinha = 'O';
		//char xis = 'X';
		char jogador = 'X';
		
		int linha, coluna, jogadas = 0;
	
			
		
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
		
		boolean ganhou = false;
		
		while(!ganhou) {
			
			
			System.out.println("jogador: " + jogador);
			
			//ganhou = verificaVitoria(tabuleiro);
			System.out.println("Informe a linha para jogar: ");
			linha = pedido.nextInt();
			
			System.out.println("Informe a coluna para jogar: ");
			coluna = pedido.nextInt();
			
			jogadas(jogadas, tabuleiro ,linha ,coluna, jogador);
			
			if(jogador == 'X') {
				jogador = 'O';
			} else {
				jogador = 'X';
			}
			
			//for(int x = 0 ; x < 9 ; x++) {
				
				
				
				
				//System.out.println("Informe o jogador (X OU O): ");
				
				
				/*
				if(jogadas < 9) {
					System.out.println("Informe a linha para jogar: ");
					linha = pedido.nextInt();
					
					System.out.println("Informe a coluna para jogar: ");
					coluna = pedido.nextInt();
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
					
					jogadas++;
				}
			*/
			/*		
	  		      |      |     
			      |      |	   
			------|------|-----
			      |	     |     
			------|------|-----
				  |      |             
			      |      |        
			*/
		
				jogadas++;
				ganhou = verificaVitoria(tabuleiro);
			}
		
			System.out.println("ganhou definitivo!!!!");
			//ganhou = verificaVitoria(tabuleiro);
			//tabuleiroMostra(tabuleiro);
			//pedido.close();
			
			//}
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
	
	static void jogadas(int jogadas, char[] tabuleiro, int linha, int coluna, char jogador) {
		if(jogadas < 9) {
			
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
			
			//jogadas++;
		}
		
	}
	
	
	
	static boolean verificaVitoria(char[] tabuleiro) {
		
		for(int z = 0 ;  z < 3 ; z++) {
			int inicio = z * 3;
			
			if(tabuleiro[inicio] == tabuleiro[inicio + 1] &&
				tabuleiro[inicio + 1] == tabuleiro[inicio +2] &&
				tabuleiro[inicio]!= ' ' ) {
				
				//System.out.println("Ganhou!!!!!!!!!");
				return true;
				
			}
		}
		
		for(int y = 0 ;  y < 3 ; y++) {
			
			if(tabuleiro[y] == tabuleiro[y+3] &&
				tabuleiro[y+3] == tabuleiro[y+6] &&
				tabuleiro[y] != ' ') {
				//System.out.println("Ganhou!!!!!!!!!");
				return true;
			}
		}
		
		if (tabuleiro[0] == tabuleiro[4] && tabuleiro[4] == tabuleiro[8] && tabuleiro[0] != ' ') {
	       // System.out.println("Ganhou!!!!!!!!!");
	        return true;
	    }

	    if (tabuleiro[2] == tabuleiro[4] && tabuleiro[4] == tabuleiro[6] && tabuleiro[2] != ' ') {
	       // System.out.println("Ganhou!!!!!!");
	        return true;
	    }
		
		
		/*if(tabuleiro[0] == tabuleiro[1] && tabuleiro[1] == tabuleiro[2]) {
			//ganhou
		} else if(tabuleiro[3] == tabuleiro[4] && tabuleiro[4] == tabuleiro[5]) {
			//ganhou
		} else if(tabuleiro[6] == tabuleiro[7] && tabuleiro[7] == tabuleiro[8]) {
			//ganhou
		} else if(tabuleiro[0] == tabuleiro[4] && tabuleiro[4] == tabuleiro[8]) {
			//ganhou
		}
	 */
	    return false;
	}
	
}	
		