package exercicio5;

public class Main {

    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.cadastrar("Dom Casmurro", "Machado de Assis");

        livro.exibirInformacoes();

        livro.emprestar();

        livro.exibirInformacoes();

        livro.devolver();

        livro.exibirInformacoes();
    }
}