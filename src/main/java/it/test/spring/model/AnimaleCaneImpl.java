package it.test.spring.model;

public class AnimaleCaneImpl implements Animale {

	@Override
	public void mangia() {
		System.out.println("Ciao sono un cane e sto mangiando!");
		
	}

	@Override
	public void dormi() {
		System.out.println("Ciao sono un cane e sto dormendo!");
		
	}

}
