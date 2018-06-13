public class Dog extends Animal{

	private static int slugRate = 700;	
	
	
	public Dog(String name) {
		super(name,slugRate);
		System.out.println("Creating Dog " + name);
	}
	public void breakfast() {
		System.out.println(super.name + " the Dog is eating breakfast...");
	}
	public void poo() {
		System.out.println(super.name + " the Dog is doing poo...");
	}
	public void play() {
		System.out.println(super.name + " the Dog is playing...");
	}
	public void nap() {
		System.out.println(super.name + " the Dog is having naptime...");
	}
	public void lunch() {
		System.out.println(super.name + " the Dog is having lunch...");
	}
	public void sleep() {
		System.out.println(super.name + " the Dog is now sleeping...");
	}
		
}
