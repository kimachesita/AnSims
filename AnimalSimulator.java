import java.util.Scanner;

public class AnimalSimulator {
			
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input;
		Validator validator = new Validator();
	
		do {
			System.out.print("pet to create >> ");
			input = scanner.nextLine();
			
		}while(validator.process(input) == 0);
		
		scanner.close();
		
	}
	
}
