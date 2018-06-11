public class Bird extends Animal{

	private static int slugRate = 800;	
	
	
	public Bird(String name) {
		super(name + " the Bird",slugRate);

	}
	public void breakfast() {
		System.out.println(super.name + " is eating breakfast...");
	}
	public void poo() {
		System.out.println(super.name + " is doing poo...");
	}
	public void play() {
		System.out.println(super.name + " is playing...");
	}
	public void nap() {
		System.out.println(super.name + " is having naptime...");
	}
	public void lunch() {
		System.out.println(super.name + " is having lunch...");
	}
	public void sleep() {
		System.out.println(super.name + " is now sleeping...");
	}
	
	public void liveADay() {
		super.start();
	}
	
}
