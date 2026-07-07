package exercicio4;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.cadastrar("Carlos", 3000);

        funcionario.aumentarSalario(15);

        funcionario.exibirDados();
    }
}
