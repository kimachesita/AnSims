public class Mouse extends Animal{

	private static int slugRate = 200;	
	
	
	public Mouse(String name) {
		super(name,slugRate);
		System.out.println("Creating Mouse " + name);
	}
	public void breakfast() {
		System.out.println(super.name + " the Mouse is eating breakfast...");
	}
	public void poo() {
		System.out.println(super.name + " the Mouse is doing poo...");
	}
	public void play() {
		System.out.println(super.name + " the Mouse is playing...");
	}
	public void nap() {
		System.out.println(super.name + " the Mouse is having naptime...");
	}
	public void lunch() {
		System.out.println(super.name + " the Mouse is having lunch...");
	}
	public void sleep() {
		System.out.println(super.name + " the Mouse is now sleeping...");
	}
		
}
