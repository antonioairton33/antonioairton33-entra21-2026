package exercicio4;

public class Funcionario {

    private String nome;
    private double salario;
    private double salarioAntigo;

    public void cadastrar(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        salarioAntigo = salario;
        salario = salario + (salario * percentual / 100);
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário antigo: R$ " + salarioAntigo);
        System.out.println("Novo salário: R$ " + salario);
        System.out.println("Salário anual: R$ " + calcularSalarioAnual());
    }
}