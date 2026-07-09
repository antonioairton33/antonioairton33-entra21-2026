package modelos;

import interfaces.IAnimal;

public class Pig extends Animal {

	@Override
	public void animalSound() {
		System.out.println("som do porco");	
	}
	
	@Override
	public void sleep() {
	   System.out.println("Porco dormindo");
	}
}
