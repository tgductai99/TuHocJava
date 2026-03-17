package tuhocjavacore.Lab.Lab08;

//Pig "implements" the Animal interface
class Pig implements IAnimal {
	public void animalSound() {
// The body of animalSound( ) is provided here
		System.out.println("The pig says: wee wee");
	}

	public void sleep() {
// The body of sleep( ) is provided here
		System.out.println("Zzz");
	}
}

class Main {
	public static void main(String[] args) {
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
	}
}