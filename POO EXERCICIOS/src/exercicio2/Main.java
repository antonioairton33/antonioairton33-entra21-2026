package exercicio2;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Antonio", 87654321);

        conta1.depositar(1000);
        conta1.sacar(300);
        conta1.sacar(900);
        conta1.exibirDados();

    }
    
    
}
