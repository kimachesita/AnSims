public class Mouse extends Animal{

	private static int slugRate = 200;	
	
	
	public Mouse(String n) {
		super(n,slugRate);
		System.out.println("Creating Mouse " + n);
	}
	
}
