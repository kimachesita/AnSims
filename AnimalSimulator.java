import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class AnimalSimulator {
	
	public AnimalList zoo;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input;
		
		AnimalSimulator sims = new AnimalSimulator();
		sims.zoo = new AnimalList("Personal Zoo");
		
		do {
			System.out.print("pet to create >> ");
			input = scanner.nextLine();
			
			if(input.matches("\\w*:(Dog|Cat|Mouse|Pig|Bird)")) {
				
				String petName = input.split(":")[0];
				String petKind =  input.split(":")[1];

				
				try {
					Class<?> petClass = Class.forName(petKind);
					Animal pet = (Animal)petClass.getConstructor(new Class[] { String.class }).newInstance(petName);
					sims.zoo.addPet(pet);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
					System.out.println("Error Creating Pet");
					System.err.println(e.getMessage());
				}
				
			}else if(input.matches("show")){
				
				sims.zoo.showAll();
				
			}else if(input.matches("<simulate>")){
				
				System.out.println("Initiating Simulation");
				sims.simulate();
				
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
	
	public void simulate() {
		this.zoo.simulate();
	}
}
