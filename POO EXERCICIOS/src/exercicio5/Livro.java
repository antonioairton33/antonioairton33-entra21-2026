package exercicio5;

public class Livro {

    private String titulo;
    private String autor;
    private boolean disponivel;

    public void cadastrar(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro indisponível.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido com sucesso!");
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);

        if (disponivel) {
            System.out.println("Status: Disponível");
        } else {
            System.out.println("Status: Emprestado");
        }
    }
}