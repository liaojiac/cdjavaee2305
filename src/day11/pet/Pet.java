package day11.pet;

public abstract class Pet {
	private String name;
	private int health;
	private int love;
	public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}
	public Pet() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public abstract void eat();

	public abstract void show();
	public abstract void hited();
	
}
