import java.util.Scanner;

public class ofc {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		char[] tabuleiro = new char[9];
		
		char jogador = 'X';
		
		int linha, coluna;
	
			
		
		for(int x = 0 ; x < 9 ; x++) {
			tabuleiro[x] = ' ';
		}
		tabuleiroMostra(tabuleiro);
		
		
		boolean ganhou = false;
		boolean empatou = false;
		
		while(!ganhou  && !empatou) {
			
			
			System.out.println("jogador: " + jogador);
			
			System.out.println("Informe a linha para jogar: ");
			linha = pedido.nextInt();
			
			System.out.println("Informe a coluna para jogar: ");
			coluna = pedido.nextInt();
			
			jogadas(tabuleiro ,linha ,coluna, jogador);
			
			jogador = trocaJogador(jogador);
		/*
	  		      |      |     
			      |      |	   
			------|------|-----
			      |	     |     
			------|------|-----
				  |      |             
			      |      |        
			*/
		
				
			ganhou = verificaVitoria(tabuleiro);
			empatou = verificaEmpate(tabuleiro, ganhou);
				
				
			}
			if(ganhou) {
				jogador = trocaJogador(jogador);
				System.out.println("PARABÉNS JOGADOR: " + jogador + " GANHOU!!!!!!");
			} else if(empatou) {
				System.out.println("EMPATOU!!!");
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
	
	static void jogadas(char[] tabuleiro, int linha, int coluna, char jogador) {
			if(linha == 1) {
				if (coluna == 1) {
					tabuleiro[0] = jogador;
				
				} else if (coluna == 2) {
					tabuleiro[1] = jogador; 
					
				} else if (coluna == 3) {
					tabuleiro[2] = jogador; 
					
				}
				
			} else if (linha == 2) {
				if (coluna == 1) {
					tabuleiro[3] = jogador;
					
				} else if (coluna == 2) {
					tabuleiro[4] = jogador; 
					
				} else if (coluna == 3) {
					tabuleiro[5] = jogador; 
				
				}
				
			} else if (linha == 3) {
				if (coluna == 1) {
					tabuleiro[6] = jogador; 
					
				} else if (coluna == 2) {
					tabuleiro[7] = jogador; 
					
				} else if (coluna == 3) {
					tabuleiro[8] = jogador; 
					
				}
			}
			tabuleiroMostra(tabuleiro);
		}
	
	
	
	static boolean verificaVitoria(char[] tabuleiro) {
		
		for(int z = 0 ;  z < 3 ; z++) {
			int inicio = z * 3;
			
			if(tabuleiro[inicio] == tabuleiro[inicio + 1] &&
				tabuleiro[inicio + 1] == tabuleiro[inicio +2] &&
				tabuleiro[inicio]!= ' ' ) {
				
				return true;
				
			}
		}
		
		for(int y = 0 ;  y < 3 ; y++) {
			
			if(tabuleiro[y] == tabuleiro[y+3] &&
				tabuleiro[y+3] == tabuleiro[y+6] &&
				tabuleiro[y] != ' ') {
				return true;
			}
		}
		
		if (tabuleiro[0] == tabuleiro[4] && tabuleiro[4] == tabuleiro[8] && tabuleiro[0] != ' ') {
	        return true;
	    }

	    if (tabuleiro[2] == tabuleiro[4] && tabuleiro[4] == tabuleiro[6] && tabuleiro[2] != ' ') {
	        return true;
	    }
		
		
	    return false;
	}
	
	static boolean verificaEmpate(char[] tabuleiro, boolean ganhou) {
	    if (ganhou) {
	        return false;
	    }

	    for (int i = 0; i < 9; i++) {
	        if (tabuleiro[i] == ' ') {
	            return false; 
	        }
	    }

	    return true; 
	}

	static char trocaJogador(char jogador) {
		if(jogador == 'X') {
			return 'O';
		} else {
			return 'X';
		}
		
	}
}
		