package exercicio1;

public class Main {
        public static void main(String[] args) {

            Produto produto1 = new Produto();
            Produto produto2 = new Produto();

            produto1.cadastrar("Mouse", 150, 10);
            produto2.cadastrar("Bananinha", 365, 1000);

            produto1.aumentarEstoque(20);
            produto2.aumentarEstoque(20);

            produto1.diminuirEstoque(5);
            produto2.diminuirEstoque(5);

            produto1.exibirDados();
            produto2.exibirDados();y  

        }
}
