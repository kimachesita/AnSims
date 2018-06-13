public class Pig extends Animal{

	private static int slugRate = 1500;	
	
	
	public Pig(String name) {
		super(name,slugRate);
		System.out.println("Creating Pig " + name);
	}
	public void breakfast() {
		System.out.println(super.name + " the Pig is eating breakfast...");
	}
	public void poo() {
		System.out.println(super.name + " the Pig is doing poo...");
	}
	public void play() {
		System.out.println(super.name + " the Pig is playing...");
	}
	public void nap() {
		System.out.println(super.name + " the Pig is having naptime...");
	}
	public void lunch() {
		System.out.println(super.name + " the Pig is having lunch...");
	}
	public void sleep() {
		System.out.println(super.name + " the Pig is now sleeping...");
	}
		
}
