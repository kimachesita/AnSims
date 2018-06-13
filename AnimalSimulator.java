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
			
			if(input.matches("\\w*:(Dog|Cat|Mouse|Pig|Bird|Tiger)")) {
				
				String petName = input.split(":")[0];
				String petKind =  input.split(":")[1];

				
				try {
					Class<?> petClass = Class.forName(petKind);
					Animal pet = (Animal)petClass.getConstructor(new Class[] { String.class }).newInstance(petName);
					sims.zoo.addPet(pet);
				} catch ( InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
					System.out.println("Error Creating Pet");
					System.err.println(e.getMessage());
				} catch (ClassNotFoundException e) {
					System.out.println("Cannot spawn. Animal Currently extinct.");
				}
				
			}else if(input.matches("show")){
				
				sims.zoo.showAll();
				
			}else if(input.matches("<simulate>")){
				
				System.out.println("Initiating Simulation");
				sims.simulate();
				while(sims.simulationsNotFinished());
				
			}else if(input.matches("exit")) {
				
				System.out.println("Exiting Program...");
			
			}else {
				System.out.println("Cannot parse input: Format: \"Pet Name:Type\"");
				System.out.println("Type accepted: Dog, Cat, Mouse, Pig, Bird");
				System.out.println("Or type \"exit\" to Exit");
			}
			
		}while(!input.matches("exit"));
		
		scanner.close();
		sims.close();
		
	}
	
	public void simulate() {
		this.zoo.simulateADay();
	}
	
	public boolean simulationsNotFinished() {
		if(this.zoo.isSimulating())
			return true;
		else
			return false;
	}
	
	public void close() {
		this.zoo.close();
	}
	
}
