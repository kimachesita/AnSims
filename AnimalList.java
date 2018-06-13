import java.util.ArrayList;

public class AnimalList {
	private ArrayList<Animal> list = new ArrayList<>();
	public String listName;
	
	public AnimalList(String name) {
		this.listName = name;
	}
	
	public void addPet(Animal pet) {
		list.add(pet);
		System.out.println(pet.name + " added to " + this.listName);
	}
	
	public void showAll() {
		System.out.println("There are " + list.size() + " pets currently onboard.");
		for(Animal pet : list) {
			System.out.println("Pet: " +  pet.name + " the " + pet.getClass().getName());
		}
	}
	
	public void simulateADay() {
		for(Animal pet : list) {
			pet.simulateDay();
		}
	}
	
	public boolean isSimulating() {
		boolean simulating = false;
		for(Animal pet : list) {
			simulating = simulating || pet.isSimulating();
		}
		return simulating;
	}
	
	public void close() {
		for(Animal pet : list) {
			pet.kill();
		}
	}

}



