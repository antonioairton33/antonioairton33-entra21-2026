import java.util.Scanner;

public class ListaExercicio1 {

	public static void main(String[] args) {
		
		//exercicio1();
		//exercicio2();
		//exercicio3();
		//exercicio4();
		
		//nivel2exercicio5();
		//nivel2exercicio6();
		//nivel2exercicio7();
		//nivel2exercicio8();
		 
	
		 //nivel3exercicio9();
		 //nivel3exercicio10();
		 //nivel3exercicio11();
		//nivel3exercicio12();
		//nivel4exercicio13();
		//nivel4exercicio14();
		//nivel4exercicio15();
		//nivel4exercicio16();
		
		//desafioexercicio17();
		desafioexercicio18();
		

	}
	
	
	static void exercicio1() {
		int x;
		x = 10;
		System.out.println("Valor: " + x);
		
	}
	
	static void exercicio2() {
		
		String nome;
		int idade;
		double altura;
		
		nome = "Antonio";
		idade = 19;
		altura = 1.80;
		
		System.out.println("Nome: " + nome + "\n"
			+ "Idade: " + idade + "\n"
			+ "Altura: " + altura
			);
		
	}
	
	static void exercicio3() {
		
		int numero1, numero2, resultado;
		
		numero1 = 10;
		numero2 = 15;
		
		resultado = numero1 + numero2;
		
		System.out.println(numero1  + "+" +numero2 + "=" + resultado);
		
	}
	
	static void exercicio4() {
		double preco;
		preco = 43.95;
		
		System.out.println("O produto custa: R$" + preco);
		
	}
	
	static void nivel2exercicio5() {
		
		Scanner entradaUser = new Scanner (System.in);
		System.out.print("Informe seu nome: ");
		
		String nome = entradaUser.nextLine();
		System.out.println("Bem vindo " + nome + "!");
		
		entradaUser.close();
		
	}
	
	static void nivel2exercicio6() {
		
		Scanner entradaUser = new Scanner (System.in);
		System.out.println("Infome sua idade: ");
		
		
		
		int idade = entradaUser.nextInt();
		idade = idade + 10;
		System.out.println("Sua idade é:" + idade);
		
		entradaUser.close();
	}
	
	
	static void nivel2exercicio7() {
		int numero1, numero2, resultado;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.println("Infome o primeiro numero: ");
		numero1 = entradaUser.nextInt();
		
		System.out.println("Infome o segundo numero: ");
		numero2 = entradaUser.nextInt();
		
		resultado = numero1 + numero2;
		
		System.out.println(numero1  + "+" + numero2 + "=" + resultado);
		entradaUser.close();
	}

	static void nivel2exercicio8() {
		float numero;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.println("Infome um numero decimal: ");
		numero = entradaUser.nextFloat();
		
		numero = numero * 2;
		System.out.println("Resultado: " + numero);
		entradaUser.close();
	}
	
	
	static void  nivel3exercicio9() {
		double produto, desconto = 0.10;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.println("Informe o valor do produto: ");
		produto = entradaUser.nextFloat();
		
		desconto = produto * desconto;
		produto = produto - desconto;
		
		System.out.println("O valor com desconto de 10%: " + produto);
		entradaUser.close();
	}
	
	static void nivel3exercicio10(){
		int base, altura, resultado;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.println("Informe a base do retangulo: ");
		base = entradaUser.nextInt();
		System.out.println("Informe a altura do retangulo: ");
		altura = entradaUser.nextInt();
		
		resultado = altura * base;
		
		System.out.println("Resultado da Area: " + resultado);
		entradaUser.close();
		
	}
	
	static void nivel3exercicio11(){
		float nota1, nota2, nota3, media;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.println("Informe a nota 1: ");
		nota1= entradaUser.nextFloat();
		System.out.println("Informe a nota 2: ");
		nota2= entradaUser.nextFloat();
		System.out.println("Informe a nota 3: ");
		nota3= entradaUser.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Sua media é: " + media);
		
		entradaUser.close();
		
	}
	
	static void nivel3exercicio12() {
		
		double salario, aumento = 1.15;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.println("Informe seu salario: ");
		salario = entradaUser.nextFloat();
		
		aumento = salario * aumento;
		
		System.out.printf("O valor com aumento de 15%%: %.2f\n", aumento);
		entradaUser.close();
	}
	
	static void nivel4exercicio13() {
		String nome;
		int idade;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.println("Informe seu nome: ");
		nome = entradaUser.nextLine();
		
		System.out.println("Informe sua idade: ");
		idade = entradaUser.nextInt();
		
		System.out.println("Olá " + nome + ", " + "você tem " + idade + " anos!" );
		entradaUser.close();
	}
	
	static void nivel4exercicio14() {
		double numero1 , numero2;
		double soma, subtracao, multiplicacao, divisao;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.println("Informe o primeiro numero: ");
		numero1 = entradaUser.nextDouble();
		
		System.out.println("Informe o segundo numero: ");
		numero2 = entradaUser.nextDouble();
		
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
		entradaUser.close();
		
	}
	
	static void nivel4exercicio15() {
		double c, resultado;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.println("Informe o graus em Celsius: ");
		c = entradaUser.nextDouble();
		
		resultado = (c * 9 / 5) + 32;
		
		System.out.println("Resultado em Fahrenheit: " + resultado);
		
		entradaUser.close();
		
	}
	
	static void nivel4exercicio16() {
		
		double horasTrabalhadas, valorHora;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.println("Informe horas trabalhadas: ");
		horasTrabalhadas = entradaUser.nextDouble();
		
		System.out.println("Informe o valor por hora: ");
		valorHora = entradaUser.nextDouble();
		
		valorHora = valorHora * horasTrabalhadas;
		
		System.out.println("Salário total: R$" + valorHora);
		entradaUser.close();
		
	}
	
	static void desafioexercicio17(){
		String nome;
		double numero1, numero2, numero3;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.println("Informe seu nome: ");
		nome = entradaUser.nextLine();
		
		System.out.println("Informe o primeiro numero: ");
		numero1 = entradaUser.nextDouble();
		System.out.println("Informe o segundo numero: ");
		numero2 = entradaUser.nextDouble();
		System.out.println("Informe o terceiro numero: ");
		numero3 = entradaUser.nextDouble();
		
		numero1 = (numero1 + numero2 + numero3 ) / 3;
		
		System.out.println(nome + " a média dos números que você pediu é : " + numero1 );
		entradaUser.close();
	}
	
	static void desafioexercicio18(){
		String nome;
		double preco, qnt;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.println("Informe o nome do produto: ");
		nome = entradaUser.nextLine();
		
		System.out.println("Informe o preço do produto: ");
		preco = entradaUser.nextDouble();
		System.out.println("Informe a quantidade: ");
		qnt = entradaUser.nextDouble();	
		
		qnt = preco * qnt;
	
		System.out.println("Produto: " + nome);
		System.out.println("O valor total da compra:" + qnt);
		
		entradaUser.close();
	}
	
	

}
