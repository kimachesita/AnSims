import java.util.concurrent.atomic.AtomicInteger;

public abstract class Animal extends Thread{
	
	public String name;
	private int slugRate;
	private final AtomicInteger state = new AtomicInteger(0); //0- Null, 1- Running , 2 - Simulating 3- Died
	
	public abstract void breakfast();
	public abstract void poo();
	public abstract void play();
	public abstract void nap();
	public abstract void lunch();
	public abstract void sleep();
	
	
	protected Animal(String name, int slugRate) {
		this.name = name;
		this.slugRate = slugRate;
		this.state.set(1);
		this.start();
	}
	
	protected Animal(String name) {
		this.name = name;
		this.slugRate = 1000;
		this.state.set(1);
		this.start();
	}
	
	protected void simulateDay() {
		this.state.set(2);
	}
	
	public boolean isSimulating() {
		if(this.state.get() == 2) 
			return true;
		else 
			return false;
	}
	
	protected void kill() {
		this.state.set(3);
	}
	
	
	private void dayLifeCycle() {
		try {
			System.out.println(this.name + " the " + this.getClass().getName() + " begins day.");
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
			System.out.println(this.name + " the " + this.getClass().getName() + " ends day.");
		} catch (InterruptedException e) {
			System.err.println(e);
		}
	}
	
	public void run() {
		while(this.state.get() != 3) {
			if(this.state.get() == 2) {
				this.dayLifeCycle();
				this.state.set(1);
			}
			
		}
	}
}
