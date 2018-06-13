public class Cat extends Animal{

	private static int slugRate = 1200;	
	
	
	public Cat(String name) {
		super(name,slugRate);
		System.out.println("Creating Cat " + name);
	}
	public void breakfast() {
		System.out.println(super.name + " the Cat is eating breakfast...");
	}
	public void poo() {
		System.out.println(super.name + " the Cat is doing poo...");
	}
	public void play() {
		System.out.println(super.name + " the Cat is playing...");
	}
	public void nap() {
		System.out.println(super.name + " the Cat is having naptime...");
	}
	public void lunch() {
		System.out.println(super.name + " the Cat is having lunch...");
	}
	public void sleep() {
		System.out.println(super.name + " the Cat is now sleeping...");
	}
		
}
