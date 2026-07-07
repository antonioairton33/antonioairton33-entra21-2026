package exercicio6;

public class Carro {

    private String modelo;
    private String marca;
    private int velocidadeAtual;

    public void cadastrar(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int velocidade) {
        velocidadeAtual += velocidade;
    }

    public void frear(int velocidade) {
        velocidadeAtual -= velocidade;

        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public void exibirVelocidade() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}
