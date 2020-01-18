package main;

public class VirtualPet2 {

	private int hunger = 0;
	private int thirst = 0;
	private int boredom = 0;


	public int getHunger() {
		return this.hunger;
	}

	public int getThirst() {
		return this.thirst;
	}

	public int getBoredom() {
		return this.boredom;
	}

	public void eat() {
		
		this.hunger--;
		
		if(this.hunger < 0) {
			this.hunger = 0;
		}
		
	}

	public void drink() {
		this.thirst--;
		
		if(this.thirst <0) {
			this.thirst = 0;
		}
	}

	public void play() {
		this.boredom--;
		if(this.boredom < 0) {
			this.boredom = 0;
		}
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
		
	}

	public void setThirst(int thirst) {
		this.thirst = thirst;
		
		
	}

	public void setBoredom(int boredom) {
		this.boredom = boredom;
		
	}

	public void tick() {
		
		this.hunger++;
		
	}

}