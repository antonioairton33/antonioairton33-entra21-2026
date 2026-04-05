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
		nivel2exercicio10();
		
		
		

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
		
		
	}
	
	
	
	
	
	

}
