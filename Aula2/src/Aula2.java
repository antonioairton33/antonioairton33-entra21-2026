import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aula2 {
	public static void main(String[] args) {
		//entradaComScanner();
		entradaComJoptionPane();
		
        
    }
	
	static void entradaComJoptionPane() {
		/*
		
		System.out.println("Entrada com joptionPane");
		
		//JOptionPane.showMessageDialog(null, "Olá mundo");
		String nome;
		nome = JOptionPane.showInputDialog("Informe seu nome: ");
		System.out.println("Olá " + nome);
		JOptionPane.showMessageDialog(null, "olá " + nome);
		
	    // Entrada da idade (vem como String)
	    //String idadeStr;
	    //idadeStr = JOptionPane.showInputDialog("Informe sua idade:");

	    // Converter String para inteiro
	    //int idade = Integer.parseInt(idadeStr);

	    //System.out.println("Idade: " + idade);
		
		/*
		
		int idade;
		String input = JOptionPane.showInputDialog(null, "Informe idade: ");
		idade = Integer.parseInt(input);
		JOptionPane.showConfirmDialog(null, "Sua idade é: " + idade);
		System.out.println("Sua idade é: " + idade);
		
		*/
		
		int numero1, numero2, resultado;
		
		JOptionPane.showMessageDialog(null, "Vamos fazer uma divisão?");
		String input = JOptionPane.showInputDialog(null, "Informe o primeiro numero: ");
		numero1 = Integer.parseInt(input);
		
		String input2 = JOptionPane.showInputDialog(null, "Informe o segundo número: ");
		numero2 = Integer.parseInt(input2);
		
		JOptionPane.showMessageDialog(null, numero1 + " dividido por ");
		
		
		
		
		
		
		
		
	}
	
	static void entradaComScanner() {
		Scanner entradaUser = new Scanner(System.in);
        
        System.out.print("Informe seu nome: ");
        String nome = entradaUser.nextLine();
        
        int idade;
        System.out.print("Informe idade: ");
        idade = entradaUser.nextInt();
        
        float altura;
        System.out.println("Informe altura: ");
        altura = entradaUser.nextFloat();
        
        System.out.println("hello " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        
	}
}