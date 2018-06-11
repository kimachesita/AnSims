
public abstract class Animal extends Thread{
	
	public String name;
	private int slugRate;
	public abstract void breakfast();
	public abstract void poo();
	public abstract void play();
	public abstract void nap();
	public abstract void lunch();
	public abstract void sleep();
	
	public Animal(String name, int slugRate) {
		System.out.println("Creating " + this.name);
		this.name = name;
		this.slugRate = slugRate;
	}
	
	private void dayLifeCycle() {
		try {
			System.out.println(this.name  + " begins day.");
			this.breakfast();
			sleep(this.slugRate);
			this.poo();
			sleep(this.slugRate);
			this.play();
			sleep(this.slugRate);
			this.nap();
			sleep(this.slugRate);
			this.lunch();
			sleep(this.slugRate);
			this.play();
			sleep(this.slugRate);
			this.sleep();
			System.out.println(this.name + " ends day.");
		} catch (InterruptedException e) {
			System.err.println(e);
		}
		
	}
	
	public void run() {
		this.dayLifeCycle();
	}
}
