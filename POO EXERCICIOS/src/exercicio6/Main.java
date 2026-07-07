package exercicio6;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.cadastrar("Onix", "Chevrolet");

        carro.acelerar(60);
        carro.exibirVelocidade();

        carro.frear(20);
        carro.exibirVelocidade();

        carro.frear(50);
        carro.exibirVelocidade();
    }
}