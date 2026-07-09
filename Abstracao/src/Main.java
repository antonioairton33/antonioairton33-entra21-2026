import modelos.Mamifero;

public class Main {

	public static void main(String[] args) {
		//Animal a1 = new Animal();
		Pig p1 = new Pig();
		p1.animalSound();
		p1.sleep();
		System.out.println("ola");
		
		Mamifero m1 = new Mamifero();
		m1.animalSound();
		m1.sleep();

	}

}
