
public abstract class Animal extends Thread{
	
	public String name;
	private int slugRate;
	public abstract void breakfast();
	public abstract void poo();
	public abstract void play();
	public abstract void nap();
	public abstract void lunch();
	public abstract void sleep();
	public abstract void liveADay();
	
	public Animal(String name, int slugRate) {
		this.name = name;
		this.slugRate = slugRate;
	}
	
	public Animal(String name) {
		this.name = name;
		this.slugRate = 1000;
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
		return;
	}
}
