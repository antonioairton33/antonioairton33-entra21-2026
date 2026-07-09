package modelos;

import interfaces.IAnimal;

public class Mamifero implements IAnimal {

	@Override
	public void animalSound() {
		System.out.println("som do mamifero");		
	}

	@Override
	public void sleep() {
		System.out.println("mamifero dormindo");			
	}

}
