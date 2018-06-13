public class Dog extends Animal{

	private static int slugRate = 700;	
	
	
	public Dog(String n) {
		super(n,slugRate);
		System.out.println("Creating Dog " + n);
	}
	
}
