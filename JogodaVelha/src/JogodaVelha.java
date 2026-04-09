
public class JogodaVelha {

	public static void main(String[] args) {
		
		char[][] tabuleiro = new char[3][3];

		// Inicializar com espaços
		for (int x = 0; x < 3; x++) {
		    for (int j = 0; j < 3; j++) {
		        tabuleiro[x][j] = ' ';
		    }
		    
		    
		    
		    for (int i = 0; i < 3; i++) {
		        System.out.println(" " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
		        if (i < 2) {
		            System.out.println("---+---+---");
		        }
		    }

		}
	
	
	

	}
}
