import java.util.Scanner;

public class AnimalSimulator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		do {
			System.out.print("pet to create >> ");
			input = scanner.nextLine();
			if(input.matches("\\w*:(Dog|Cat|Mouse|Pig|Bird)")) {
				
			}else if(input.matches("<simulate>")){
				System.out.println("Initiating Simulation");
			}else if(input.matches("exit")) {
				System.out.println("Exiting Program...");
			
			}else {
				System.out.println("Cannot parse input: Format: \"Pet Name:Type\"");
				System.out.println("Type accepted: Dog, Cat, Mouse, Pig, Bird");
				System.out.println("Or type \"exit\" to Exit");
			}
			
		}while(!input.matches("exit"));
		
		scanner.close();
		
	}
}
