package day11.pet;

public class Penguin extends Pet {
	private String color;

	public Penguin(String name, int health, int love, String color) {
		super(name, health, love);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void show() {
		System.out.println("当前状态:" + getName() + "--" + getHealth() + "--" + getLove() + "--" + color);
	}

	public void eat() {
		setHealth(getHealth() + 10);
		setLove(getLove() + 12);
		System.out.println(getName() + "大口吃鱼");
		show();
	}

	public void hited() {
		setHealth(getHealth() - 15);
		setLove(getLove() - 50);
		show();
	}

	public void swim() {
		setHealth(getHealth() + 5);
		setLove(getLove() + 25);
		System.out.println(getName() + "畅快地游泳");
		show();
	}
}
