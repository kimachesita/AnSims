public class Bird extends Animal{

	private static int slugRate = 800;	
	
	public Bird(String n) {
		super(n,slugRate);
		System.out.println("Creating Bird " + n);
	}	
}
