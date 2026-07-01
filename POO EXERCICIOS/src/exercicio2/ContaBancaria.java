package exercicio2;

public class ContaBancaria {
    
    private String titular;
    private int numero;
    private double saldo;
    
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void exibirDados(){
        System.out.println("Titular: " + titular);
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
    }

    public ContaBancaria(String titular, int numero){
        this.titular = titular;
        this.numero = numero;
    }

}
