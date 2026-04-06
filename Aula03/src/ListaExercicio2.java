import java.util.Scanner;

public class ListaExercicio2 {

	public static void main(String[] args) {
		
		//exercicio1();
		//exercicio2();
		//exercicio3();
		//exercicio4();
		//exercicio5();
		
		//nivel2exercicio6();
		//nivel2exercicio7();
		//nivel2exercicio8();
		//nivel2exercicio9();
		//nivel2exercicio10();
		
		//nivel3exercicio11();
		//nivel3exercicio12();
		//nivel3exercicio13();
		//nivel3exercicio14();
		//nivel3exercicio15();
		
		//nivel4exercicio16();
		//nivel4exercicio17();
		//nivel4exercicio18();
		//nivel4exercicio19();
		nivel4exercicio20();
		
		

	}
	
	static void exercicio1() {
		
		int x;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.print("Informe o numero: ");
		x = entradaUser.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Seu número é par.");
		} else {
			System.out.println("Seu número é impar.");
		}
		entradaUser.close();
	}
	
	static void exercicio2() {
		
		int x, y;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.print("Informe o primeiro numero: ");
		x = entradaUser.nextInt();
		
		System.out.print("Informe o segundo numero: ");
		y = entradaUser.nextInt();
		
		if (x > y) {
			System.out.println(x + "É maior.");
		} else {
			System.out.println(y + " É maior");
		}
		entradaUser.close();
	}
	
	static void exercicio3() {
		int x;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.print("Informe o numero: ");
		x = entradaUser.nextInt();
		
		if (x < 0) {
			System.out.println("Seu número é negativo.");
		} else if (x > 0) {
			System.out.println("Seu número é positvo");
		} else {
			System.out.println("Seu número é igual a 0");
		}
		entradaUser.close();
	
	}
	
	static void exercicio4(){
		int x;
		
		Scanner entradaUser = new Scanner (System.in);
		
		System.out.print("Informe a nota: ");
		x = entradaUser.nextInt();
		
		if (x >= 6) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
		entradaUser.close();
	
	}
	
	static void exercicio5() {
		int idade;
		
		Scanner entradaUser = new Scanner(System.in);
		
		System.out.println("Informe sua idade:");
		idade = entradaUser.nextInt();
		
		if (idade >= 16) {
			System.out.println("Você pode votar.");
		} else {
			System.out.println("Você não pode votar.");
		}
		entradaUser.close();
		
		
		
	}
	
	static void nivel2exercicio6() {
		int numero1, numero2, numero3;
		Scanner entradaUser = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		numero1 = entradaUser.nextInt();
		System.out.println("Informe o segundo numero: ");
		numero2 = entradaUser.nextInt();
		System.out.println("Informe o terceiro numero: ");
		numero3 = entradaUser.nextInt();
		
		if(numero1 > numero2) {
			if(numero1 > numero3) {
				System.out.println(numero1 + " É o maior");
			} else {
				System.out.println(numero3 + " É o maior");
			}
		} else {
			if(numero2 > numero3) {
				System.out.println(numero2 + " É o maior");
			} else {
				System.out.println(numero3 + " É o maior");
			}
			
		}
		entradaUser.close();
		
	}
	
	static void nivel2exercicio7() {
		int nota;
		
		Scanner entradaUser = new Scanner(System.in);
		
		System.out.println("Informe uma nota de 0 a 10: ");
		nota = entradaUser.nextInt();
		
		if (nota >= 0 && nota <= 4 ) {
			System.out.println("Insuficiente");
		} else if (nota >= 5 && nota <=6){
			System.out.println("Regular.");
		} else if (nota >= 7 && nota <= 8) {
			System.out.println("Bom.");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("Execelente");
		} else {
			System.out.println("Nota inválida!!!");
		}
		entradaUser.close();
		
	}
	
	static void nivel2exercicio8 () {
		int lado1, lado2, lado3;
		
		Scanner entradaUser = new Scanner(System.in);
		
		System.out.println("Informe o primeiro lado triangulo: ");
		lado1 = entradaUser.nextInt();
		System.out.println("Informe o segundo lado triangulo: ");
		lado2 = entradaUser.nextInt();
		System.out.println("Informe o terceiro lado triangulo: ");
		lado3 = entradaUser.nextInt();
		
		if (lado1 + lado2 > lado3 &&  lado1 + lado3 > lado2 && lado2 + lado3 > lado1 ) {
			System.out.println("Foma um triângulo.");
		} else {
			System.out.println("Não corresponde a um triângulo.");
		}
		entradaUser.close();
		
		
		
	}
	
	static void nivel2exercicio9 () {
		int lado1, lado2, lado3;
		
		Scanner entradaUser = new Scanner(System.in);
		
		System.out.println("Informe o primeiro lado triangulo: ");
		lado1 = entradaUser.nextInt();
		System.out.println("Informe o segundo lado triangulo: ");
		lado2 = entradaUser.nextInt();
		System.out.println("Informe o terceiro lado triangulo: ");
		lado3 = entradaUser.nextInt();
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Triângulo Equilátero.");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Triangulo Isósceles.");
		} else if (lado1 != lado2  && lado1 != lado3 && lado2 != lado3) {
			System.out.println("Triângulo Escaleno");
		} else {
			System.out.println("Não corresponde a nenhum triângulo apresentado.");
		}
		entradaUser.close();
		
		
		
	}
	
	static void nivel2exercicio10 () {
		/*Usuário: Batata
		  Senha: 54321	
		  */
		
		String usuario;
		int senha;
		
		Scanner entradaUser = new Scanner(System.in);
		
		System.out.println("Informe seu Usuário ");
		usuario = entradaUser.nextLine();
		System.out.println("Informe sua Senha: ");
		senha = entradaUser.nextInt();
	
		
		if (usuario.equals("Batata")  && senha == 54321) {
			System.out.println("Acesso permitido.");
		} else {
			System.out.println("Acesso Negado.");
		} 
		entradaUser.close();
		
		
	}
	
	static void nivel3exercicio11 () {
		Scanner entradaUser = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Informe o ano: ");
		ano = entradaUser.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println(ano + " é bissexto");
		} else {
			System.out.println(ano + " não é bissexto");
		}
		entradaUser.close();
		
		
	}
	
	static void nivel3exercicio12 () {
		Scanner entradaUser = new Scanner(System.in);
		
		int numero1, numero2;
		char operador;
		
		System.out.println("Informe o primeiro numero: ");
		numero1 = entradaUser.nextInt();
		System.out.println("Informe o segundo numero: ");
		numero2 = entradaUser.nextInt();
		System.out.println("Informe o operador (+,_,*,/): ");
		operador = entradaUser.next().charAt(0);
		
		if (operador == '+') {
			numero1 = numero1 + numero2;
			System.out.println("Resultado: " + numero1);
		} else if (operador == '-') {
			numero1 = numero1 - numero2;
			System.out.println("Resultado: " + numero1);
		} else if (operador == '*') {
			numero1 = numero1 * numero2;
			System.out.println("Resultado: " + numero1);
		} else if (operador == '/') {
			numero1 = numero1 / numero2;
			System.out.println("Resultado: " + numero1);
		} else  {
			System.out.println("Operador Inválido.");
		}
		entradaUser.close();
	}
	
	static void nivel3exercicio13() {
		Scanner entradaUser = new Scanner(System.in);
		
		double salario;
		
		System.out.println("!!! Cálculo imposto de renda !!!");
		System.out.println("Informe o salário: ");
		salario = entradaUser.nextDouble();
		
		if (salario <= 2000) {
			salario = 0;
			System.out.println("Imposto: " + salario);
		} else if (salario > 2000 && salario <= 3000) {
			salario = salario * 0.10;
			System.out.println("Imposto: " + salario);
		} else if (salario > 3000 && salario <= 5000) {
			salario = salario * 0.15;
			System.out.println("Imposto: " + salario);
		} else {
			salario = salario * 0.20;
			System.out.println("Imposto: " + salario);
		}
		entradaUser.close();
	}
	
	static void nivel3exercicio14() {
		Scanner entradaUser = new Scanner(System.in);
		
		double compra;
		
		System.out.println("Informe o valor da compra: ");
		compra = entradaUser.nextDouble();
		
		if (compra <= 100) {
			System.out.println("Valor: " + compra);
		} else if (compra > 100 && compra <= 500) {
			compra = compra - (compra * 0.10);
			System.out.println("Valor 10% desconto: " + compra);
		} else {
			compra = compra - (compra * 0.20);
			System.out.println("Valor 20% desconto: " + compra);
		}
		entradaUser.close();
	}
	
	static void nivel3exercicio15(){
		Scanner entradaUser = new Scanner(System.in);
		
		double idade;
		
		System.out.println("Informe a idade: ");
		idade = entradaUser.nextDouble();
		
		if (idade >= 0 && idade <= 12) {
			System.out.println("Criança.");
		} else if (idade >= 13 && idade <= 17) {
			System.out.println("Adolescente.");
		} else if (idade >= 18 && idade <= 59) {
			System.out.println("Adulto.");
		} else if (idade >= 60) {
			System.out.println("Idoso.");
		} else {
			System.out.println("Idade inválida.");
		}
		entradaUser.close();
	}
	
	static void nivel4exercicio16() {
		Scanner entradaUser = new Scanner(System.in);
		
		double nota1, nota2, nota3, resultado;
		
		System.out.println("Informe a primeira nota: ");
		nota1 = entradaUser.nextDouble();
		System.out.println("Informa a segunda nota: ");
		nota2 = entradaUser.nextDouble();
		System.out.println("Informe a terceira nota: ");
		nota3 = entradaUser.nextDouble();
		
		resultado = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Sua média: " + resultado);
		
		if (resultado >= 7) {
			System.out.println("Aprovado.");
		} else if (resultado > 5 && resultado <= 6) {
			System.out.println("Recuperação.");
		} else {
			System.out.println("Reprovado.");
		}	
		entradaUser.close();
	}
	
	static void nivel4exercicio17() {
		Scanner entradaUser = new Scanner(System.in);
		
		double salario, parcela, limite;
		
		System.out.println("Informe seu salário: ");
		salario = entradaUser.nextDouble();
		System.out.println("Informe o valor da parcela: ");
		parcela = entradaUser.nextDouble();
		
		limite = salario * 0.45;
		
		System.out.println("");
		System.out.println("!!! Seu limite de parcela é: R$" + limite + " !!!");
		
		if (parcela <= limite) {
			System.out.println("");
			System.out.println("Empréstimo foi aprovado!!!");
		} else {
			System.out.println("");
			System.out.println("Empréstimo foi reprovado!!!");
		}
		entradaUser.close();
	}
	
	
	static void nivel4exercicio18() {
		Scanner entradaUser = new Scanner(System.in);
		
		int numeroSecreto = 34, palpite;
		
		System.out.println("!!! TENTE ACERTAR O NÚMERO SECRETO !!!");
		System.out.println("");
		
		System.out.println("Informe seu palpite: ");
		palpite = entradaUser.nextInt();
		
		if (palpite == numeroSecreto) {
			System.out.println("Você acertou, parabéns.");
		} else if (palpite > numeroSecreto) {
			System.out.println("O número secreto é menor.");
		} else {
			System.out.println("O número secreto é maior.");
		}
		entradaUser.close();
	}
	
	static void nivel4exercicio19() {
		Scanner entradaUser = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.println("Digite seu peso: ");
		peso = entradaUser.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = entradaUser.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println("Seu IMC: " + imc);
		
		if (imc < 18.5) {
			System.out.println("Baixo peso");
		} else if (imc >= 18.5 && imc <= 24.99) {
			System.out.println("Normal");
		} else if (imc >= 25 && imc <= 29.99) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obesidade");
		}
		entradaUser.close();
	}
	
	static void nivel4exercicio20() {
		Scanner entradaUser = new Scanner(System.in);
		
		int senhaP = 2026, senha;
		
		System.out.println("Digite sua senha: ");
		senha = entradaUser.nextInt();
		
		if (senha == senhaP) {
			System.out.println("Acesso liberado!!!");
		} else {
			System.out.println("Senha incorreta. Resta 2 tentativas.");
			
			System.out.println("Digite sua senha: ");
			senha = entradaUser.nextInt();
			
			if (senha == senhaP) {
				System.out.println("Acesso liberado!!!");
			} else {
				System.out.println("Senha incorreta. Resta 1 tentativas.");
				
				System.out.println("Digite sua senha: ");
				senha = entradaUser.nextInt();
				
				if (senha == senhaP) {
					System.out.println("Acesso liberado!!!");
				} else {
					System.out.println("Acesso bloqueado!!!");
				}
				
			}
		}
		
		entradaUser.close();
		
	}

}


