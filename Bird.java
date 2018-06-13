public class Bird extends Animal{

	private static int slugRate = 800;	
	
	
	public Bird(String name) {
		super(name,slugRate);
		System.out.println("Creating Bird " + name);
	}
	public void breakfast() {
		System.out.println(super.name + " the Bird is eating breakfast...");
	}
	public void poo() {
		System.out.println(super.name + " the Bird is doing poo...");
	}
	public void play() {
		System.out.println(super.name + " the Bird is playing...");
	}
	public void nap() {
		System.out.println(super.name + " the Bird is having naptime...");
	}
	public void lunch() {
		System.out.println(super.name + " the Bird is having lunch...");
	}
	public void sleep() {
		System.out.println(super.name + " the Bird is now sleeping...");
	}
		
}
