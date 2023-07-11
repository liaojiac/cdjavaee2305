package day11.pet;

public class Dog extends Pet{
	private String species;

	public Dog(String name, int health, int love, String species) {
		super(name, health, love);
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	public void eat() {
		setHealth(getHealth()+8);
		setLove(getLove()+15);
		if(getHealth()>=100) {
			System.out.println(getName()+"已经快撑死啦！不要再喂了");
			setHealth(100);
			setLove(getLove()-15);
		}else {
		System.out.println(getName()+"吃骨头");}
		show();
	}
	public void catchDisk() {
		setHealth(getHealth()-10);
		setLove(getLove()+20);
		System.out.println(getName()+"去追飞盘了");
		show();
	}
	public void hited() {
		setHealth(getHealth()-20);
		setLove(getLove()-15);
		show();
	}
	public void show() {
		System.out.println("当前状态:"+getName() + "--" + getHealth() + "--" + getLove() + "--" + species);
	}
}
